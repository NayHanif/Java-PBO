package com.pboreg;

class Bilangan {
    // Ini class Bilangan tanpa main
    // atribut
    private int a = 10; //atribut ini tidak boleh diakses secara langsung dari luar kelas
    private int b = 20; //atribut ini tidak boleh diakses secara langsung dari luar kelas
    private  int c = 30; //atribut ini tidak boleh diakses secara langsung dari luar kelas

    // method
    public int tampilkanA(){
        return this.a;
    }
    public int tampilkanB(){
        return this.b;
    }
    public int tampilkanC(){
        return this.c;
    }
    public void inputData(int a, int b, int c){
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public void inputA(int nilai) {
        this.a = nilai;
    }
    public void inputB(int nilai) {
        this.b = nilai;
    }
    public void inputC(int nilai) {
        this.c = nilai;
    }
    public int tambah(){
        int hasil = this.a+b+c;
        return hasil;
    }
    public int kurang(){
        int hasil = this.a-b;
        return hasil;
    }
    public int kali(){
        int hasil = this.a * this.c;
        return hasil;
    }
    public double bagi(){
        double hasil = (double)this.a/b;
        return hasil;
    }
}
