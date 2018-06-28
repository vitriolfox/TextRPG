package com.flowacademy.models.Gamefield;

import com.flowacademy.models.Item.Item;
import com.flowacademy.models.Npc.NpcTemplate;

public class GameFieldTemplate {
    protected int x;
    protected int y;
    protected String name;
    protected String description;
    protected String farDescription;
    protected NpcTemplate npc;
    protected Item item;
    protected boolean accessable;

    public GameFieldTemplate() {
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getFarDescription() {
        return farDescription;
    }

    public void setFarDescription(String farDescription) {
        this.farDescription = farDescription;
    }

    public NpcTemplate getNpc() {
        return npc;
    }

    public void setNpc(NpcTemplate npc) {
        this.npc = npc;
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public boolean isAccessable() {
        return accessable;
    }

    public void setAccessable(boolean accessable) {
        this.accessable = accessable;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
