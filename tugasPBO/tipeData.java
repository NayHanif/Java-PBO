package com.pboreg;

public class tipeData {

    public static void main(String[] args){
        // program untuk konversi data (number)

        int nilaiInt = 256; //32-bit
        System.out.println("nilai int = " + nilaiInt);

        // Memperluas rentang ke tipe data yang lebih besar
        long nilaiLong = nilaiInt;
        System.out.println("nilai long = " + nilaiLong);

        // Memperkecil rentang ke tipe data yang lebih kecil
        byte nilaiByte = (byte) nilaiInt;
        System.out.println("nilai byte = " + nilaiByte);
        System.out.println("nilai max byte = " + Byte.MAX_VALUE);
        System.out.println("nilai max byte = " + Byte.MIN_VALUE);
        //--> memperkecil data ke rentang tipe data yang lebih kecil akan mengurangi nilainya

        // casting pembagian
        // cara pertama
        int a = 10;
        float  b = 4;
        //float di bagi integer akan mengahasilkan float

        float c = a/b;
        System.out.printf("%d / %f = %f\n",a, b, c );

        // cara kedua
        // saat pendeklarasian nilai, kedua variabel menggunakan integer
        int x = 10;
        int y = 4;

        float z = (float)x/y; //meng-casting tipe data integer menjadi float saat operasi aritmatika dilakukan
        System.out.printf("%d / %d = %f\n",x,y,z);

    }
}
