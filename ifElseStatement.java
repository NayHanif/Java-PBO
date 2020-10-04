package com.pboreg;

public class ifElseStatement {

    public static void main(String[] args){

        // Tutorial untuk if statement
        int a = 5;

        System.out.println("Nilai = " + a);

        // Ini adalah cabangnya
        // (a == 10) <== merupakan syarat kondisi untuk melanjutkan ke statement di dalamnya
        if(a == 10){
            System.out.println("Ini adalah jalur true");
        } else {
            System.out.println("Ini adalah jalur false");
            //jika tidak ada kondisi yang benar, maka bagian ini akan di jalankan
        }

        System.out.println("Selesai");

    }
}
