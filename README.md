Gadget
======
A Minecraft Bukkit server plugin that allows inspection of all events that fire.

Config file settings:
- show_only_player_events: Boolean, Filters all events except those which were Player initiated
- only_show_events: String List, If defined, provides the list of events to describe, is modified by hide_events and show_only_player_events
- hide_events: String List, Excludes describing these events
- hide_methods: String List, Excludes these method names while describing the event object

Default configuration:
- show_only_player_events: true
- only_show_events:
- hide_events: PlayerAnimationEvent,PlayerMoveEvent
- hide_methods: getHandlers,getHandlerList,getEventName
