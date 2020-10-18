package com.pboreg;

// class tanpa constructor / class polos
class Polos{
    String dataString;
    int dataInteger;
}

// class dengan constructor
class MahasiswaBaru{
    String nama;
    String NIM;
    String jurusan;

    // constructor dipanggil saat object pertama kali dibuat
    //MahasiswaBaru(){
   //     System.out.println("Ini adalah constructor");
    //}

    // constructor dengan parameter
    MahasiswaBaru(String inputNama, String inputNIM, String inputJurusan){
        nama = inputNama;
        NIM = inputNIM;
        jurusan = inputJurusan;

        System.out.println(nama);
        System.out.println(NIM);
        System.out.println(jurusan);
    }
}

public class constructor {

    public static void main(String[] args){

        MahasiswaBaru mahasiswa1 = new MahasiswaBaru("Ucup","2019071000", "Informatika");
        MahasiswaBaru mahasiswa2 = new MahasiswaBaru("fulan", "2019071111", "Informatika");


        //Polos objectPolos = new Polos();
        //objectPolos.dataString = "Polos";
        //objectPolos.dataInteger = 0;

        //System.out.println(objectPolos.dataString);
        //System.out.println(objectPolos.dataInteger);
    }
}
