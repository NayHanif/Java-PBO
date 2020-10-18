package com.pboreg;

import java.util.Scanner;

public class tugasPertemuan5 {

    public static void main(String[] args){
        Scanner inputData = new Scanner(System.in);

        classTugasPertemuan5 objBiodata = new classTugasPertemuan5();
        System.out.print("Masukan NIM anda      : ");
        objBiodata.inputNim(inputData.nextLine());
        System.out.print("Masukan Nama anda     : ");
        objBiodata.inputNama(inputData.nextLine());
        System.out.print("Masukan Jurusan anda  : ");
        objBiodata.inputJurusan(inputData.nextLine());
        System.out.print("Masukan Angkatan anda : ");
        objBiodata.inputAngkatan(inputData.nextLine());

        System.out.println("\n================BIODATA ANDA=================\n");

        System.out.println("NIM      : " + objBiodata.nim);
        System.out.println("Nama     : " + objBiodata.nama);
        System.out.println("Jurusan  : " + objBiodata.jurusan);
        System.out.println("Angkatan : " + objBiodata.angkatan);
    }
}
