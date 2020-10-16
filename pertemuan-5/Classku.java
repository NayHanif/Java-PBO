package com.pboreg;

public class Classku {

    // atribute
    public int x = 5; //atribut ini boleh diakses secara langsung dari luar kelas
    int y = 15; //atribut ini dapat diakses langsung dalam satu package
    private int z = 20; //atribut ini tidak boleh diakses secara langsung dari luar kelas

    // method
    public int tampilkanZ(){
        return this.z;
    }
}
