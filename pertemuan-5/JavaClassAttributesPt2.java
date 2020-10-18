package com.pboreg;

public class JavaClassAttributesPt2 {
    String fname = "John";
    String Iname = "Dee";
    int age = 24;

    public static void main(String[] args){
        JavaClassAttributesPt2 myObj = new JavaClassAttributesPt2();
        System.out.println("Name : " + myObj.fname + " " + myObj.Iname);
        System.out.println("Age : " + myObj.age);
    }
}
