package com.pboreg;

import java.util.ArrayList;

public class arrayList1 {
    public static void main (String[] args){
        ArrayList<String> cars = new ArrayList<String>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");
        System.out.println(cars);

        // Mengambil salah satu  item dalam arraylist
        //System.out.println(cars.get(0));

        // Mengubah salah satu item dalam arrayList
        cars.set(0,"Opel");

        // Hapus salah satu item array
        System.out.println(cars);
        cars.remove(0);
        System.out.println(cars);

        // Hapus semua item dalam araylist
        cars.clear();
        System.out.println(cars);

        // Mengetahui banyak element dalam arraylist
        System.out.println(cars.size());
    }
}
