package com.pboreg;

import com.terminal.Console;
// visibility  default
class Player{
    private String name;
    private static int jumlahPlayer;
    // overloading constructor
    // opsi 1:
    Player(String name){
        Player.jumlahPlayer++;
        this.name = name;
    }

    // opsi 2;
    Player(){
        Player.jumlahPlayer++;
        this.name = "player" + Player.jumlahPlayer;
    }

    void setName(String name){
        Player.jumlahPlayer++;
        this.name = name;
    }

    String getName() {
        return this.name;
    }

    void show(){
        System.out.println("Player name = " + this.name);
       // Console.log("Menggunakan Console");
       // Console.log("Player name : " + this.name);

    }
}

