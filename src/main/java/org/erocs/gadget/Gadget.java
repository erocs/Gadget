package org.erocs.gadget;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Logger;

import org.bukkit.configuration.ConfigurationSection;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Player;
import org.bukkit.event.Event;
import org.bukkit.event.Event;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public class Gadget extends JavaPlugin {
  private static final Logger log_ = Logger.getLogger("Gadget");
  private static Gadget plugin_ = null;

  private boolean show_only_player_events_ = true;
  private List<String> hide_methods_ = Arrays.asList(
      "getHandlers",
      "getHandlerList",
      "getEventName");
  private List<String> hide_events_ = Arrays.asList(
      "PlayerAnimationEvent",
      "PlayerMoveEvent");
  private List<String> only_show_events_ = new ArrayList<String>();

  static public Gadget getPlugin() {
    return plugin_;
  }

  static public void error(String msg) {
    log_.severe("[Gadget] " + msg);
  }

  static public void warn(String msg) {
    log_.warning("[Gadget] " + msg);
  }

  static public void info(String msg) {
    log_.info("[Gadget] " + msg);
  }

  static public List<Class<?>> getSuperClasses(Class<?> cls) {
    List<Class<?>> super_classes = new ArrayList<Class<?>>();
    Class<?> child_cls = cls.getSuperclass();
    while(child_cls != null) {
      if (child_cls.equals(Object.class)) {
        break;
      }
      super_classes.add(child_cls);
      child_cls = child_cls.getSuperclass();
    }
    return super_classes;
  }

  static public List<Class<?>> getInterfaces(Class<?> cls) {
    return Arrays.asList(cls.getInterfaces());
  }

  static public String describeObject(
      Class cls,
      List<Class<?>> super_classes,
      List<Class<?>> interfaces,
      String indent) {
    StringBuilder sb = new StringBuilder();
    sb.append(String.format("Name: %s\n", cls.getName()));
    StringBuilder sbch = new StringBuilder();
    boolean not_first = false;
    for (Class<?> child_cls : super_classes) {
      if (not_first) {
        sbch.append(", ");
      } else {
        not_first = true;
      }
      sbch.append(child_cls.getName());
    }
    if (sbch.length() > 0) {
      sb.append(String.format("%s   Inherits: %s\n", indent, sbch.toString()));
      sbch = new StringBuilder();
    }
    not_first = false;
    for (Class infa : interfaces) {
      if (not_first) {
        sbch.append(", ");
      } else {
        not_first = true;
      }
      sbch.append(infa.getName());
    }
    if (sbch.length() > 0) {
      sb.append(String.format("%s   Implements: %s\n", indent, sbch.toString()));
    }
    return sb.toString();
  }

  static public void decodeEvent(Event event) {
    getPlugin().oDecodeEvent(event);
  }

  public void oDecodeEvent(Event event) {
    boolean provides_player = false;
    Class<?> cls = event.getClass();
    String event_name = cls.getName();
    List<Class<?>> super_classes = getSuperClasses(cls);
    List<Class<?>> interfaces = getInterfaces(cls);

    StringBuilder sb = new StringBuilder();
    sb.append("Event ");
    sb.append(describeObject(cls, super_classes, interfaces, ""));

    // super_cls doesn't include cls
    super_classes.add(cls);
    for (Class<?> super_cls : super_classes) {
      for (Method m : super_cls.getDeclaredMethods()) {
        String method_name = m.getName();
        if (isHiddenMethod(method_name)) {
          continue;
        }
        Class[] parameter_types = m.getParameterTypes();
        if (parameter_types.length > 0) {
          continue;
        }
        try {
          Object retval = m.invoke(event);
          Class<?> retval_cls = retval.getClass();
          String retval_str = "";
          // TODO: Decode arrays
          if (retval instanceof String) {
            retval_str = (String)retval;
          } else if (retval instanceof Player) {
            retval_str = String.format("%s", ((Player)retval).getDisplayName());
            provides_player = true;
          } else {
            Method to_string_meth = retval_cls.getMethod("toString");
            if (to_string_meth != null) {
              retval_str = (String)to_string_meth.invoke(retval);
            }
          }
          // Newline included in describeObject output
          sb.append(String.format(" Method %s='%s' type %s",
              m.getName(),
              retval_str,
              describeObject(
                  retval_cls,
                  getSuperClasses(retval_cls),
                  getInterfaces(retval_cls),
                  " ")));
        } catch (Exception e) {
        }
      }
    }
    String display = sb.toString();
    if (shouldShowEvent(event_name) &&
        (!onlyShowPlayerEvents() || provides_player)) {
      info(sb.toString());
    }
  }

  public void onEnable() {
    registerEvents();
    loadConfiguration();
    plugin_ = this;
  }

  private void registerEvents() {
    PluginManager plugman = getServer().getPluginManager();
    plugman.registerEvents(new org.erocs.gadget.listeners.Block(), this);
    plugman.registerEvents(new org.erocs.gadget.listeners.Enchantment(), this);
    plugman.registerEvents(new org.erocs.gadget.listeners.Entity(), this);
    plugman.registerEvents(new org.erocs.gadget.listeners.Hanging(), this);
    plugman.registerEvents(new org.erocs.gadget.listeners.Inventory(), this);
    plugman.registerEvents(new org.erocs.gadget.listeners.Player(), this);
    plugman.registerEvents(new org.erocs.gadget.listeners.Server(), this);
    plugman.registerEvents(new org.erocs.gadget.listeners.Vehicle(), this);
    plugman.registerEvents(new org.erocs.gadget.listeners.Weather(), this);
    plugman.registerEvents(new org.erocs.gadget.listeners.World(), this);
  }

  private void loadConfiguration() {
    reloadConfig();
    FileConfiguration config = getConfig();
    config.options().copyDefaults(true);
    show_only_player_events_ = config.getBoolean(
        "show_only_player_events", show_only_player_events_);
    hide_methods_ = getStringList(config, "hide_methods", hide_methods_);
    hide_events_ = getStringList(config, "hide_events", hide_events_);
    only_show_events_ = getStringList(config, "only_show_events", only_show_events_);
  }

  private boolean onlyShowPlayerEvents() {
    return show_only_player_events_;
  }

  private boolean isHiddenMethod(String method_name) {
    for (String hidden_method : hide_methods_) {
      if (hidden_method.equals(method_name)) {
        return true;
      }
    }
    return false;
  }

  private boolean isHiddenEvent(String event_name) {
    for (String hidden_event : hide_events_) {
      if (hidden_event.equals(event_name)) {
        return true;
      }
    }
    return false;
  }

  private boolean isOnlyShowEvent(String event_name) {
    for (String hidden_event : only_show_events_) {
      if (hidden_event.equals(event_name)) {
        return true;
      }
    }
    return false;
  }

  private boolean shouldShowEvent(String event_name) {
    int last_dot = event_name.lastIndexOf('.');
    if (last_dot >= 0) {
      event_name = event_name.substring(last_dot + 1);
    }
    if (isHiddenEvent(event_name)) {
      return false;
    }
    if (!only_show_events_.isEmpty()) {
      return isOnlyShowEvent(event_name);
    }
    return true;
  }

  private List<String> getStringList(
          ConfigurationSection config,
          String path,
          List<String> defaults) {
    List<String> retval = config.getStringList(path);
    if (retval == null || retval.isEmpty()) {
      return defaults;
    }
    return retval;
  }
}
