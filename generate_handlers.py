import os
import sys

# Deprecated and known non-event classes
EXCLUDE_CLASSES = [
    s.upper()
    for s in (
        'BlockPistonEvent',
        'HandlerList',
        'EventException',
        'PaintingBreakByEntityEvent',
        'PaintingBreakEvent',
        'PaintingPlaceEvent',
        'PlayerChatEvent',
        'PlayerInventoryEvent',
        'PlayerPreLoginEvent',
    )]

def GenerateListener(import_base, class_list):
  import_name = 'org.bukkit.event.{0}.'.format(import_base)
  ccc = [
      'package org.erocs.gadget.listeners;',
      '',
      'import org.bukkit.event.EventHandler;',
      'import org.bukkit.event.EventPriority;',
      'import org.bukkit.event.Listener;',
      'import org.erocs.gadget.Gadget;',
      '']
  for name in class_list:
    ccc.append('import {0}{1};'.format(import_name, name))
  ccc.extend([
      '',
      'public class {0} implements Listener {{'.format(
          import_base.capitalize()),
      ])
  for name in class_list:
    ccc.extend([
      '',
      '  @EventHandler(priority = EventPriority.MONITOR, ignoreCancelled = false)',
      '  public void on{0}({0} event) {{'.format(name),
      '    Gadget.decodeEvent(event);',
      '  }'
      ])

  ccc.extend(['}', ''])
  return '\n'.join(ccc)

def ExcludedClass(name):
  for cls_name in EXCLUDE_CLASSES:
    if cls_name == name.upper():
      return name
  return None

def EventLine(filename):
  with open(filename) as file:
    for line in file:
      if 'public ' not in line:
        continue
      if ' class ' not in line:
        continue
      if ' abstract ' in line:
        continue
      return line
  return None

def ScanBukkitDir(bukkit_src_dir, out_dir):
  for dir_name, subdir_list, file_names in os.walk(bukkit_src_dir):
    class_names = []
    for file in file_names:
      if not file.endswith('.java'):
        continue
      line = EventLine(os.path.join(dir_name, file))
      if not line:
        continue
      class_idx = line.upper().find(file[:-5].upper())
      if class_idx < 0:
        continue
      class_name = line[class_idx:class_idx+len(file)-5]
      if ExcludedClass(class_name):
        continue
      class_names.append(class_name)
    if not class_names:
      continue
    base_name = os.path.basename(dir_name)
    generated_listener = GenerateListener(
        base_name, class_names)
    out_file_name = os.path.join(
        out_dir, '{0}.java'.format(base_name.capitalize()))
    with open(out_file_name, 'w') as fout:
      fout.write(generated_listener)

def main(bukkit_src_dir, out_dir):
  real_dir = os.path.join(
      bukkit_src_dir,
      os.path.join('src', 'main', 'java', 'org', 'bukkit', 'event'))
  ScanBukkitDir(real_dir, out_dir)

if __name__ == '__main__':
  try:
    _, bukkit_src_dir, out_dir = sys.argv
    main(bukkit_src_dir, out_dir)
  except:
    print 'script.py <bukkit source dir> <output dir>'
