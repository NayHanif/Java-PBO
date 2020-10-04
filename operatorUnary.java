package com.pboreg;

public class operatorUnary {

    public static void main(String[] args){

        // unary = operasi yang dilakukan pada satu variable
        // dalam proses ini, nilai yang berada di dalam variabel tidak berubah
        int angka =1;
        System.out.printf("unary '-', %d menjadi %d\n",angka, -angka);
        System.out.printf("unary '-', %d menjadi %d\n",angka, +angka);

        // unary decrement dan increment
        // dalam proses ini, nilai yang berada di dalam variabel akan berubah
        int angka2 = 10;
        angka2++; //10 nantinya akan ditambah 1
        System.out.println("nilai dengan '++' menjadi = " + angka2);

        int angka3 = 10;
        angka3--; //10 nantinya akan di kurang 1
        System.out.println("nilai dengan '--' menjadi = " + angka3);

        int a = 5;
        System.out.printf("nilai dengan '++' prefix menjadi = %d\n",++a);
        // nilai a akan ditambah 1 dahulu, baru di cetak
        int b = 5;
        System.out.printf("nilai dengan '++' postfix menjadi = %d\n",b++);
        // nilai a akan di cetak dahulu baru akan ditambah 1
        System.out.printf("nilai hasil dari postfix menjadi = %d\n",b);
        // nilai a yang baru akan tercetak saat dipanggil di sini

        // unary boolean dengan ! untuk negasi

        boolean ucup = true;
        // dalam proses ini, nilai yang berada di dalam variabel tidak akan berubah
        System.out.println("nilai boolean = " + ucup);
        System.out.println("nilai boolean = " + !ucup);

    }
}
