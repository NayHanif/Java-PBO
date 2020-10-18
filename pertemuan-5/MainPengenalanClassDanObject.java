package com.pboreg;

// membuat class sebagai template
class Mahasiswa{
    String nama;
    String NIM;
    String jurusan;
    double IPK;
    int umur;
}

public class MainPengenalanClassDanObject {

    public static void main (String[] args){

        // instansiasi / membuat object
        Mahasiswa mahasiswa1 = new Mahasiswa();
        mahasiswa1.nama = "Fulan";
        mahasiswa1.NIM = "2019071666";
        mahasiswa1.jurusan = "Informatika";
        mahasiswa1.IPK = 4.0;
        mahasiswa1.umur = 17;

        System.out.println(mahasiswa1.nama);
        System.out.println(mahasiswa1.NIM);
        System.out.println(mahasiswa1.jurusan);
        System.out.println(mahasiswa1.IPK);
        System.out.println(mahasiswa1.umur);

        System.out.println("===================================");

        Mahasiswa mahasiswa2 = new Mahasiswa();
        mahasiswa2.nama = "Dia";
        mahasiswa2.NIM = "2019071777";
        mahasiswa2.jurusan = "Informatika";
        mahasiswa2.IPK = 3.5;
        mahasiswa2.umur = 32;

        System.out.println(mahasiswa2.nama);
        System.out.println(mahasiswa2.NIM);
        System.out.println(mahasiswa2.jurusan);
        System.out.println(mahasiswa2.IPK);
        System.out.println(mahasiswa2.umur);
    }
}
