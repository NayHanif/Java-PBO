package com.pboreg;

import java.util.Scanner;

public class latihanOperasiLogika {

    public static void main(String[] args){

        // membuat sebuah objek untuk menangkap input dari user
        Scanner inputUser = new Scanner(System.in);

        // sebuah program sederhana untuk menebak sebuah angka
        int nilaiBenar = 6;
        int nilaiTebakan;
        boolean statusTebakan;

        System.out.print("Masukan nilai tebakan anda: ");
        nilaiTebakan = inputUser.nextInt();
        System.out.println("Nilai tebakan anda adalah: " + nilaiTebakan);

        // Operasi Logika
        statusTebakan = (nilaiTebakan == nilaiBenar);
        //jika nilaiTebakan sama dengan nilaiBenar, maka akan TRUE
        System.out.println("Tebakan anda: " + statusTebakan);

        // Operasi aljabar boolean (and / or)
        System.out.println("------------------------------- ");
        System.out.print("Masukan nilai diantara 4 dan 9: ");
        nilaiTebakan = inputUser.nextInt();

        statusTebakan = (nilaiTebakan > 4) && (nilaiTebakan < 9);
        /* jika dijelaskan dengan bahasa maka,
        jika nilaiTebakan lebih besar dari empat dan jika nilai tebakan lebih kecil
        dari sembilan, maka statusTebakan sama dengan TRUE
        */
        /*
            a | b | c
            0   0   0
            0   1   0
            1   0   0
            1   1   1
         */
        System.out.println("Tebakan anda: " + statusTebakan);

    }
}
