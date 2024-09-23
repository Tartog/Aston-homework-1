package com.company.entities.heroes;

import com.company.entities.enemies.Enemy;
import com.company.entities.peculiarities.Mortal;

public abstract class Hero implements Mortal {
    private final String name;
    private int health;
    private int damageDealt;
    public Hero(String name, int damageDealt, int health) {
        this.name = name;
        this.damageDealt = damageDealt;
        this.health = health;
    }
    public String getName(){
        return name;
    }
    public int getDamageDealt(){
        return damageDealt;
    }
    public void setHealth(int health) {
        this.health = health;
    }
    public int getHealth(){
        return health;
    }
    public void takeDamage(int damage){
        if(damage > 0) {
            health -= damage;
        }
    }
    public abstract void attackEnemy(Enemy enemy);
    public boolean isAlive() {
        return health > 0;
    }
}
