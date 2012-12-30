package org.erocs.gadget.listeners;

import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.erocs.gadget.Gadget;

import org.bukkit.event.world.ChunkLoadEvent;
import org.bukkit.event.world.ChunkPopulateEvent;
import org.bukkit.event.world.ChunkUnloadEvent;
import org.bukkit.event.world.PortalCreateEvent;
import org.bukkit.event.world.SpawnChangeEvent;
import org.bukkit.event.world.StructureGrowEvent;
import org.bukkit.event.world.WorldInitEvent;
import org.bukkit.event.world.WorldLoadEvent;
import org.bukkit.event.world.WorldSaveEvent;
import org.bukkit.event.world.WorldUnloadEvent;

public class World implements Listener {

  @EventHandler(priority = EventPriority.MONITOR, ignoreCancelled = false)
  public void onChunkLoadEvent(ChunkLoadEvent event) {
    Gadget.decodeEvent(event);
  }

  @EventHandler(priority = EventPriority.MONITOR, ignoreCancelled = false)
  public void onChunkPopulateEvent(ChunkPopulateEvent event) {
    Gadget.decodeEvent(event);
  }

  @EventHandler(priority = EventPriority.MONITOR, ignoreCancelled = false)
  public void onChunkUnloadEvent(ChunkUnloadEvent event) {
    Gadget.decodeEvent(event);
  }

  @EventHandler(priority = EventPriority.MONITOR, ignoreCancelled = false)
  public void onPortalCreateEvent(PortalCreateEvent event) {
    Gadget.decodeEvent(event);
  }

  @EventHandler(priority = EventPriority.MONITOR, ignoreCancelled = false)
  public void onSpawnChangeEvent(SpawnChangeEvent event) {
    Gadget.decodeEvent(event);
  }

  @EventHandler(priority = EventPriority.MONITOR, ignoreCancelled = false)
  public void onStructureGrowEvent(StructureGrowEvent event) {
    Gadget.decodeEvent(event);
  }

  @EventHandler(priority = EventPriority.MONITOR, ignoreCancelled = false)
  public void onWorldInitEvent(WorldInitEvent event) {
    Gadget.decodeEvent(event);
  }

  @EventHandler(priority = EventPriority.MONITOR, ignoreCancelled = false)
  public void onWorldLoadEvent(WorldLoadEvent event) {
    Gadget.decodeEvent(event);
  }

  @EventHandler(priority = EventPriority.MONITOR, ignoreCancelled = false)
  public void onWorldSaveEvent(WorldSaveEvent event) {
    Gadget.decodeEvent(event);
  }

  @EventHandler(priority = EventPriority.MONITOR, ignoreCancelled = false)
  public void onWorldUnloadEvent(WorldUnloadEvent event) {
    Gadget.decodeEvent(event);
  }
}
