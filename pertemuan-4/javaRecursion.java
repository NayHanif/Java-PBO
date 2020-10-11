package com.pboreg;

public class javaRecursion {

    public static void main (String[] args){
        int result = sum(10);
        System.out.println("0 = " + result);
    }


    public static int sum(int k){
        int simpan;
        if (k > 0){
            System.out.print(k + " + ");
            simpan =  k + sum(k - 1);
            return simpan;
        } else {
            return 0;
        }
    }
}
