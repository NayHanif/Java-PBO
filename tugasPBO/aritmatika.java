package com.pboreg;

public class aritmatika {

    public static void main(String[] args) {
	    // Operasi Aritmatika
        //Pendeklarasian Variabel
        int variable1 = 11;
        int variable2 = 5;
        int hasil;

        //1. Penjumlahan
        hasil = variable1 + variable2;
        System.out.println(variable1 + " + " + variable2 + " = " + hasil );

        //2. Pengurangan
        hasil = variable1 - variable2;
        System.out.printf("%d - %d = %d \n", variable1, variable2,hasil);

        //3. perkalian
        hasil = variable1 * variable2;
        System.out.printf("%d x %d = %d \n", variable1, variable2,hasil);

        //4. Pembagian
        hasil = variable1 / variable2;
        System.out.printf("%d / %d = %d \n", variable1, variable2,hasil);

        float a = 6;
        float b = 5;
        float hasilfloat = a/b;

        System.out.println(a + " / " + b + " = " + hasilfloat );

        //5. Modulus (sisa pembagian)
        hasil = variable1 % variable2;
        System.out.printf("%d %% %d = %d \n", variable1, variable2,hasil);

    }
}
