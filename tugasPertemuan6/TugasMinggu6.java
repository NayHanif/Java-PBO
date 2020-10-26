package com.pboreg;

import java.util.*;

class Orang{
    private int _umur, jamKerja;
    private String _nama;
    private String golDarah;
    //constructor
    public Orang () {
        this._nama = "";
        this._umur = 0;
    }

    public int getJamKerja() {
        return jamKerja;
    }

    public void setJamKerja(int jamKerja) {
        this.jamKerja = jamKerja;
    }

    public int getUmur (){
        return this._umur;
    }

    //Method
    public void setUmur(int umur){
        this._umur = umur;
    }

    public String getGolDarah (){
        return golDarah;
    }

    public void setGolDarah(String golDarah){
        this.golDarah = golDarah;
    }

    public String getNama (){
        return this._nama;
    }

    public void setNama(String nama){
        this._nama = nama;
    }


}

class Pegawai extends Orang {

    String golongan;
    private String nip, jabatan;
    private double gajiPokok, tunjangan, bayaranLembur;

    public Pegawai(){
        this.nip = "";
        this.jabatan = "";
        this.gajiPokok=0.0;
        this.tunjangan=0.0;
        this.golongan="";
    }

    public String getNip (){
        return nip;
    }

    public void setNip(String nip){
        this.nip = nip;
    }

    public String getJabatan() {
        return jabatan;
    }

    public void setJabatan(String jabatan){
        this.jabatan = jabatan;
    }

    public double getGajiPokok() {
        return gajiPokok;
    }

    public void setGajiPokok(double gajiPokok) {
        this.gajiPokok = gajiPokok;
    }

    public double getTunjangan() {
        return tunjangan;
    }

    public void setTunjangan(double tunjangan) {
        this.tunjangan = tunjangan;
    }

    public String getGolongan() {
        return golongan;
    }

    public void setGolongan(String golongan) {
        this.golongan = golongan;
    }

    public double getBayaranLembur() {
        return bayaranLembur;
    }

    public void setBayaranLembur(double bayaranLembur) {
        this.bayaranLembur = bayaranLembur;
    }

    public static double tambah(double gajiPokok, double tunjangan){
        return gajiPokok + tunjangan;
    }

    public static double pajakPersen(double a, int b){
        return a / b;
    }

    void show(){
        double gajiTot = tambah(gajiPokok, tunjangan);
        double pajak = pajakPersen(0.5, 100)*gajiTot;
        double totalGaji = gajiTot - pajak;
        double gajiAkhir = totalGaji + getBayaranLembur();
        System.out.println("\n============== GOLONGAN " + golongan + " ===========");
        System.out.println("Gaji Pokok = " + gajiPokok + " Rupiah" +"\nTunjangan = " + tunjangan + " Rupiah");
        System.out.println("Gaji Lembur = " + getBayaranLembur() + " Rupiah");
        System.out.println("\n===========  GAJI BULAN INI ==========");
        System.out.println("Gaji Yang Anda Terima = " + gajiAkhir + " Rupiah");
        System.out.println("\nGaji Pokok dan Tunjangan terkena\nPotongan pajak sebesar 0.5%");
    }
}

class golongan extends Pegawai{
    private int jamLembur,gol = 0;
    private double bayaranLembur;

    public golongan(){
    }

    public int getGol() {
        return gol;
    }

    public void setGol(int gol) {
        if (gol == 1){
            setGajiPokok(1468500);
            setTunjangan(250000);
            setGolongan("1");
            getJamKerja();
            show();
        } else if (gol == 2){
            setGajiPokok(1926000);
            setTunjangan(300000);
            setGolongan("2");
            getJamKerja();
            show();
        } else if (gol == 3){
            setGajiPokok(2456700);
            setTunjangan(350000);
            setGolongan("3");
            getJamKerja();
            show();
        } else if (gol == 4){
            setGajiPokok(2899500);
            setTunjangan(400000);
            setGolongan("4");
            getJamKerja();
            show();
        } else {
            System.out.println("Tidak ditemukan");
            System.exit(0);
        }
        this.gol = gol;
    }


    public double getBayaranLembur() {
        if (getJamKerja() > 173){
            jamLembur = getJamKerja() - 173;
            this.bayaranLembur = jamLembur * 20000;
        } else {
            jamLembur = 0;
            this.bayaranLembur = 0;
        }
        return bayaranLembur;
    }

    public void setBayaranLembur(double bayaranLembur) {
        this.bayaranLembur = bayaranLembur;
    }
}

public class TugasMinggu6 {
    public TugasMinggu6() {
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Orang org = new Orang();
        String nama;
        int umur, jamker, golong;
        String golonganDarah;
        String nip;
        String jabatan;
        Pegawai peg = new Pegawai();
        System.out.println("\n=========== MASUKKAN DATA ==========");
        System.out.print("Masukkan NIP                  : ");
        nip = input.nextLine();
        System.out.print("Masukkan Nama                 : ");
        nama = input.nextLine();
        System.out.print("Masukkan Golongan Darah       : ");
        golonganDarah = input.nextLine();
        System.out.print("Masukkan Jabatan              : ");
        jabatan = input.nextLine();
        System.out.print("Masukkan Umur                 : ");
        umur = input.nextInt();
        System.out.print("Masukkan jumlah jam kerja Anda: ");
        jamker = input.nextInt();
        System.out.print("Masukkan golongan Anda        : ");
        golong = input.nextInt();
        peg.setNama(nama);
        peg.setNip(nip);
        peg.setUmur(umur);
        peg.setGolDarah(golonganDarah);
        peg.setJabatan(jabatan);

        System.out.println("\n============== BIODATA ============");

        System.out.println("NIP : " + peg.getNip());
        System.out.println("Nama : " + peg.getNama());
        System.out.println("Golongan Darah : " + peg.getGolDarah());
        System.out.println("Jabatan : " + peg.getJabatan());
        System.out.println("Umur : " + peg.getUmur());


        golongan gol = new golongan();
        gol.setJamKerja(jamker);


        gol.setGol(golong);

    }

}
