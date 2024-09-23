package com.company.entities.enemies;

import com.company.entities.heroes.Hero;

import java.util.Random;

public class Orc extends Enemy{
    public Orc(int health, int damageDealt) {
        super(health, damageDealt);
        setId("Orc");
    }
    @Override
    public void attackHero(Hero hero) {
        if(!isAlive()) {return;};
        hero.takeDamage(getDamageDealt());
        Random random = new Random();
        int doubleAttack = random.nextInt(3);
        System.out.print("Орк нанес " + getDamageDealt() + " урона герою " +  hero.getName());
        if (doubleAttack == 2){
            hero.takeDamage(getDamageDealt());
            System.out.println(", Орк атаковал героя " + hero.getName()
                    + " второй раз подряд и нанес еще " + getDamageDealt() + " урона");
            return;
        }
        System.out.println();
    }
}
