package com.pboreg;
import java.util.Scanner;
class contohArray2{
    private int[] angka;
    public contohArray2(int jmlData){
        angka = new int[jmlData];
    }
    public void viewAll(){
        System.out.println("View All for");
        for (int i = 0; i <this.angka.length; i++){
            System.out.println("Nilai " + (i+1) +
                    "= " + this.angka[i]);
        }
    }
    public void setAngka(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Input data ");
        for (int i = 0; i < this.angka.length; i++){
            System.out.print("Nilai " + (i+1) + "= ");
            this.angka[i] = sc.nextInt();
        }
    }
}

public class ArrayListScanner {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan jumlah bilangan: ");
        int jmlBil = sc.nextInt();
        contohArray2 arrA = new contohArray2(jmlBil);
        arrA.setAngka();
        arrA.viewAll();
    }
}
