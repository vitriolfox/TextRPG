package com.malavin.models.Item.Items;

import com.malavin.models.Item.Item;
import com.malavin.models.Item.ItemStatus;

public class Tusk extends Item {

    public Tusk() {
        this.name = "Tusk";
        this.description = "Hegyes agyar.";
        this.healthModifier = 0;
        this.damageModifier = 5;
        this.defenseModifier = 0;
        this.status = ItemStatus.ONFIELD;
    }




}
