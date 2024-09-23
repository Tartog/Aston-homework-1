package com.company;

import com.company.entities.enemies.Vampire;
import com.company.entities.heroes.Warrior;

public class TrainingGround {
    public static void main(String[] args) {
        Warrior warrior = new Warrior("Jack", 20, 100);
        Vampire vampire = new Vampire(100, 20);
        warrior.attackEnemy(vampire);
        warrior.shieldStrike(vampire);
        vampire.attackHero(warrior);
    }
}
