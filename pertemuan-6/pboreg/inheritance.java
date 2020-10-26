package com.pboreg;

// inheritance adalah hubungan is-a

public class inheritance {

    public static void main(String[] args){
        Hero hero1 = new Hero();
        hero1.name = "ucup";
        hero1.display();

        HeroStrength hero2 = new HeroStrength();
        hero2.name = "Dion";
        hero2.display();

        HeroIntelegent hero3 = new HeroIntelegent();
        hero3.name = "Michael";
        hero3.display();

    }
}
