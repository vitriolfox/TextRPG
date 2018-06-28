package com.flowacademy.lib;

import com.flowacademy.PlayMain;
import com.flowacademy.models.Player.Player;
import com.flowacademy.models.Player.PlayerClasses.Barbarian;
import com.flowacademy.models.Player.PlayerClasses.Mage;
import com.flowacademy.models.Player.PlayerClasses.Paladin;
import com.flowacademy.models.Player.PlayerClasses.Thief;

import java.util.Scanner;

public class PlayerCreator {
    public static void creator(){
        Player character = null;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Barbarian   Mage   Paladin   Thief");
        System.out.println("Please enter character class:");
        String scannerEntry = scanner.next();

        if (scannerEntry.equals("Barbarian")){
            character = new Barbarian();
        } else if (scannerEntry.equals("Mage")){
            character = new Mage();
        } else if (scannerEntry.equals("Paladin")){
            character = new Paladin();
        } else if (scannerEntry.equals("Thief")){
            character = new Thief();
        }

        System.out.println("Please enter character name:");
        scannerEntry = scanner.next();
        character.setName(scannerEntry);

        PlayMain.setPlayerCharacter(character);
    }
}
