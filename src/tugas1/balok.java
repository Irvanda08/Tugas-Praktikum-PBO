/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas1;

public class balok extends persegipanjang implements menghitungruang{

    private double tinggi;
    
    public balok(double panjang, double lebar, double tinggi) {
        super(panjang, lebar);
        this.tinggi = tinggi;
    }
    
    //getter enkapsulasi
    public double gettinggi() {
        return tinggi;
    }

    //setter enkapsulasi
    public void settinggi(double tinggi) {
        this.tinggi = tinggi;
    }
    
    @Override
    public double menghitungvolume() {
        return super.getPanjang() * super.getLebar() * tinggi;//menggunakan super untuk mengambil atribut dari parent nya
    }

    @Override
    public double menghitungluaspermukaan() {
        return 2 * (super.getPanjang() * super.getLebar() + super.getPanjang() * tinggi + super.getLebar() * tinggi);
    }
    
}
