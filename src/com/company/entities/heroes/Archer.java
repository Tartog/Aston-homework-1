package com.company.entities.heroes;

import com.company.entities.enemies.Enemy;

public class Archer extends Hero {
    public Archer(String name, int damageDealt, int health) {
        super(name, damageDealt, health);
    }
    @Override
    public void attackEnemy(Enemy enemy){
        if(!isAlive()) {return;};
        enemy.takeDamage(getDamageDealt());
        System.out.println("Лучник " + getName() + " стреляет в " + enemy.getId()
                + " и наносит " + getDamageDealt() + " урона");
    }
    public void powerfulShot(Enemy enemy){
        if(!isAlive()) {return;};
        enemy.takeDamage(getDamageDealt() * 2);
        System.out.println("Лучник " + getName() + " стреляет мощным выстрелом в " + enemy.getId()
                + " и наносит " + getDamageDealt() * 2 + " урона");
    }
}
