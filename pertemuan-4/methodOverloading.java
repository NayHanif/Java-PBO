package com.pboreg;

public class methodOverloading {

    static int kalkuasi (int x, int y){
        return x + y;
    }
    static double kalkuasi (double x, double y){
        return x - y;
    }
    static String kalkulasi (String x, String y){
        String hasil = x + " " + y; //variable local

        return hasil;
    }
    static String kalkulasi (String x, int y){
        String hasil = "Nama " + x + " umur " + y + " tahun";

        return hasil;
    }

    public static void main(String[] args){
        String nilai3 = kalkulasi("Hendi", "Hermawan");
        int nilai1 = kalkuasi(8,5);
        double nilai2 = kalkuasi(4.3, 6.26);
        String nilai4 = kalkulasi("Andi", 17);
        System.out.println("Nilai int = " + nilai1);
        System.out.println("Nilai double = " + nilai2);
        System.out.println("Nilai String = " + nilai3);
        System.out.println("Keterangan = " + nilai4); //Nama Andi, umur 17 tahun
    }
}
