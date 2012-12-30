package org.erocs.gadget;

import java.lang.IllegalAccessException;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

import org.erocs.gadget.listeners.Block;
import org.erocs.gadget.listeners.Enchantment;
import org.erocs.gadget.listeners.Entity;
import org.erocs.gadget.listeners.Hanging;
import org.erocs.gadget.listeners.Inventory;
import org.erocs.gadget.listeners.Player;
import org.erocs.gadget.listeners.Server;
import org.erocs.gadget.listeners.Vehicle;
import org.erocs.gadget.listeners.Weather;
import org.erocs.gadget.listeners.World;

import org.bukkit.event.Event;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public class Gadget extends JavaPlugin {
  private static final Logger log_ = Logger.getLogger("Gadget");

  public void onEnable() {
    PluginManager plugman = getServer().getPluginManager();
    plugman.registerEvents(new Block(), this);
    plugman.registerEvents(new Enchantment(), this);
    plugman.registerEvents(new Entity(), this);
    plugman.registerEvents(new Hanging(), this);
    plugman.registerEvents(new Inventory(), this);
    plugman.registerEvents(new Player(), this);
    plugman.registerEvents(new Server(), this);
    plugman.registerEvents(new Vehicle(), this);
    plugman.registerEvents(new Weather(), this);
    plugman.registerEvents(new World(), this);
  }

  static public void decodeEvent(Event event) {
    StringBuilder sb = new StringBuilder();
    Class cls = event.getClass();
    sb.append(String.format("Event: %s\n", cls.getName()));
    sb.append("  Inherits: ");
    List<Class> hierarchy = new ArrayList<Class>();
    Class child = event.getClass();
    boolean not_first = false;
    while(true) {
      hierarchy.add(child);
      child = child.getSuperclass();
      if (child == null) {
        break;
      }
      if (not_first) {
        sb.append(", ");
      } else {
        not_first = true;
      }
      sb.append(child.getName());
    }
    sb.append("\n");

//    for (Class c : hierarchy) {
//      for (Field field : c.getDeclaredFields()) {
//        try {
//          sb.append(String.format("  Field %s: %s\n",
//              field.getName(),
//              field.get(event).getClass().getName()));
//        } catch(IllegalAccessException e) {
//        }
//      }
//    }

    log_.info("[Gadget] " + sb.toString());
  }
}
