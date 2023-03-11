/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas1;

public class persegipanjang implements menghitungbidang {
    
    private double panjang;
    private double lebar;
    
    public persegipanjang(double panjang, double lebar){
        this.panjang = panjang;
        this.lebar = lebar;
    }
    
    //getter enkapsulasi
    public double getPanjang() {
        return panjang;
    }
    
    public double getLebar() {
        return lebar;
    }

    //setter enkapsulasi
    public void setPanjang(double panjang) {
        this.panjang = panjang;
    }
    
    public void setLebar(double lebar) {
        this.lebar = lebar;
    }
    
    @Override
    public double menghitungluas() {
        return panjang * lebar;
    }

    @Override
    public double menghitungkeliling() {
        return  2 * (panjang + lebar) ;
    }
   
}

