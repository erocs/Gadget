package org.erocs.gadget.listeners;

import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.erocs.gadget.Gadget;

import org.bukkit.event.enchantment.EnchantItemEvent;
import org.bukkit.event.enchantment.PrepareItemEnchantEvent;

public class Enchantment implements Listener {

  @EventHandler(priority = EventPriority.MONITOR, ignoreCancelled = false)
  public void onEnchantItemEvent(EnchantItemEvent event) {
    Gadget.decodeEvent(event);
  }

  @EventHandler(priority = EventPriority.MONITOR, ignoreCancelled = false)
  public void onPrepareItemEnchantEvent(PrepareItemEnchantEvent event) {
    Gadget.decodeEvent(event);
  }
}
