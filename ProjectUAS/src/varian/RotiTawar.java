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

    public void varian1(int jumlahPesan) {
        hitungBeratBahan(jumlahPesan);
        hitungHargaBahan();
        tampilBahan();                
        this.coklat = 80 * jumlahPesan;
        double hrgCoklat = this.coklat /this.kemasanCoklat * this.hargaCoklat;        
        double hargaVarian1 = hrgCoklat;
        double totalKeuntungan = (hargaVarian1 + totalHargaBeli()) + ((hargaVarian1 + totalHargaBeli())*(50.0/100.0));
        double hargaSatuan = Math.ceil(totalKeuntungan/jumlahPesan);    
        
        System.out.println("=======");
        System.out.println("VARIAN");
        System.out.println("===========================================================================");
        System.out.println("Bahan           Berat diperlukan              Harga");
        System.out.println("===========================================================================");
        System.out.println("Coklat \t\t" + numberFormat.format(this.coklat) + " gr " + "\t\t Rp " + numberFormat.format(hrgCoklat));        
        System.out.println("===========================================================================");
        System.out.println("Total \t\t\t" + "  \t\t Rp " + numberFormat.format(hargaVarian1)); 
        System.out.println("Modal Rp " + numberFormat.format(hargaVarian1 + totalHargaBeli()));
        System.out.println("Total Keuntungan Rp " + numberFormat.format(totalKeuntungan));
        System.out.println("Harga satuan roti Rp " + hargaSatuan );          
        System.out.println(" ");
    }
    
    public void varian2(int jumlahPesan) {
        hitungBeratBahan(jumlahPesan);
        hitungHargaBahan();
        tampilBahan();                
        this.keju = 80 * jumlahPesan;
        double hrgKeju = this.keju / this.kemasanKeju * this.hargaKeju;
        double hargaVarian2 = hrgKeju;
        double totalKeuntungan = (hargaVarian2 + totalHargaBeli()) + ((hargaVarian2 + totalHargaBeli())*(50.0/100.0));
        double hargaSatuan = Math.ceil(totalKeuntungan/jumlahPesan);    
        
        System.out.println("=======");
        System.out.println("VARIAN");
        System.out.println("===========================================================================");
        System.out.println("Bahan           Berat diperlukan              Harga");
        System.out.println("===========================================================================");
        System.out.println("Keju \t\t" + numberFormat.format(this.keju) + " gr " + "\t\t Rp " + numberFormat.format(hrgKeju));
        System.out.println("===========================================================================");
        System.out.println("Total \t\t\t" + "  \t\t Rp " + numberFormat.format(hargaVarian2)); 
        System.out.println("Modal Rp " + numberFormat.format(hargaVarian2 + totalHargaBeli()));
        System.out.println("Total Keuntungan Rp " + numberFormat.format(totalKeuntungan));
        System.out.println("Harga satuan roti Rp " + hargaSatuan );          
        System.out.println(" ");
    }
    
    
    
}

