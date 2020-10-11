package com.pboreg;

public class ifElseIfStatement {

    public static void main(String[] args){

        // tutorial if else if statement

        int a = 5;

        System.out.println("Ini adalah awal program");
        //if else statement
        /*
        if else if memungkinkan program untuk memiliki syarat kondisi lebih dari satus
         */
        if(a == 5){
            System.out.println("Ini adalah aksi 1");
            //jika syarat kondisi sudah terpenuhi, maka kondisi lain tidak akan di eksekusi
        } else if(a == 10){
            System.out.println("Ini adalah aksi 2");
        } else {
            System.out.println("Ini adalah aksi default");
        }

        // akhir dari if else if statement
        System.out.println("Ini adalah akhir program");


    }
}
