package org.erocs.gadget.listeners;

import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.erocs.gadget.Gadget;

import org.bukkit.event.vehicle.VehicleBlockCollisionEvent;
import org.bukkit.event.vehicle.VehicleCreateEvent;
import org.bukkit.event.vehicle.VehicleDamageEvent;
import org.bukkit.event.vehicle.VehicleDestroyEvent;
import org.bukkit.event.vehicle.VehicleEnterEvent;
import org.bukkit.event.vehicle.VehicleEntityCollisionEvent;
import org.bukkit.event.vehicle.VehicleExitEvent;
import org.bukkit.event.vehicle.VehicleMoveEvent;
import org.bukkit.event.vehicle.VehicleUpdateEvent;

public class Vehicle implements Listener {
/*
  public final List<Class> EVENTS = Arrays.asList(
    VehicleBlockCollisionEvent,
    VehicleCreateEvent,
    VehicleDamageEvent,
    VehicleDestroyEvent,
    VehicleEnterEvent,
    VehicleEntityCollisionEvent,
    VehicleExitEvent,
    VehicleMoveEvent,
    VehicleUpdateEvent
  );
*/

  @EventHandler(priority = EventPriority.MONITOR, ignoreCancelled = false)
  public void onVehicleBlockCollisionEvent(VehicleBlockCollisionEvent event) {
    Gadget.decodeEvent(event);
  }

  @EventHandler(priority = EventPriority.MONITOR, ignoreCancelled = false)
  public void onVehicleCreateEvent(VehicleCreateEvent event) {
    Gadget.decodeEvent(event);
  }

  @EventHandler(priority = EventPriority.MONITOR, ignoreCancelled = false)
  public void onVehicleDamageEvent(VehicleDamageEvent event) {
    Gadget.decodeEvent(event);
  }

  @EventHandler(priority = EventPriority.MONITOR, ignoreCancelled = false)
  public void onVehicleDestroyEvent(VehicleDestroyEvent event) {
    Gadget.decodeEvent(event);
  }

  @EventHandler(priority = EventPriority.MONITOR, ignoreCancelled = false)
  public void onVehicleEnterEvent(VehicleEnterEvent event) {
    Gadget.decodeEvent(event);
  }

  @EventHandler(priority = EventPriority.MONITOR, ignoreCancelled = false)
  public void onVehicleEntityCollisionEvent(VehicleEntityCollisionEvent event) {
    Gadget.decodeEvent(event);
  }

  @EventHandler(priority = EventPriority.MONITOR, ignoreCancelled = false)
  public void onVehicleExitEvent(VehicleExitEvent event) {
    Gadget.decodeEvent(event);
  }

  @EventHandler(priority = EventPriority.MONITOR, ignoreCancelled = false)
  public void onVehicleMoveEvent(VehicleMoveEvent event) {
    Gadget.decodeEvent(event);
  }

  @EventHandler(priority = EventPriority.MONITOR, ignoreCancelled = false)
  public void onVehicleUpdateEvent(VehicleUpdateEvent event) {
    Gadget.decodeEvent(event);
  }
}
