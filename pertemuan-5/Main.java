package com.pboreg;

public class Main {

    public static void main(String[] args) {
        Bilangan objbil = new Bilangan();
        System.out.println("Nilai A = " + objbil.tampilkanA());
        System.out.println("Nilai B = " + objbil.tampilkanB());
        System.out.println("Nilai C = " + objbil.tampilkanC());

        objbil.inputA(100);
        System.out.println("Nilai A setelah di input = " + objbil.tampilkanA());

        objbil.inputB(200);
        System.out.println("Nilai B setelah di input = " + objbil.tampilkanB());

        objbil.inputC(300);
        System.out.println("Nilai C setelah di input = " + objbil.tampilkanC());

        System.out.println("Hasil Pertambahan = " + objbil.tambah());
        System.out.println("Hasil Pengurangan = " + objbil.kurang());
        System.out.println("Hasil Perkalian = " + objbil.kali());
        System.out.println("Hasil Pembagian = " + objbil.bagi());

        objbil.inputData(3,5,2);
        System.out.println("Hasil Pembagian = " + objbil.tambah());

    }
}
