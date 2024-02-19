package com.cc.java;

public class App {

    public static void main(String[] args) {
        PlayerWarrrior playerWar1 = new PlayerWarrrior(100, 200);
        
        output("Hallo Spieler,");
        output("Gesundheit: " + playerWar1.getMaxHp() + " HP.");
        output("Mana:       " + playerWar1.getMaxMana()+ " Mana");
        

        Room room1 = new Room("1");
        
        output(room1.roomSwitch("1"));
        
    }


private static void output(String outputStr) {
System.out.println(outputStr);
}

}