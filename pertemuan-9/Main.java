package com.pboreg;
class ContohArray {
    private int[] angka = {10,5,2,15,12,32};
    public void viewAllManual(){
        // Sebut datanya satu-satu berdasarkan indexnya
        System.out.println("View All Manual");
        System.out.println("Nilai 1 = " + this.angka[0]);
        System.out.println("Nilai 2 = " + this.angka[1]);
        System.out.println("Nilai 3 = " + this.angka[2]);
        System.out.println("Nilai 4 = " + this.angka[3]);
        System.out.println("Nilai 5 = " + this.angka[4]);
        System.out.println("Nilai 6 = " + this.angka[5]);
    }
    public void viewAllFor(){
        System.out.println("View All For");
        for (int i=0; i < this.angka.length; i++){
            System.out.println("Nilai " + (i+1) + "= " +
                    this.angka[i]);
        }
    }
    public void viewAllwhile(){
        System.out.println("View All While");
        int i = 0;
        while (i < this.angka.length){
            System.out.println("Nilai " + (i+1) + "= " +
                    this.angka[i]);
            i++;
        }
    }
    public void viewByID(int i){
        System.out.println("View By Index");
        System.out.println("Nilai " + (i+1) + " = " +
                this.angka[i]);
    }
    public void totalData(){
        //(10,5,2,15,12,32)
        System.out.println("Total Data: ");
        int total = 0;
        for(int i=0; i < this.angka.length; i++){
            total = total + this.angka[i];
        }
        System.out.println(total);
        System.out.println("yang dihitung dari banyaknya data = " +
                this.angka.length);
    }
    public void ratarata(){
        double rata;
        System.out.println("Rata-rata : ");
        double total = 0;
        for (int i = 0; i < this.angka.length; i++){
            total = total + this.angka[i];
        }
        rata = total / this.angka.length;
        System.out.println(String.format("%.2f", rata));
    }
}

public class Main{

    public static void main (String[] args){
        // write your code here
        ContohArray objArrA = new ContohArray();
        // objArrA.viewAllManual();
        // objArrA.viewAllFor();
        objArrA.viewByID(2);
        System.out.print("\n");
        objArrA.totalData();
        System.out.print("\n");
        objArrA.ratarata();

    }
}


