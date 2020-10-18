package com.pboreg;

public class JavaConstructorPt2 {
    int x;

    public JavaConstructorPt2(int y){
        x = y;
    }

    public static void main(String[] args){
        JavaConstructorPt2 myObj = new JavaConstructorPt2(5);
        System.out.println(myObj.x);
    }
}
