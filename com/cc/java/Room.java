package com.cc.java;

public class Room {
    
    private String roomNr;
    

    public Room(String roomNr) {
        this.roomNr = roomNr;
    }


    public String getRoomNr() {
        return roomNr;
    }


    public void setRoomNr(String roomNr) {
        this.roomNr = roomNr;
    }

    public String roomSwitch(String roomNr) {
        switch (roomNr) {
          case "1":
            return "Du bist in Raum 1";
          case "2":
            return "Du bist in Raum 2";
          default:
            return "Error ROOM roomswitch";
        }
    
    
    } 
}  

