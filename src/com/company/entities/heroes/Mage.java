package com.company.entities.heroes;

import com.company.entities.enemies.Enemy;

public class Mage extends Hero {
    public Mage(String name, int damageDealt, int health) {
        super(name, damageDealt, health);
    }
    @Override
    public void attackEnemy(Enemy enemy){
        if(!isAlive()) {return;};
        enemy.takeDamage(getDamageDealt());
        System.out.println("Маг " + getName() + " бьет молнией " + enemy.getId()
                + " и наносит " + getDamageDealt() + " урона");
    }
    public void magicOfLight(Enemy enemy){
        if(!isAlive()) {return;};
        enemy.takeDamage(getDamageDealt());
        setHealth(getHealth() + getDamageDealt());
        System.out.println("Маг " + getName() + " бьет магией света " + enemy.getId()
                + ", наносит " + getDamageDealt() + " урона и восстанавливает себе " + getDamageDealt() + " здоровья");
    }
}
