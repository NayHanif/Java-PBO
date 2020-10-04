package com.pboreg;
import java.util.Scanner;

public class inputScanner {

    public static void main(String[] args){
        Scanner myScan =  new Scanner(System.in);
        int i = 0; // inisialisasi
        int jmlLoop;
        System.out.print("Masukkan jumlah Loop: ");
        jmlLoop = myScan.nextInt();
        while (i < jmlLoop) {
            System.out.print(i + " ");
            i++; //counter
        }
    }
}
