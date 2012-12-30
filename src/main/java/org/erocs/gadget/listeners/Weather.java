package org.erocs.gadget.listeners;

import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.erocs.gadget.Gadget;

import org.bukkit.event.weather.LightningStrikeEvent;
import org.bukkit.event.weather.ThunderChangeEvent;
import org.bukkit.event.weather.WeatherChangeEvent;

public class Weather implements Listener {

  @EventHandler(priority = EventPriority.MONITOR, ignoreCancelled = false)
  public void onLightningStrikeEvent(LightningStrikeEvent event) {
    Gadget.decodeEvent(event);
  }

  @EventHandler(priority = EventPriority.MONITOR, ignoreCancelled = false)
  public void onThunderChangeEvent(ThunderChangeEvent event) {
    Gadget.decodeEvent(event);
  }

  @EventHandler(priority = EventPriority.MONITOR, ignoreCancelled = false)
  public void onWeatherChangeEvent(WeatherChangeEvent event) {
    Gadget.decodeEvent(event);
  }
}
