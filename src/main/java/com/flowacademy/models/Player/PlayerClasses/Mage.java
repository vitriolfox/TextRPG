package com.flowacademy.models.Player.PlayerClasses;

import com.flowacademy.models.Player.Player;

public class Mage extends Player{
    protected int magic = 1;

    public Mage() {
        super.profession = "Mágus";
        super.damage = 15;
        super.defense = 5;
        super.health = 10;
    }
}
