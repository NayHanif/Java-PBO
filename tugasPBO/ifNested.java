package com.pboreg;

public class ifNested {

    public static void main(String[] args){

        // Nested if atau if bersarang
        // Nested if adalah kondisi dimana dalam sebuah if, akan terdapat if lainnya

        int a = 5;
        int b = 10;
        int c = 15;

        System.out.println("Ini adalah awal dari program");

        if(a == 5){
        //jika kondisi ini tidak terpenuhi, maka akan langsung dilewatkan walaupun kondisi if di dalamnhya terpenuhi
            if(b == 10){

                System.out.println("Ini adalah aksi, dimana a = 5 dan b = 10");

                if (c == 15)
                {
                    System.out.println("Ini adalah aksi, dimana a = 5 dan b = 10 dan c = 15");
                } else {
                    System.out.println("Ini adalah aksi, dimana a = 5 dan b = 10 dan c bukan 15");
                }

            } else {
                System.out.println("Ini adalah aksi default, dimana a = 5 dan b bukan 10");
            }

        } else {
            System.out.println("Ini adalah dimana a salah");
        }

        System.out.println("Ini adalah akhir dari program");
    }
}
