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
public class RotiManis extends HitungBahanManis implements Varian1,Varian2, Varian3{
//    HitungBahanManis rotimanis = new HitungBahanManis();
    double keju;
    double coklat;
    double krim;
    double selai;
    double sosis;
    double jumlahPesan;
//    double kemasanKeju;
//    double kemasanCoklat;
//    double kemasanKrim;
//    double kemasanSelai;
//    double kemasanSosis;
//    double hargaKeju;
//    double hargaCoklat;
//    double hargaKrim;
//    double hargaSelai;
//    double hargaSosis;
    
    @Override
    public double varian1(double jumlahPesan) {
        this.jumlahPesan = jumlahPesan;
        this.hitungBeratBahan(jumlahPesan);
        this.keju = Math.ceil(5 * jumlahPesan / 250);
        this.coklat = Math.ceil(10 * jumlahPesan / 500);
        double hrgKeju = this.keju * 31000;
        double hrgCoklat = this.coklat * 29000;        
        double hargaVarian1 = hrgKeju + hrgCoklat;
        double totalKeuntungan = (hargaVarian1 + this.totalHargaBeli()) + ((hargaVarian1 + this.totalHargaBeli())*(50.0/100.0));
        double hargaSatuan = Math.ceil(totalKeuntungan/jumlahPesan);
        return hargaSatuan;
    }
    
    
    public void tampilVarian1(){
        System.out.println("Varian         Berat diperlukan     Jumlah Kemasan");
        System.out.println("Keju          " + this.keju + "     " + );
        System.out.println("Coklat        " + this.coklat + "    " +);        
        System.out.println("========================================================================================");
        System.out.println("Total           "+);
    }
    
    @Override
    public double varian2() {
        this.selai = 10 * (25000/500);
        this.krim = 5 * (30000 / 500);
        double hargaVarian2 = this.selai + this.krim;
        double hargaJual = (hargaVarian2 + this.totalHargaBeli()) + ((hargaVarian2 + this.totalHargaBeli()) * (50/100));
//        return hargaVarian2;
        return hargaJual;
    }

    @Override
    public double varian3() {
        this.keju = 10 * (31000/250);
        this.sosis = 10 * (80000/1000);
        double hargaVarian3 = this.keju + this.sosis;
        double hargaJual = (hargaVarian3 + this.totalHargaBeli()) + ((hargaVarian3 + this.totalHargaBeli()) * (50/100));
//        return hargaVarian3;
        return hargaJual;
    }
    
    
}
