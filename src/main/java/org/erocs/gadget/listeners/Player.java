package org.erocs.gadget.listeners;

import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.erocs.gadget.Gadget;

import org.bukkit.event.player.AsyncPlayerChatEvent;
import org.bukkit.event.player.AsyncPlayerPreLoginEvent;
import org.bukkit.event.player.PlayerAnimationEvent;
import org.bukkit.event.player.PlayerBedEnterEvent;
import org.bukkit.event.player.PlayerBedLeaveEvent;
import org.bukkit.event.player.PlayerBucketEmptyEvent;
import org.bukkit.event.player.PlayerBucketFillEvent;
import org.bukkit.event.player.PlayerChangedWorldEvent;
import org.bukkit.event.player.PlayerChatTabCompleteEvent;
import org.bukkit.event.player.PlayerCommandPreprocessEvent;
import org.bukkit.event.player.PlayerDropItemEvent;
import org.bukkit.event.player.PlayerEggThrowEvent;
import org.bukkit.event.player.PlayerExpChangeEvent;
import org.bukkit.event.player.PlayerFishEvent;
import org.bukkit.event.player.PlayerGameModeChangeEvent;
import org.bukkit.event.player.PlayerInteractEntityEvent;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.event.player.PlayerItemBreakEvent;
import org.bukkit.event.player.PlayerItemConsumeEvent;
import org.bukkit.event.player.PlayerItemHeldEvent;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerKickEvent;
import org.bukkit.event.player.PlayerLevelChangeEvent;
import org.bukkit.event.player.PlayerLoginEvent;
import org.bukkit.event.player.PlayerMoveEvent;
import org.bukkit.event.player.PlayerPickupItemEvent;
import org.bukkit.event.player.PlayerPortalEvent;
import org.bukkit.event.player.PlayerQuitEvent;
import org.bukkit.event.player.PlayerRegisterChannelEvent;
import org.bukkit.event.player.PlayerRespawnEvent;
import org.bukkit.event.player.PlayerShearEntityEvent;
import org.bukkit.event.player.PlayerTeleportEvent;
import org.bukkit.event.player.PlayerToggleFlightEvent;
import org.bukkit.event.player.PlayerToggleSneakEvent;
import org.bukkit.event.player.PlayerToggleSprintEvent;
import org.bukkit.event.player.PlayerUnregisterChannelEvent;
import org.bukkit.event.player.PlayerVelocityEvent;

public class Player implements Listener {

  @EventHandler(priority = EventPriority.MONITOR, ignoreCancelled = false)
  public void onAsyncPlayerChatEvent(AsyncPlayerChatEvent event) {
    Gadget.decodeEvent(event);
  }

  @EventHandler(priority = EventPriority.MONITOR, ignoreCancelled = false)
  public void onAsyncPlayerPreLoginEvent(AsyncPlayerPreLoginEvent event) {
    Gadget.decodeEvent(event);
  }

  @EventHandler(priority = EventPriority.MONITOR, ignoreCancelled = false)
  public void onPlayerAnimationEvent(PlayerAnimationEvent event) {
    Gadget.decodeEvent(event);
  }

  @EventHandler(priority = EventPriority.MONITOR, ignoreCancelled = false)
  public void onPlayerBedEnterEvent(PlayerBedEnterEvent event) {
    Gadget.decodeEvent(event);
  }

  @EventHandler(priority = EventPriority.MONITOR, ignoreCancelled = false)
  public void onPlayerBedLeaveEvent(PlayerBedLeaveEvent event) {
    Gadget.decodeEvent(event);
  }

  @EventHandler(priority = EventPriority.MONITOR, ignoreCancelled = false)
  public void onPlayerBucketEmptyEvent(PlayerBucketEmptyEvent event) {
    Gadget.decodeEvent(event);
  }

  @EventHandler(priority = EventPriority.MONITOR, ignoreCancelled = false)
  public void onPlayerBucketFillEvent(PlayerBucketFillEvent event) {
    Gadget.decodeEvent(event);
  }

  @EventHandler(priority = EventPriority.MONITOR, ignoreCancelled = false)
  public void onPlayerChangedWorldEvent(PlayerChangedWorldEvent event) {
    Gadget.decodeEvent(event);
  }

  @EventHandler(priority = EventPriority.MONITOR, ignoreCancelled = false)
  public void onPlayerChatTabCompleteEvent(PlayerChatTabCompleteEvent event) {
    Gadget.decodeEvent(event);
  }

  @EventHandler(priority = EventPriority.MONITOR, ignoreCancelled = false)
  public void onPlayerCommandPreprocessEvent(PlayerCommandPreprocessEvent event) {
    Gadget.decodeEvent(event);
  }

  @EventHandler(priority = EventPriority.MONITOR, ignoreCancelled = false)
  public void onPlayerDropItemEvent(PlayerDropItemEvent event) {
    Gadget.decodeEvent(event);
  }

  @EventHandler(priority = EventPriority.MONITOR, ignoreCancelled = false)
  public void onPlayerEggThrowEvent(PlayerEggThrowEvent event) {
    Gadget.decodeEvent(event);
  }

  @EventHandler(priority = EventPriority.MONITOR, ignoreCancelled = false)
  public void onPlayerExpChangeEvent(PlayerExpChangeEvent event) {
    Gadget.decodeEvent(event);
  }

