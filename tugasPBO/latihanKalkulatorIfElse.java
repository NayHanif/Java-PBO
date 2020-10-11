package com.pboreg;

import java.util.Scanner;

public class latihanKalkulatorIfElse {

    public static void main(String[] args){

        // a operator b
        Scanner inputUser;
        float a, b, hasil;
        char operator;

        inputUser = new Scanner(System.in);

        System.out.print("nilai a = ");
        a = inputUser.nextFloat();
        System.out.print("nilai operator = ");
        operator = inputUser.next().charAt(0);
        System.out.print("nilai b = ");
        b = inputUser.nextFloat();

        System.out.println("Input user: " + a + " " + operator + " " + b);

        // Operator tersedia * / + -

        if (operator == '+'){
            //penjumlahan
            hasil = a + b;
            System.out.println("Hasil = "+ hasil);
        } else if(operator == '-'){
            //pengurangan
            hasil = a - b;
            System.out.println("Hasil = "+ hasil);
        } else if(operator == '*'){
            //perkalian
            hasil = a * b;
            System.out.println("Hasil = "+ hasil);
        } else if(operator == '/'){
            //pembagian
            if (b == 0){
                System.out.println("Pembagi nol menghasilkan tak hingga");
            } else {
                hasil = a / b;
                System.out.println("Hasil = "+ hasil);
            }
        } else {
            // operator tidak ada
            System.out.println("Operator tidak ditemukan ");
        }

    }
}
