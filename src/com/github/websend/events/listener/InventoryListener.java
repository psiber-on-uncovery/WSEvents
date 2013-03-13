package com.github.websend.events.listener;

import com.github.websend.Main;
import com.github.websend.events.configuration.InventoryEventsConfiguration;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.*;

public class InventoryListener implements Listener{
    InventoryEventsConfiguration config = null;

    public InventoryListener(InventoryEventsConfiguration config) {
        this.config = config;
    }
    
    public void onEvent(BrewEvent e){
        if(config.isEventEnabled(e.getEventName())){
            String[] array = {"event", e.getEventName()};
            Main.doCommand(array, "WEBSEND_EVENTS_INVENTORY");
        }
    }

    public void onEvent(CraftItemEvent e){
        if(config.isEventEnabled(e.getEventName())){
            String[] array = {"event", e.getEventName()};
            Main.doCommand(array, "WEBSEND_EVENTS_INVENTORY");
        }
    }

    public void onEvent(FurnaceBurnEvent e){
        if(config.isEventEnabled(e.getEventName())){
            String[] array = {"event", e.getEventName()};
            Main.doCommand(array, "WEBSEND_EVENTS_INVENTORY");
        }
    }

    public void onEvent(FurnaceExtractEvent e){
        if(config.isEventEnabled(e.getEventName())){
            String[] array = {"event", e.getEventName()};
            Main.doCommand(array, "WEBSEND_EVENTS_INVENTORY");
        }
    }

    public void onEvent(FurnaceSmeltEvent e){
        if(config.isEventEnabled(e.getEventName())){
            String[] array = {"event", e.getEventName()};
            Main.doCommand(array, "WEBSEND_EVENTS_INVENTORY");
        }
    }

    public void onEvent(InventoryClickEvent e){
        if(config.isEventEnabled(e.getEventName())){
            String[] array = {"event", e.getEventName()};
            Main.doCommand(array, "WEBSEND_EVENTS_INVENTORY");
        }
    }

    public void onEvent(InventoryCloseEvent e){
        if(config.isEventEnabled(e.getEventName())){
            String[] array = {"event", e.getEventName()};
            Main.doCommand(array, "WEBSEND_EVENTS_INVENTORY");
        }
    }

    public void onEvent(InventoryEvent e){
        if(config.isEventEnabled(e.getEventName())){
            String[] array = {"event", e.getEventName()};
            Main.doCommand(array, "WEBSEND_EVENTS_INVENTORY");
        }
    }

    public void onEvent(InventoryOpenEvent e){
        if(config.isEventEnabled(e.getEventName())){
            String[] array = {"event", e.getEventName()};
            Main.doCommand(array, "WEBSEND_EVENTS_INVENTORY");
        }
    }

    public void onEvent(PrepareItemCraftEvent e){
        if(config.isEventEnabled(e.getEventName())){
            String[] array = {"event", e.getEventName()};
            Main.doCommand(array, "WEBSEND_EVENTS_INVENTORY");
        }
    }
}