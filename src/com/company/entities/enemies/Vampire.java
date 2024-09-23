package com.company.entities.enemies;

import com.company.entities.heroes.Hero;

import java.util.Random;

public class Vampire extends Enemy{
    public Vampire(int health, int damageDealt) {
        super(health, damageDealt);
        setId("Vampire");
    }
    @Override
    public void attackHero(Hero hero) {
        if(!isAlive()) {return;};
        hero.takeDamage(getDamageDealt());
        Random random = new Random();
        int restoredHealth = random.nextInt(5) + 1;
        setHealth(getHealth() + restoredHealth);
        System.out.println("Вампир нанес " + getDamageDealt() + " урона герою " +  hero.getName() +
                " и восстановил себе " + restoredHealth + " здоровья");
    }
}
