package com.pboreg;

//membuat class abstract
abstract class Hewan{
    // membuat method abstract
    public abstract void suaraHewan();

    // regular method
    public void tidur(){
        System.out.println("Zzzz....");
    }
}

// inhertance turunan dari class abstract hewan
class Ayam extends Hewan{
    // regular method
    public void suaraHewan(){
        // body abstract methd suara hewan
        System.out.println("Kuuuuuuukuuuuruuuyuuuuk....");
    }
}

// inheritance class abstract hewan
class Kucing extends Hewan{
    @Override
    public void suaraHewan(){
        System.out.println("Meong... Meong...");
    }
}
public class Main {
    public static void main (String[] args){
        // membuat object ayam
        Ayam ayamku = new Ayam();
        ayamku.suaraHewan();
        ayamku.tidur();
        // membuat object kucing
        Kucing kucingku = new Kucing();
        kucingku.suaraHewan();
        kucingku.tidur();
    }
}
