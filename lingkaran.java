/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas1;

public class lingkaran implements menghitungbidang{

    private double jarijari;
    
    public lingkaran(double jarijari) {
        this.jarijari = jarijari;
    }
    
    //getter enkapsulasi
    public double getjarijari() {
        return jarijari;
    }

    //setter enkapsulasi
    public void settinggiTabung(double jarijari) {
        this.jarijari = jarijari;
    }
    
    @Override
    public double menghitungluas() {
        return Math.PI * jarijari * jarijari;
    }

    @Override
    public double menghitungkeliling() {
        return 2 * Math.PI * jarijari;
    }
    
}
