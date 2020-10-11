package com.pboreg;
import java.util.Scanner;

public class tugasLogin {

    public static void main(String[] args){
        String username = "anayah";
        String password = "inipass";
        boolean status = false;
        Scanner myScan =  new Scanner(System.in);
        int i = 0; // inisialisasi

        while (i < 3) {
        System.out.print("Masukan username: ");
        String inputUsername = myScan.next();
        System.out.print("Masukkan password: ");
        String inputPassword = myScan.next();

            if (inputUsername.equals(username) && inputPassword.equals(password)){
                System.out.println("Username dan password benar");
                status = true;
                break;

            } else {
                System.out.println("Username atau password yang anda masukan salah, silahkan coba lagi");
            }
            i++; //counter
        }
        if (status == false) {
            System.out.println("Percobaan login terlalu banyak, anda tidak bisa login untuk sementara");
        }
    }
}
