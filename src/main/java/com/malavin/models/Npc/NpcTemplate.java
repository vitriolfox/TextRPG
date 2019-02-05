package com.malavin.models.Npc;

import com.malavin.models.Item.Item;

public class NpcTemplate {
    protected String name;
    protected String npcSign;
    protected int health;
    protected int damage;
    protected int defense;
    protected Item item;
    protected boolean alive;
    protected String aliveDescription;
    protected String deadDescription;
    protected String farAliveDescription;
    protected String farDeadDescription;
    protected boolean hostile;

    public NpcTemplate() {
    }

    public String getNpcSign() {
        return npcSign;
    }

    public void setNpcSign(String npcSign) {
        this.npcSign = npcSign;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getDefense() {
        return defense;
    }

    public void setDefense(int defense) {
        this.defense = defense;
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public boolean isAlive() {
        return alive;
    }

    public void setAlive(boolean alive) {
        this.alive = alive;
    }

    public String getAliveDescription() {
        return aliveDescription;
    }

    public void setAliveDescription(String aliveDescription) {
        this.aliveDescription = aliveDescription;
    }

    public String getDeadDescription() {
        return deadDescription;
    }

    public void setDeadDescription(String deadDescription) {
        this.deadDescription = deadDescription;
    }

    public String getFarAliveDescription() {
        return farAliveDescription;
    }

    public void setFarAliveDescription(String farAliveDescription) {
        this.farAliveDescription = farAliveDescription;
    }

    public String getFarDeadDescription() {
        return farDeadDescription;
    }

    public void setFarDeadDescription(String farDeadDescription) {
        this.farDeadDescription = farDeadDescription;
    }

    public boolean isHostile() {
        return hostile;
    }

    public void setHostile(boolean hostile) {
        this.hostile = hostile;
    }
}
