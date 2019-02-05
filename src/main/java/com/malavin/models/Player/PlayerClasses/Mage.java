package com.malavin.models.Player.PlayerClasses;

import com.malavin.models.Player.Player;

public class Mage extends Player{
    protected int magic = 1;

    public Mage() {
        super.profession = "Mágus";
        super.damage = 15;
        super.defense = 5;
        super.health = 10;
    }
}
