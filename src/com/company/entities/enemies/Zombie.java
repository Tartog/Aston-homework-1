package com.company.entities.enemies;

import com.company.entities.heroes.Hero;

import java.util.Random;

public class Zombie extends Enemy{
    public Zombie(int health, int damageDealt) {
        super(health, damageDealt);
        setId("Zombie");
    }
    @Override
    public void attackHero(Hero hero) {
        if(!isAlive()) {return;};
        hero.takeDamage(getDamageDealt());
        System.out.println("Зомби нанес " + getDamageDealt() + " урона герою " + hero.getName());
    }
    @Override
    public void takeDamage(int damage){
        if(damage > 0) {
            setHealth(getHealth() - damage);
            if(getHealth() <= 0){
                Random random = new Random();
                int x = random.nextInt(2);
                if(x == 1){
                    System.out.println(getId() + " возродился");
                    setHealth(20);
                }
            }
        }
    }
}
