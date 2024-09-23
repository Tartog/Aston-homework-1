package com.company;

import com.company.entities.enemies.*;
import com.company.entities.heroes.*;

import java.util.ArrayList;
import java.util.Random;

public class BattleGround {
    public static void main(String[] args) {
        Zombie zombie = new Zombie(100, 15);
        Vampire vampire = new Vampire(70, 20);
        Orc orc = new Orc(50, 30);

        Warrior warrior = new Warrior("Aragorn", 20, 100);
        Mage mage = new Mage("Gandalf", 20, 100);
        Archer archer = new Archer("Legolas", 20, 100);
        Random random = new Random();
        int roundNumber = 1;
        while (zombie.isAlive() && warrior.isAlive()) {
            System.out.println("Ход " + roundNumber);
            int x = random.nextInt(2);
            if(x == 0){ warrior.attackEnemy(zombie); }
            else{ warrior.shieldStrike(zombie); }
            zombie.attackHero(warrior);
            System.out.println("У " + warrior.getName() + " " + warrior.getHealth() + " здоровья");
            System.out.println("У " + zombie.getId() + " " + zombie.getHealth() + " здоровья");
            roundNumber++;
        }
        System.out.println("**************************************************");
        roundNumber = 1;
        while (vampire.isAlive() && mage.isAlive()) {
            System.out.println("Ход " + roundNumber);
            int x = random.nextInt(2);
            if(x == 0){ mage.attackEnemy(vampire); }
            else{ mage.magicOfLight(vampire); };
            vampire.attackHero(mage);
            System.out.println("У " + mage.getName() + " " + mage.getHealth() + " здоровья");
            System.out.println("У " + vampire.getId() + " " + vampire.getHealth() + " здоровья");
            roundNumber++;
        }
        System.out.println("**************************************************");
        roundNumber = 1;
        while (orc.isAlive() && archer.isAlive()) {
            System.out.println("Ход " + roundNumber);
            int x = random.nextInt(2);
            if(x == 0){ archer.attackEnemy(orc); }
            else{ archer.powerfulShot(orc); }
            orc.attackHero(archer);
            System.out.println("У " + archer.getName() + " " + archer.getHealth() + " здоровья");
            System.out.println("У " + orc.getId() + " " + orc.getHealth() + " здоровья");
            roundNumber++;
        }
        System.out.println("**************************************************");
        roundNumber = 1;
        Vampire Dracula = new Vampire(100, 30);
        Zombie zombie1 = new Zombie(30, 5);
        Orc orc1 = new Orc(30, 5);
        ArrayList<Enemy> enemyList = new ArrayList<>();
        enemyList.add(Dracula);
        enemyList.add(zombie1);
        enemyList.add(orc1);
        Warrior warrior1 = new Warrior("Van Helsing", 40, 300);
        while ((Dracula.isAlive() || zombie1.isAlive() || orc1.isAlive()) && warrior1.isAlive()) {
            System.out.println("Ход " + roundNumber);
            int targetOfAttack = random.nextInt(enemyList.size());
            int x = random.nextInt(2);
            if(x == 0){ warrior1.attackEnemy(enemyList.get(targetOfAttack)); }
            else{ warrior1.shieldStrike(enemyList.get(targetOfAttack)); }

            if(enemyList.get(targetOfAttack).getHealth() <= 0) { enemyList.remove(targetOfAttack); }

            Dracula.attackHero(warrior1);
            zombie1.attackHero(warrior1);
            orc1.attackHero(warrior1);

            System.out.println("У " + warrior1.getName() + " " + warrior1.getHealth() + " здоровья");
            System.out.println("У " + Dracula.getId() + " " + Dracula.getHealth() + " здоровья");
            System.out.println("У " + zombie1.getId() + " " + zombie1.getHealth() + " здоровья");
            System.out.println("У " + orc1.getId() + " " + orc1.getHealth() + " здоровья");
            roundNumber++;
        }
    }
}
