package com.cc.java;

public class App {

    public static void main(String[] args) {
        PlayerWarrrior playerWar1 = new PlayerWarrrior(100, 200);
        
        output("Hallo Spieler, Gesundheit: " + playerWar1.getMaxHp() + " HP. Deine Mana: " + playerWar1.getMaxMana()+ "Mana");
    }


private static void output(String outputStr) {
System.out.println(outputStr);
}

}