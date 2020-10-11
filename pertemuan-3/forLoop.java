package com.pboreg;

public class forLoop {

    public static void main(String[] args) {

        // Perulangan For
        for(int i= 1; i<= 10; i = i+2){
            System.out.printf(i + " ");
        }
        System.out.println("\n");
        // Penggunaan For pada sebuah pemanggilan Array
        String[] mobil = {"Volvo", "BMW", "Ford", "Mazda"};
        for (String i : mobil){
            System.out.println("Ini Mobil "+ i);
        }
    }
}