  @EventHandler(priority = EventPriority.MONITOR, ignoreCancelled = false)
  public void onPlayerFishEvent(PlayerFishEvent event) {
    Gadget.decodeEvent(event);
  }

  @EventHandler(priority = EventPriority.MONITOR, ignoreCancelled = false)
  public void onPlayerGameModeChangeEvent(PlayerGameModeChangeEvent event) {
    Gadget.decodeEvent(event);
  }

  @EventHandler(priority = EventPriority.MONITOR, ignoreCancelled = false)
  public void onPlayerInteractEntityEvent(PlayerInteractEntityEvent event) {
    Gadget.decodeEvent(event);
  }

  @EventHandler(priority = EventPriority.MONITOR, ignoreCancelled = false)
  public void onPlayerInteractEvent(PlayerInteractEvent event) {
    Gadget.decodeEvent(event);
  }

  @EventHandler(priority = EventPriority.MONITOR, ignoreCancelled = false)
  public void onPlayerItemBreakEvent(PlayerItemBreakEvent event) {
    Gadget.decodeEvent(event);
  }

  @EventHandler(priority = EventPriority.MONITOR, ignoreCancelled = false)
  public void onPlayerItemConsumeEvent(PlayerItemConsumeEvent event) {
    Gadget.decodeEvent(event);
  }

  @EventHandler(priority = EventPriority.MONITOR, ignoreCancelled = false)
  public void onPlayerItemHeldEvent(PlayerItemHeldEvent event) {
    Gadget.decodeEvent(event);
  }

  @EventHandler(priority = EventPriority.MONITOR, ignoreCancelled = false)
  public void onPlayerJoinEvent(PlayerJoinEvent event) {
    Gadget.decodeEvent(event);
  }

  @EventHandler(priority = EventPriority.MONITOR, ignoreCancelled = false)
  public void onPlayerKickEvent(PlayerKickEvent event) {
    Gadget.decodeEvent(event);
  }

  @EventHandler(priority = EventPriority.MONITOR, ignoreCancelled = false)
  public void onPlayerLevelChangeEvent(PlayerLevelChangeEvent event) {
    Gadget.decodeEvent(event);
  }

  @EventHandler(priority = EventPriority.MONITOR, ignoreCancelled = false)
  public void onPlayerLoginEvent(PlayerLoginEvent event) {
    Gadget.decodeEvent(event);
  }

  @EventHandler(priority = EventPriority.MONITOR, ignoreCancelled = false)
  public void onPlayerMoveEvent(PlayerMoveEvent event) {
    Gadget.decodeEvent(event);
  }

  @EventHandler(priority = EventPriority.MONITOR, ignoreCancelled = false)
  public void onPlayerPickupItemEvent(PlayerPickupItemEvent event) {
    Gadget.decodeEvent(event);
  }

  @EventHandler(priority = EventPriority.MONITOR, ignoreCancelled = false)
  public void onPlayerPortalEvent(PlayerPortalEvent event) {
    Gadget.decodeEvent(event);
  }

  @EventHandler(priority = EventPriority.MONITOR, ignoreCancelled = false)
  public void onPlayerQuitEvent(PlayerQuitEvent event) {
    Gadget.decodeEvent(event);
  }

  @EventHandler(priority = EventPriority.MONITOR, ignoreCancelled = false)
  public void onPlayerRegisterChannelEvent(PlayerRegisterChannelEvent event) {
    Gadget.decodeEvent(event);
  }

  @EventHandler(priority = EventPriority.MONITOR, ignoreCancelled = false)
  public void onPlayerRespawnEvent(PlayerRespawnEvent event) {
    Gadget.decodeEvent(event);
  }

  @EventHandler(priority = EventPriority.MONITOR, ignoreCancelled = false)
  public void onPlayerShearEntityEvent(PlayerShearEntityEvent event) {
    Gadget.decodeEvent(event);
  }

  @EventHandler(priority = EventPriority.MONITOR, ignoreCancelled = false)
  public void onPlayerTeleportEvent(PlayerTeleportEvent event) {
    Gadget.decodeEvent(event);
  }

  @EventHandler(priority = EventPriority.MONITOR, ignoreCancelled = false)
  public void onPlayerToggleFlightEvent(PlayerToggleFlightEvent event) {
    Gadget.decodeEvent(event);
  }

  @EventHandler(priority = EventPriority.MONITOR, ignoreCancelled = false)
  public void onPlayerToggleSneakEvent(PlayerToggleSneakEvent event) {
    Gadget.decodeEvent(event);
  }

  @EventHandler(priority = EventPriority.MONITOR, ignoreCancelled = false)
  public void onPlayerToggleSprintEvent(PlayerToggleSprintEvent event) {
    Gadget.decodeEvent(event);
  }

  @EventHandler(priority = EventPriority.MONITOR, ignoreCancelled = false)
  public void onPlayerUnregisterChannelEvent(PlayerUnregisterChannelEvent event) {
    Gadget.decodeEvent(event);
  }

  @EventHandler(priority = EventPriority.MONITOR, ignoreCancelled = false)
  public void onPlayerVelocityEvent(PlayerVelocityEvent event) {
    Gadget.decodeEvent(event);
  }
}
