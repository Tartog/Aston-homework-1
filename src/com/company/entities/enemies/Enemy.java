package com.company.entities.enemies;

import com.company.entities.heroes.Hero;
import com.company.entities.peculiarities.Mortal;

public abstract class Enemy implements Mortal {
    private int health;
    private int damageDealt;
    private String id;
    public Enemy(int health, int damageDealt){
        this.health = health;
        this.damageDealt = damageDealt;
    }
    public void setHealth(int health){
        this.health = health;
    }
    public int getHealth(){
        return health;
    }
    public void setId(String id){
        this.id = id;
    }
    public String getId(){
        return id;
    }
    public int getDamageDealt(){
        return damageDealt;
    }
    public void takeDamage(int damage){
        if(damage > 0) {
            health -= damage;
        }
    }
    public abstract void attackHero(Hero hero);
    @Override
    public boolean isAlive() {
        return health > 0;
    }
}
