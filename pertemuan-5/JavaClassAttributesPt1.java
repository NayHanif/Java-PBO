package com.pboreg;

public class JavaClassAttributesPt1 {
    int x = 5;

    public static void main(String[] args){
        JavaClassesAndObjects myObj1 = new JavaClassesAndObjects(); // Object 1
        JavaClassesAndObjects myObj2 = new JavaClassesAndObjects(); // Object 2
        myObj2.x = 25; /// x is now 25
        System.out.println(myObj1.x); // Outputs 5
        System.out.println(myObj2.x); // Outputs 25
    }
}
