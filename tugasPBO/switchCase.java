package com.pboreg;

import java.util.Scanner;

public class switchCase {

    public static void main(String[] args){

        // switch case

        String input;
        Scanner inputUser = new Scanner(System.in);

        System.out.print("Panggil nama: ");
        input = inputUser.next();

        //ekspresinya berupa satuan (int, long, byte, short), string atau enum
        switch (input){
            case "anayah":
                System.out.println("Saya anayah Hadir!!");
                break; // break memberitahu program untuk berhenti memeriksa case selanjutnya, karena case ini sudah terpenuhi
            //jika tidak menggunakan break, maka saat case terpenuhi, dia akan tetap menjalankan case selanjutnya
            case "hanifah":
                System.out.println("Saya hanifah hadir!!");
                break;
            case "elsyaf":
                System.out.println("Saya elsyaf hadir!!");
                break;
            default:
                System.out.println(input + " tidak hadir!");
        }

        System.out.println("Selesai Program");
    }
}
