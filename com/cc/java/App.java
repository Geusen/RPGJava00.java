package com.cc.java;

public class App {

    public static void main(String[] args) {
        Player player1 = new Player(100, 120);
        
        System.out.println("Hallo Spieler, dein Leben beträgt " + player1.getMaxHp() + " Hp," + "dein Mana beträgt " + player1.getMaxMana() + " Mp");
        
    }


// private static void output(String outputStr) {
// System.out.println(outputStr);
// }

}