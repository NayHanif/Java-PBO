package com.pboreg;

import javax.crypto.spec.DESedeKeySpec;

class mahasiswa{
    // Data member
    String nama, NIM;

    // Constructor
    mahasiswa(String nama, String NIM){
        this.nama = nama;
        this.NIM = NIM;
    }

    // method tanpa return dan tanpa parameter
    void show(){
        System.out.println("Nama : " + this.nama);
        System.out.println("NIM  : " + this.NIM);
    }

    // method tanpa return dan dengan parameter
    void setNama(String nama){
        this.nama = nama;
    }

    // method dengan return tapi tidak ada parameter
    String getNama(){
        return this.nama;
    }

    String getNIM(){
        return this.NIM;
    }

    // method dengan return dan dengan parameter
    String sayHi(String message){
        return message + " juga, nama saya adalah " + this.nama;
    }
}


public class method {

    public static void main (String[] args){

        mahasiswa mahasiswa1 = new mahasiswa("Ucup", "2019071000");
        // Method
        mahasiswa1.show();
        mahasiswa1.setNama("Tutu");
        mahasiswa1.show();

        System.out.println(mahasiswa1.getNama());
        System.out.println(mahasiswa1.getNIM());
        String data = mahasiswa1.sayHi("ganteng");
        System.out.println(data);
    }

}