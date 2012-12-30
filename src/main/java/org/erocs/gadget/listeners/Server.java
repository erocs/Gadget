package org.erocs.gadget.listeners;

import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.erocs.gadget.Gadget;

import org.bukkit.event.server.MapInitializeEvent;
import org.bukkit.event.server.PluginDisableEvent;
import org.bukkit.event.server.PluginEnableEvent;
import org.bukkit.event.server.RemoteServerCommandEvent;
import org.bukkit.event.server.ServerCommandEvent;
import org.bukkit.event.server.ServerListPingEvent;
import org.bukkit.event.server.ServiceRegisterEvent;
import org.bukkit.event.server.ServiceUnregisterEvent;

public class Server implements Listener {

  @EventHandler(priority = EventPriority.MONITOR, ignoreCancelled = false)
  public void onMapInitializeEvent(MapInitializeEvent event) {
    Gadget.decodeEvent(event);
  }

  @EventHandler(priority = EventPriority.MONITOR, ignoreCancelled = false)
  public void onPluginDisableEvent(PluginDisableEvent event) {
    Gadget.decodeEvent(event);
  }

  @EventHandler(priority = EventPriority.MONITOR, ignoreCancelled = false)
  public void onPluginEnableEvent(PluginEnableEvent event) {
    Gadget.decodeEvent(event);
  }

  @EventHandler(priority = EventPriority.MONITOR, ignoreCancelled = false)
  public void onRemoteServerCommandEvent(RemoteServerCommandEvent event) {
    Gadget.decodeEvent(event);
  }

  @EventHandler(priority = EventPriority.MONITOR, ignoreCancelled = false)
  public void onServerCommandEvent(ServerCommandEvent event) {
    Gadget.decodeEvent(event);
  }

  @EventHandler(priority = EventPriority.MONITOR, ignoreCancelled = false)
  public void onServerListPingEvent(ServerListPingEvent event) {
    Gadget.decodeEvent(event);
  }

  @EventHandler(priority = EventPriority.MONITOR, ignoreCancelled = false)
  public void onServiceRegisterEvent(ServiceRegisterEvent event) {
    Gadget.decodeEvent(event);
  }

  @EventHandler(priority = EventPriority.MONITOR, ignoreCancelled = false)
  public void onServiceUnregisterEvent(ServiceUnregisterEvent event) {
    Gadget.decodeEvent(event);
  }
}
