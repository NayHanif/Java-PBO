package com.pboreg;

import java.util.ArrayList;
import java.util.Scanner;

class angka{
    private int[] numbers = new int[10];
    private String jawab;

    public String getJawab() {
        return jawab;
    }

    public int[] getNumbers() {
        return numbers;
    }

    public void cariNumbers(int cari){
        boolean numb = false;
        for (int i=0; i < this.numbers.length; i++){
            if (numbers[i] == cari){
                numb = true;
                break;
            }
        }
        if (numb == true){
            System.out.println("Data " + cari + " ditemukan :)");
        } else {
            System.out.println("Data tidak dapat ditemukan :(");
        }
    }

    public void pencarian(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan data yang ingin dicari : ");
        int cari = sc.nextInt();
        this.cariNumbers(cari);
    }

    public void tanya(){
        Scanner sc = new Scanner(System.in);
        System.out.print("\nApakah ingin mencari data? (Y/N) : ");
        String terima = sc.nextLine();
        this.jawab = terima;
    }

}

public class tugasPertemuan9 {
    public static void main (String[] args){
        angka Ang = new angka();
        Scanner sc = new Scanner(System.in);

        for( int i = 0; i < Ang.getNumbers().length; i++ ){
            System.out.print("Masukkan data : ");
            Ang.getNumbers()[i] = sc.nextInt();
        }

        Ang.tanya();
        while (Ang.getJawab().equals("Y")||Ang.getJawab().equals("y")){
            Ang.pencarian();
            Ang.tanya();
        }

        System.out.println("Terimakasih telah menggunakan program ini :)");
    }
}
