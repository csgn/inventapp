package com.inventory.app_components.app_weapons.weapon_smgs;

import com.inventory.app_components.app_weapons.weapon;


public class weapon_smg extends weapon {
    public weapon_smg(String category, String name, int[] magazine_capacity, int damage, int range_of_fire, int wait_after_shot, int reload_time, int fire_mode,  String weapon_default_image, String weapon_default_ico, String weapon_hoverable_ico) {
        super(category, name, magazine_capacity, damage, range_of_fire, wait_after_shot, reload_time, fire_mode, weapon_default_image, weapon_default_ico, weapon_hoverable_ico);
    }
}
