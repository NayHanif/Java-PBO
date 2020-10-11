package com.pboreg;

import java.util.Scanner;

public class ternaryOperator {

    public static void main(String[] args){

        // Ternary operator
        // dengan menggunakan ternary operator maka kita dapat menyingkat syntax penulisan code program

        int input, x;

        Scanner inputUser = new Scanner(System.in);
        System.out.print("Masukan nilai: ");
        input = inputUser.nextInt();
        System.out.println(input);

        //variable x = ekspresi ? statement_true : statement_false
        x = (input == 10) ? (input*input) : (input/2);

        /* jika memakai if
            if (input == 10){
                x = input*input;
            } else {
                x = input/2;
            }
        */

        System.out.println("Hasilnya " + x);

    }
}
