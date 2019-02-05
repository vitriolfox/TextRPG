package com.malavin.models.Player.PlayerClasses;

import com.malavin.PlayMain;
import com.malavin.models.Player.Player;

public class Barbarian extends Player {

    public Barbarian() {
        super.profession = "Barbár";
        super.damage = 10;
        super.defense = 7;
        super.health = 20;
    }

    public void Rage(){
        int rageDuration = PlayMain.getTurnNumber()+3;
        while (rageDuration >= PlayMain.getTurnNumber()) {
            super.damage += 10;
            super.defense -= 5;
            System.out.println("RAGING ON! RAAARRRG!");
        }
    }
}
