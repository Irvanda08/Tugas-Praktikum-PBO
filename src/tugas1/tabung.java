/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas1;


public class tabung extends lingkaran implements menghitungruang {

    private double tinggiTabung;
    
    tabung(double jarijari, double tinggiTabung){
        super(jarijari);
        this.tinggiTabung = tinggiTabung;
    }
    
    //getter enkapsulasi
    public double gettinggiTabung() {
        return tinggiTabung;
    }

    //setter enkapsulasi
    public void settinggiTabung(double tinggiTabung) {
        this.tinggiTabung = tinggiTabung;
    }
    
    @Override
    public double menghitungvolume() {
        return Math.PI * super.getjarijari() * super.getjarijari() * tinggiTabung;
    }

    @Override
    public double menghitungluaspermukaan() {
        return 2 * super.menghitungluas() + menghitungkeliling() * tinggiTabung;
    }
    //menggunakan super untuk mengambil atribut dari parentnya
}
