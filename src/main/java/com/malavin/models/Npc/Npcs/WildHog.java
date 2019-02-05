package com.malavin.models.Npc.Npcs;

import com.malavin.models.Item.Item;
import com.malavin.models.Npc.NpcTemplate;

public class WildHog extends NpcTemplate {

    public WildHog(String name, Item item, boolean alive, boolean hostile) {
        this.name = name;
        this.health = 20;
        this.damage = 5;
        this.defense = 10;
        this.item = item;
        this.aliveDescription = "Egy megtermett vadkan röfög előtted!";
        this.deadDescription = "Egy elpusztult vadkan teteme fekszik előted.";
        this.farAliveDescription = " A távolban hangos röfögést hallasz.";
        this.farDeadDescription = " A távolban egy mozdulatlan tetemet látsz.";
        this.alive = alive;
        this.hostile = hostile;
    }

    public WildHog() {
        this.name = "WildHog";
        this.health = 20;
        this.damage = 5;
        this.defense = 10;
        this.item = null;
        this.aliveDescription = "Egy megtermett vadkan röfög előtted!";
        this.deadDescription = "Egy elpusztult vadkan teteme fekszik előted.";
        this.farAliveDescription = " A távolban hangos röfögést hallasz.";
        this.farDeadDescription = " A távolban egy mozdulatlan tetemet látsz.";
        this.alive = true;
        this.hostile = false;
    }



}

