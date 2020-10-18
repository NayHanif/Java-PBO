package com.pboreg;

public class CarJavaConstructionPt3 {
    int modelYear;
    String modelName;

    public CarJavaConstructionPt3(int year, String name){
        modelYear = year;
        modelName = name;
    }

    public static void main(String[] args){
        CarJavaConstructionPt3 myCar = new CarJavaConstructionPt3(1969, "Mustang");
        System.out.println(myCar.modelYear + " " + myCar.modelName);
    }
}
