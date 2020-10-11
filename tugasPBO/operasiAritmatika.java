package com.pboreg;

import java.util.Scanner;

public class operasiAritmatika {

    public static void main(String[] args){
        // Kesimpulannya adalah perkalian atau pembagian akan dilakukan terlebih dahulu

        // Jika dilakukan perkalian dan pembagian, maka akan dilakukan operasinya dari kiri ke kanan

        int hasil =   5 * 10 / 2;
        System.out.println(hasil);
        hasil = 5 + 2 - 10;
        System.out.println(hasil);

        // menggunakan pengelompokan operasi dengan ()
        // maka dia akan di operasikan terlebih dahulu
        // Prioritas : kurung -> perkalian & pembagian -> penjumlahan & pengurangan
        hasil = 60 / (2 + 10);
        System.out.println(hasil);

        Scanner userInput = new Scanner(System.in);
        // perhitungan persamaan kuadrat
        System.out.println("MENGHITUNG PERSAMAAN KUADRAT");
        int m,x,c;

        System.out.print("Nilai x = ");
        x = userInput.nextInt();
        System.out.print("Gradient m = ");
        m = userInput.nextInt();
        System.out.print("Bias c = ");
        c = userInput.nextInt();
        int y =(m * x * x) +c;

        System.out.println("Nilai y = "+ y);
    }
}
