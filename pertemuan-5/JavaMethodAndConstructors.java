package com.pboreg;

public class JavaMethodAndConstructors {
    int x; // Create a class attribute

    // Create a class constructor for the MyClass class
    public JavaMethodAndConstructors(){
        x = 5; // Set the initial value for the class attribute x
    }
    public static void main(String[] args){
        JavaMethodAndConstructors myObj = new JavaMethodAndConstructors(); // Create an object of class JavaMethodAndConstructor (This will call constructor)
        System.out.println(myObj.x); //print the value of x
    }

    static void myMethod(){
        // this is method
    }
}


