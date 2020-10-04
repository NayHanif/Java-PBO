package com.pboreg;

import java.util.Scanner;

public class inputScannerLatihanAritmatika {

    public static void main(String[] args){

        Scanner userInput = new Scanner(System.in); //objek dari class scanner
        int panjang, lebar, luas, tinggi, volume;
        // Membuat perhitungan menghitung luas persegi panjang
        // luas = panjang * lebar

        System.out.println("MENGHITUNG LUAS");
        System.out.print("Panjang = ");
        panjang = userInput.nextInt();
        System.out.print("Lebar = ");
        lebar = userInput.nextInt();

        luas = panjang * lebar;
        System.out.println("Luas = " + luas);

        System.out.println("MENGHITUNG VOLUME");
        System.out.print("Tinggi = ");
        tinggi = userInput.nextInt();
        // volume balok adalah panjang * lebar * tinggi
        volume = luas*tinggi; // mangambil hasil dari nilai luas
        System.out.println("Volume = " + volume);

    }
}
