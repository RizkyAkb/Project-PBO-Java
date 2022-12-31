/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package varian;
import bahan.*;
/**
 *
 * @author athrees
 */
public class Pizza extends HitungBahanPizza implements Varian1{
//    HitungBahanPizza Pizza = new HitungBahanPizza();
    double keju;
    double sosis;
    double beef;
    double bawang;
    double jumlahPesan;

    @Override
    public double varian1(double jumlahPesan) {
        this.jumlahPesan = jumlahPesan;
        this.hitungBeratBahan(jumlahPesan);
        this.keju = Math.ceil(30 * jumlahPesan / 250);
        this.sosis = Math.ceil(50 * jumlahPesan / 1000);
        this.beef = Math.ceil(50 * jumlahPesan / 1000);
        this.sosis = Math.ceil(30 * jumlahPesan / 500);
        double hrgKeju = this.keju * 31000;
        double hrgSosis = this.sosis * 80000;
        double hrgBeef = this.beef * 80000;
        double hrgBawang = this.bawang * 40000;
        double hargaVarian1 = hrgKeju + hrgSosis + hrgBeef + hrgBawang ;
        double totalKeuntungan = (hargaVarian1 + this.totalHargaBeli()) + ((hargaVarian1 + this.totalHargaBeli())*(50.0/100.0));
        double hargaSatuan = Math.ceil(totalKeuntungan/jumlahPesan);
        return hargaSatuan;
    }
    
    
    public void tampilVarian1(){
        System.out.println("Varian         Berat diperlukan     Jumlah Kemasan");
    }

    private double totalHargaBeli(){
        return 0;
        
    }
}
