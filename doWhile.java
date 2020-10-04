package com.pboreg;

public class doWhile {

    public static void main(String[] args) {

//        do {
//            aksi
//        } while (kondisi);
        int a=0;
        boolean kondisi = true;

        System.out.println("Ini adalah awal program");
        do {
            a++;
            System.out.println("do while ke-"+a);
            if (a == 10){
                kondisi = false;
            }
        } while (kondisi);
        System.out.println("Ini adalah akhir program");
    }
}
