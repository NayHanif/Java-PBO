package com.pboreg;

public class breakAndContinue {

    public static void main(String[] args){

        // Menggunakan Break ada sebuah looping
        for (int i = 0; i < 10; i++){
            if (i == 4){
                break;
            }
            System.out.print(i + " ");
        }
        System.out.print("\n");
        // Menggunakan continue pada sebuah looping
        for (int i = 0; i < 10; i++){
            if (i == 4){
                continue;
            }
            System.out.print(i + " ");
        }
    }
}
