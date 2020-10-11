package com.pboreg;

public class multipleParameters {
    static  void myMethod(String fname, int age){
        System.out.println(fname + " is " + age);
    }

    public static void main(String[] args){
        myMethod("liam", 5);
        myMethod("Jenny", 8);
        myMethod("Anja", 31);
    }
}
