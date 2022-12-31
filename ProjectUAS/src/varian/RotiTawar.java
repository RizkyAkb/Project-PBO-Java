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
public class RotiTawar extends HitungBahanTawar implements Varian1, Varian2{
//    HitungBahanTawar rotitawar = new HitungBahanTawar();
    double keju;
    double coklat;
    double jumlahPesan;

    @Override
    public double varian1(double jumlahPesan) {
        this.jumlahPesan = jumlahPesan;
        this.hitungBeratBahan(jumlahPesan);
        this.coklat = Math.ceil(80 * jumlahPesan / 500);
        double hrgCoklat = this.coklat * 29000;
        double hargaVarian1 = hrgCoklat ;
        double totalKeuntungan = (hargaVarian1 + this.totalHargaBeli()) + ((hargaVarian1 + this.totalHargaBeli())*(50.0/100.0));
        double hargaSatuan = Math.ceil(totalKeuntungan/jumlahPesan);
        return hargaSatuan;
    }
    
    public void tampilVarian1(){
        System.out.println("Varian         Berat diperlukan     Jumlah Kemasan");
    }
    
    @Override
    public double varian2(double jumlahPesan) {
        this.jumlahPesan = jumlahPesan;
        this.hitungBeratBahan(jumlahPesan);
        this.keju = Math.ceil(80 * jumlahPesan / 250);
        double hrgKeju = this.keju * 29000;
        double hargaVarian1 = hrgKeju ;
        double totalKeuntungan = (hargaVarian1 + this.totalHargaBeli()) + ((hargaVarian1 + this.totalHargaBeli())*(50.0/100.0));
        double hargaSatuan = Math.ceil(totalKeuntungan/jumlahPesan);
        return hargaSatuan;
    }
    
    public void tampilVarian2(){
        System.out.println("Varian         Berat diperlukan     Jumlah Kemasan");
    }

//    private double totalHargaBeli() {
//        return 0;
//    }
    
}

