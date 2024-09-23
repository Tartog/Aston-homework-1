package com.company.entities.heroes;

import com.company.entities.enemies.Enemy;

public class Warrior extends Hero {
    public Warrior(String name, int damageDealt, int health) {
        super(name, damageDealt, health);
    }
    @Override
    public void attackEnemy(Enemy enemy) {
        if(!isAlive()) {return;};
        System.out.println("Воин " + getName() + " рубит мечом " + enemy.getId()
                + " и наносит " + getDamageDealt() + " урона");
        enemy.takeDamage(getDamageDealt());
    }
    public void shieldStrike(Enemy enemy){
        if(!isAlive()) {return;};
        enemy.takeDamage(getDamageDealt() + 5);
        System.out.println("Воин " + getName() + " бьет щитом " + enemy.getId()
                + " и наносит " + (getDamageDealt() + 5) + " урона");
    }
}
