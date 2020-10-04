package com.pboreg;

import java.util.Scanner;

public class latihanKalkulatorSwitchCase {

    public static void main(String[] args){

        Scanner inputUser;
        float a,b,hasil;
        String operator;

        inputUser = new Scanner(System.in);

        System.out.print("nilai a = "); // penggunaan .print agar saat meng input tidak pindah baris, tetapi tetap di sampingnya
        a = inputUser.nextFloat();
        System.out.print("operator = ");
        operator = inputUser.next();
        System.out.print("nilai b = ");
        b = inputUser.nextFloat();

        switch (operator){
            case "+":
                //penjumlahan
                hasil = a + b;
                System.out.println("Hasil = "+ hasil);
                break;
            case "-":
                //pengurangan
                hasil = a - b;
                System.out.println("Hasil = "+ hasil);
                break;
            case "*":
                //perkalian
                hasil = a * b;
                System.out.println("Hasil = "+ hasil);
                break;
            case "/":
                hasil = a / b;
                System.out.println("Hasil = "+ hasil);
                //pembagian
                break;
            default:
                System.out.println("Operator "+ operator +" tidak ditemukan");
        }
    }
}
