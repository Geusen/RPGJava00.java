package com.cc.java;

public class PlayerWarrrior extends Player {

    
    private int maxHp;
    private int maxMana;
    
        public PlayerWarrrior(int maxHp, int maxMana) {
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


        // Achtung der Inhalt ist noch BS
        @Override
        public int player() {
           return this.maxHp / 2;
        }  
        
}
