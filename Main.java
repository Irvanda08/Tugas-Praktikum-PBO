/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas1;

import java.util.Scanner;//untuk dapat memasukkan inputan dari user

public class Main{

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int pilih;
        
        do{
            System.out.println("Menu:");
            System.out.println("1. Persegi Panjang dan Balok");
            System.out.println("2. Lingkaran dan Tabung");
            System.out.println("3. Keluar");
            System.out.print("Pilih: ");
            pilih = input.nextInt();
            
            switch (pilih){
                case 1:
                    System.out.println();
                    System.out.print("Masukkan panjang\t\t: ");
                    double panjang = input.nextDouble();
                    System.out.print("Masukkan lebar\t\t\t: ");
                    double lebar = input.nextDouble();
                    System.out.print("Masukkan tinggi\t\t\t: ");
                    double tinggi = input.nextDouble();
                    
                    persegipanjang pp = new persegipanjang(panjang, lebar);
                    System.out.println("luas persegi panjang \t\t: " + pp.menghitungluas());
                    System.out.println("Keliling persegi panjang \t: " + pp.menghitungkeliling());
                    
                    balok balok = new balok(panjang, lebar, tinggi);
                    System.out.println("volume balok \t\t\t: " + balok.menghitungvolume());
                    System.out.println("Luas permukaan balok \t\t: " + balok.menghitungluaspermukaan());
                    break;
                case 2:
                    System.out.println();
                    System.out.print("Masukkan jari-jari\t\t: ");
                    double jarijari = input.nextDouble();
                    System.out.print("Masukkan tinggi\t\t\t: ");
                    double tinggiTabung = input.nextDouble();
                    
                    lingkaran l = new lingkaran(jarijari);
                    System.out.println("Luas Lingkaran\t\t\t: " + l.menghitungluas());
                    System.out.println("Keliling Lingkaran\t\t: " + l.menghitungkeliling());
                    
                    tabung t = new tabung(jarijari, tinggiTabung);
                    System.out.println("Volume Tabung\t\t\t: " + t.menghitungvolume());
                    System.out.println("Luas Permukaan Tabung\t\t: " + t.menghitungluaspermukaan());
                    break;
                case 3:
                    System.out.println("Terima kasih telah menggunakan program ini.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Silakan coba lagi.");
                    break;
            }
            System.out.println();
        } while (pilih != 3);   
    }

//    @Override
//    public double menghitungvolume() {
//        return 0;
//    }
    
}
