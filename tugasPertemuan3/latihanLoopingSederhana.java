package com.pboreg;
import java.util.*;

public class latihanLoopingSederhana {

    public static void main(String[] args){

        int nilaiAwal, nilaiAkhir, total;

        Scanner inputUser = new Scanner(System.in);
        System.out.print("Masukan nilai awal = ");
        nilaiAwal = inputUser.nextInt();
        System.out.print("Masukan nilai akhir = ");
        nilaiAkhir = inputUser.nextInt();

        total = 0;

         while (nilaiAwal <= nilaiAkhir){
            total = total + nilaiAwal;
            nilaiAwal++;

            System.out.println("Ditambah " + nilaiAwal + " menjadi " + total);
        }


/*
        //INI ADALAH TUGAS, KALO DI JALANKAN DI FILE BARU, INI BISA JALAN KOK


        // DO WHILE LOOP
        do{

            total = total + nilaiAwal;
            System.out.println("Ditambah " + nilaiAwal + " menjadi " + total);
            nilaiAwal++;
        } while (nilaiAwal <= nilaiAkhir);



        // FOR LOOP
        for (int i = nilaiAwal; i <= nilaiAkhir; i++){

            total = total + i;
            System.out.println("Ditambah " + i + " menjadi " + total);

        }

 */

    }
}
