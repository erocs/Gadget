package org.erocs.gadget.listeners;

import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.erocs.gadget.Gadget;

import org.bukkit.event.inventory.BrewEvent;
import org.bukkit.event.inventory.CraftItemEvent;
import org.bukkit.event.inventory.FurnaceBurnEvent;
import org.bukkit.event.inventory.FurnaceExtractEvent;
import org.bukkit.event.inventory.FurnaceSmeltEvent;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.inventory.InventoryCloseEvent;
import org.bukkit.event.inventory.InventoryEvent;
import org.bukkit.event.inventory.InventoryOpenEvent;
import org.bukkit.event.inventory.PrepareItemCraftEvent;

public class Inventory implements Listener {
/*
  public final List<Class> EVENTS = Arrays.asList(
    BrewEvent,
    CraftItemEvent,
    FurnaceBurnEvent,
    FurnaceExtractEvent,
    FurnaceSmeltEvent,
    InventoryClickEvent,
    InventoryCloseEvent,
    InventoryEvent,
    InventoryOpenEvent,
    PrepareItemCraftEvent
  );
*/

  @EventHandler(priority = EventPriority.MONITOR, ignoreCancelled = false)
  public void onBrewEvent(BrewEvent event) {
    Gadget.decodeEvent(event);
  }

  @EventHandler(priority = EventPriority.MONITOR, ignoreCancelled = false)
  public void onCraftItemEvent(CraftItemEvent event) {
    Gadget.decodeEvent(event);
  }

  @EventHandler(priority = EventPriority.MONITOR, ignoreCancelled = false)
  public void onFurnaceBurnEvent(FurnaceBurnEvent event) {
    Gadget.decodeEvent(event);
  }

  @EventHandler(priority = EventPriority.MONITOR, ignoreCancelled = false)
  public void onFurnaceExtractEvent(FurnaceExtractEvent event) {
    Gadget.decodeEvent(event);
  }

  @EventHandler(priority = EventPriority.MONITOR, ignoreCancelled = false)
  public void onFurnaceSmeltEvent(FurnaceSmeltEvent event) {
    Gadget.decodeEvent(event);
  }

  @EventHandler(priority = EventPriority.MONITOR, ignoreCancelled = false)
  public void onInventoryClickEvent(InventoryClickEvent event) {
    Gadget.decodeEvent(event);
  }

  @EventHandler(priority = EventPriority.MONITOR, ignoreCancelled = false)
  public void onInventoryCloseEvent(InventoryCloseEvent event) {
    Gadget.decodeEvent(event);
  }

  @EventHandler(priority = EventPriority.MONITOR, ignoreCancelled = false)
  public void onInventoryEvent(InventoryEvent event) {
    Gadget.decodeEvent(event);
  }

  @EventHandler(priority = EventPriority.MONITOR, ignoreCancelled = false)
  public void onInventoryOpenEvent(InventoryOpenEvent event) {
    Gadget.decodeEvent(event);
  }

  @EventHandler(priority = EventPriority.MONITOR, ignoreCancelled = false)
  public void onPrepareItemCraftEvent(PrepareItemCraftEvent event) {
    Gadget.decodeEvent(event);
  }
}
