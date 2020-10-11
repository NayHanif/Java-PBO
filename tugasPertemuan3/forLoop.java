package com.pboreg;

public class forLoop {

    public static void main(String[] args){

        System.out.println("Ini adalah asal program");

        System.out.println("Loop pertama");

        for (int nilai=5; nilai <= 10; nilai++){

            System.out.println("For loop ke-" + nilai);
        }


        System.out.println("Loop kedua");

        for (int nilai=2; nilai < 10; nilai++){

            System.out.println("For loop ke-" + nilai);
        }

        System.out.println("Loop ketiga");

        for (int nilai=10; nilai >= 5; nilai--){

            System.out.println("For loop ke-" + nilai);
        }

        System.out.println("Loop keempat");

        int nilai = 0;
        for (; nilai < 10; ){

            System.out.println("For loop ke-" + nilai);
            nilai++;
        }

        System.out.println("Ini adalah akhir program");

    }
}
