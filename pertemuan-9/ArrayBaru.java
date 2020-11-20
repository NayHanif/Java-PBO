package com.pboreg;
import java.util.ArrayList;
class DataMobil{
    private ArrayList<String> mobil = new ArrayList<String>();
    public void setMobil(String data){
        this.mobil.add(data);
    }
    public void viewAll(){
        System.out.println("List Mobil: ");
        for (int i=0; i < mobil.size(); i++){
            System.out.println("- " + mobil.get(i));
        }
    }
    public void viewAll2(){
        System.out.println("List Mobil: ");
        for (String data:mobil){
            System.out.println("- " + data);
        }
    }
    public void cariData(String cari){
        if (mobil.contains((cari))) {
            System.out.println("Data ketemu");
        }
        else {
            System.out.println("Data tidak ketemu");
        }
    }
    public void gantiMobil(int index, String data){
        this.mobil.set(index,data);
    }
    public void gantiMobil2(String dataAsli, String dataGanti){
        int i;
        if (mobil.contains(dataAsli)){
            i = mobil.indexOf(dataAsli);
            mobil.set(i,dataGanti);
        }
        else {
            System.out.println("Data asli tidak ketemu, maka data tidak dapat diganti");
        }
    }
    public void hapusMobil(String dataAsli){
        int i;
        if (mobil.contains(dataAsli)){
            i = mobil.indexOf(dataAsli);
            mobil.remove(i);
        }
        else {
            System.out.println("Data asli tidak ketemu, maka data tidak dapat dihapus");
        }
    }
}

public class ArrayBaru {

    public static void main (String[] args){
        // Write code here
        DataMobil dm = new DataMobil();
        dm.setMobil("Volvo");
        dm.setMobil("BMW");
        dm.setMobil("Opel");
        dm.viewAll();
        //dm.cariData("Opel");
        //dm.gantiMobil(0,"Opel");
        //dm.viewAll2();
        dm.gantiMobil2("BMW", "Mazda");
        dm.viewAll();
        dm.hapusMobil("Mazda");
        dm.viewAll();
    }
}
