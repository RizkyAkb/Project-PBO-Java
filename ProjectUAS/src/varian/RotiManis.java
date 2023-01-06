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
//    @Override
    public void varian1(int jumlahPesan) {         
        hitungBeratBahan(jumlahPesan);
        hitungHargaBahan();
        tampilBahan();                
        this.keju = 5 * jumlahPesan;
        this.coklat = 10 * jumlahPesan;
        double hrgKeju = this.keju / this.kemasanKeju * this.hargaKeju;
        double hrgCoklat = this.coklat /this.kemasanCoklat * this.hargaCoklat;        
        double hargaVarian1 = hrgKeju + hrgCoklat;
        double totalKeuntungan = (hargaVarian1 + totalHargaBeli()) + ((hargaVarian1 + totalHargaBeli())*(50.0/100.0));
        double hargaSatuan = Math.ceil(totalKeuntungan/jumlahPesan);        
        
        System.out.println("=======");
        System.out.println("VARIAN");
        System.out.println("===========================================================================");
        System.out.println("Bahan           Berat diperlukan              Harga");
        System.out.println("===========================================================================");
        System.out.println("Keju \t\t" + numberFormat.format(this.keju) + " gr " + "\t\t Rp " + numberFormat.format(hrgKeju));
        System.out.println("Coklat \t\t" + numberFormat.format(this.coklat) + " gr " + "\t\t Rp " + numberFormat.format(hrgCoklat));        
        System.out.println("===========================================================================");
        System.out.println("Total \t\t\t" + "  \t\t Rp " + numberFormat.format(hargaVarian1)); 
        System.out.println("Modal Rp " + numberFormat.format(hargaVarian1 + totalHargaBeli()));
        System.out.println("Total Keuntungan Rp " + numberFormat.format(totalKeuntungan));
        System.out.println("Harga satuan roti Rp " + hargaSatuan );          
        System.out.println(" ");
    }
    
    
//    public void tampilVarian1(){
//        System.out.println("Varian         Berat diperlukan     Jumlah Kemasan");
//        System.out.println("Keju          " + this.keju + "     " + );
//        System.out.println("Coklat        " + this.coklat + "    " +);        
//        System.out.println("========================================================================================");
//        System.out.println("Total           "+);
//    }
    
    @Override
    public double varian2() {
        this.jumlahPesan = jumlahPesan;
        hitungBeratBahan(jumlahPesan);
        this.selai = Math.ceil(10 * jumlahPesan/500);
        this.krim = Math.ceil(5 *  jumlahPesan/ 500);
        double hrgSelai = this.keju * 25000;
        double hrgKrim = this.coklat * 30000;        
        double hargaVarian2 = hrgSelai + hrgKrim;
        double totalKeuntungan = (hargaVarian2 + this.totalHargaBeli()) + ((hargaVarian2 + this.totalHargaBeli())*(50.0/100.0));
        double hargaSatuan = Math.ceil(totalKeuntungan/jumlahPesan);
        return hargaSatuan;
    }

    @Override
    public double varian3() {
        this.jumlahPesan = jumlahPesan;
        hitungBeratBahan(jumlahPesan);
        this.keju = Math.ceil(10 * jumlahPesan/250);
        this.sosis = Math.ceil(10 *  jumlahPesan/ 1000);
        double hrgKeju = this.keju * 25000;
        double hrgSosis = this.sosis * 80000;        
        double hargaVarian3 = hrgKeju + hrgSosis;
        double totalKeuntungan = (hargaVarian3 + this.totalHargaBeli()) + ((hargaVarian3 + this.totalHargaBeli())*(50.0/100.0));
        double hargaSatuan = Math.ceil(totalKeuntungan/jumlahPesan);
        return hargaSatuan;
    }       
}
