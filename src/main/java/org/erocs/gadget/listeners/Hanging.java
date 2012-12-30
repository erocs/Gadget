package org.erocs.gadget.listeners;

import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.erocs.gadget.Gadget;

import org.bukkit.event.hanging.HangingBreakByEntityEvent;
import org.bukkit.event.hanging.HangingBreakEvent;
import org.bukkit.event.hanging.HangingPlaceEvent;

public class Hanging implements Listener {
/*
  public final List<Class> EVENTS = Arrays.asList(
    HangingBreakByEntityEvent,
    HangingBreakEvent,
    HangingPlaceEvent
  );
*/

  @EventHandler(priority = EventPriority.MONITOR, ignoreCancelled = false)
  public void onHangingBreakByEntityEvent(HangingBreakByEntityEvent event) {
    Gadget.decodeEvent(event);
  }

  @EventHandler(priority = EventPriority.MONITOR, ignoreCancelled = false)
  public void onHangingBreakEvent(HangingBreakEvent event) {
    Gadget.decodeEvent(event);
  }

  @EventHandler(priority = EventPriority.MONITOR, ignoreCancelled = false)
  public void onHangingPlaceEvent(HangingPlaceEvent event) {
    Gadget.decodeEvent(event);
  }
}
