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

    /**
     *
     * @param jumlahPesan
     */
        @Override
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
          

    public void varian2(int jumlahPesan) {
        hitungBeratBahan(jumlahPesan);
        hitungHargaBahan();
        tampilBahan();                
        this.selai = 10 * jumlahPesan;
        this.krim = 5 * jumlahPesan;
        double hrgSelai = this.selai / this.kemasanSelai * this.hargaSelai;
        double hrgKrim = this.krim /this.kemasanKrim * this.hargaKrim;        
        double hargaVarian2 = hrgSelai + hrgKrim;
        double totalKeuntungan = (hargaVarian2 + totalHargaBeli()) + ((hargaVarian2 + totalHargaBeli())*(50.0/100.0));
        double hargaSatuan = Math.ceil(totalKeuntungan/jumlahPesan);        
        
        System.out.println("=======");
        System.out.println("VARIAN");
        System.out.println("===========================================================================");
        System.out.println("Bahan           Berat diperlukan              Harga");
        System.out.println("===========================================================================");
        System.out.println("Selai \t\t" + numberFormat.format(this.selai) + " gr " + "\t\t Rp " + numberFormat.format(hrgSelai));
        System.out.println("Krim \t\t" + numberFormat.format(this.krim) + " gr " + "\t\t Rp " + numberFormat.format(hrgKrim));        
        System.out.println("===========================================================================");
        System.out.println("Total \t\t\t" + "  \t\t Rp " + numberFormat.format(hargaVarian2)); 
        System.out.println("Modal Rp " + numberFormat.format(hargaVarian2 + totalHargaBeli()));
        System.out.println("Total Keuntungan Rp " + numberFormat.format(totalKeuntungan));
        System.out.println("Harga satuan roti Rp " + hargaSatuan );          
        System.out.println(" ");
    }

    @Override
    public void varian3(int jumlahPesan) {
        hitungBeratBahan(jumlahPesan);
        hitungHargaBahan();
        tampilBahan();                
        this.keju = 10 * jumlahPesan;
        this.sosis = 10 * jumlahPesan;
        double hrgKeju = this.keju / this.kemasanKeju * this.hargaKeju;
        double hrgSosis = this.sosis /this.kemasanSosis * this.hargaSosis;        
        double hargaVarian3 = hrgKeju + hrgSosis;
        double totalKeuntungan = (hargaVarian3 + totalHargaBeli()) + ((hargaVarian3 + totalHargaBeli())*(50.0/100.0));
        double hargaSatuan = Math.ceil(totalKeuntungan/jumlahPesan);        
        
        System.out.println("=======");
        System.out.println("VARIAN");
        System.out.println("===========================================================================");
        System.out.println("Bahan           Berat diperlukan              Harga");
        System.out.println("===========================================================================");
        System.out.println("Keju \t\t" + numberFormat.format(this.keju) + " gr " + "\t\t Rp " + numberFormat.format(hrgKeju));
        System.out.println("Sosis \t\t" + numberFormat.format(this.sosis) + " gr " + "\t\t Rp " + numberFormat.format(hrgSosis));        
        System.out.println("===========================================================================");
        System.out.println("Total \t\t\t" + "  \t\t Rp " + numberFormat.format(hargaVarian3)); 
        System.out.println("Modal Rp " + numberFormat.format(hargaVarian3 + totalHargaBeli()));
        System.out.println("Total Keuntungan Rp " + numberFormat.format(totalKeuntungan));
        System.out.println("Harga satuan roti Rp " + hargaSatuan );          
        System.out.println(" ");
    }
}
