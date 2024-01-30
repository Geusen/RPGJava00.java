package com.cc.java;

public class Player {

private int maxHp;
private int maxMana;

    public Player(int maxHp, int maxMana) {
        this.maxHp = maxHp;
        this.maxMana = maxMana;
    }

    public int getMaxHp() {
        return maxHp;
    }

    public void setMaxHp(int maxHp) {
        this.maxHp = maxHp;
    }

    public int getMaxMana() {
        return maxMana;
    }

    public void setMaxMana(int maxMana) {
        this.maxMana = maxMana;
}


}
