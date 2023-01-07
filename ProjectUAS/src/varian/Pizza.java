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
    @Override    
    public void varian1(int jumlahPesan) {         
        hitungBeratBahan(jumlahPesan);
        hitungHargaBahan();
        tampilBahan();                
        this.keju = 30 * jumlahPesan;
        this.sosis = 50 * jumlahPesan;
        this.smokedBeef = 50 * jumlahPesan;
        this.bawangBombai = 30 * jumlahPesan;
        
        double hrgKeju = this.keju / this.kemasanKeju * this.hargaKeju;
        double hrgSosis = this.sosis / this.kemasanSosis * this.hargaSosis;
        double hrgSmokedBeef = this.smokedBeef / this.kemasanSmokedBeef * this.hargaSmokedBeef;
        double hrgBawangBombai = this.bawangBombai / this.kemasanBawangBombai * this.hargaBawangBombai;
        double hargaVarian1 = hrgKeju + hrgSosis + hrgSmokedBeef + hrgBawangBombai;
        double totalKeuntungan = (hargaVarian1 + totalHargaBeli()) + ((hargaVarian1 + totalHargaBeli())*(50.0/100.0));
        double hargaSatuan = Math.ceil(totalKeuntungan/jumlahPesan);
        
        System.out.println("=================================================================");
        System.out.println("\t\t\t    VARIAN");
        System.out.println("=================================================================");
        System.out.println("Bahan                   Berat diperlukan             Harga");
        System.out.println("=================================================================");
        System.out.println("Keju \t\t\t" + numberFormat.format(this.keju) + " gr " + "\t\t Rp " + numberFormat.format(hrgKeju));
        System.out.println("Sosis \t\t\t" + numberFormat.format(this.sosis) + " gr " + "\t\t Rp " + numberFormat.format(hrgSosis));
        System.out.println("Smoked Beef \t\t" + numberFormat.format(this.smokedBeef) + " gr " + "\t\t Rp " + numberFormat.format(hrgSmokedBeef));
        System.out.println("Bawang Bombai \t\t" + numberFormat.format(this.bawangBombai) + " gr " + "\t\t Rp " + numberFormat.format(hrgBawangBombai));
        System.out.println("-----------------------------------------------------------------");
        System.out.println("Total \t\t\t"  + "  \t\t\t Rp " + numberFormat.format(hargaVarian1)); 
        System.out.println(" ");
        System.out.println("Modal \t\t  : Rp " + numberFormat.format(hargaVarian1 + totalHargaBeli()));
        System.out.println("Total Keuntungan  : Rp " + numberFormat.format(totalKeuntungan));
        System.out.println("Harga satuan roti : Rp " + hargaSatuan );          
        System.out.println(" ");
    }
}
