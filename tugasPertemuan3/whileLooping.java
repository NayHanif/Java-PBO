package com.pboreg;

public class whileLooping {

    public static void main(String[] args){

/*        while(kondisi){

        }*/

        int a = 0;
        boolean kondisi = true;
        System.out.println("awal program");

        while (kondisi){
            System.out.println("while loop ke-" + a);

            if (a == 10){
                kondisi = false;
            }

            a++;
        }
        System.out.println("Akhir program");
    }
}
