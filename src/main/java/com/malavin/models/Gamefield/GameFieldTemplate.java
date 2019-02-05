package com.malavin.models.Gamefield;

import com.malavin.models.Item.Item;
import com.malavin.models.Npc.NpcTemplate;

public class GameFieldTemplate {
    protected int x;
    protected int y;
    protected String id;
    protected String name;
    protected String mapSign;
    protected String mapColor;
    protected String description;
    protected String farDescription;
    protected NpcTemplate npc;
    protected Item item;
    protected boolean accessable = true;
    protected String notAccessibleDescription;
    protected boolean fieldProtection;

    public GameFieldTemplate() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNotAccessibleDescription() {
        return notAccessibleDescription;
    }

    public void setNotAccessibleDescription(String notAccessibleDescription) {
        this.notAccessibleDescription = notAccessibleDescription;
    }

    public String getMapColor() {
        return mapColor;
    }

    public void setMapColor(String mapColor) {
        this.mapColor = mapColor;
    }

    public String getMapSign() {
        return mapSign;
    }

    public void setMapSign(String mapSign) {
        this.mapSign = mapSign;
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

    public boolean isFieldProtection() {
        return fieldProtection;
    }

    public void setFieldProtection(boolean fieldProtection) {
        this.fieldProtection = fieldProtection;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
