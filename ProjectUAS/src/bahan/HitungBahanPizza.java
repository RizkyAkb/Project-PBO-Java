/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bahan;

/**
 *
 * @author RUDI
 */
public class HitungBahanPizza extends Bahan{
    double beratSatuan = 190.0;
    double beratTotal = 1950.0;
    @Override
    public double hitungBeratBahan(double jumlahPesan) {
        this.tepungTerigu = (1000  / (this.beratTotal/this.beratSatuan)) * jumlahPesan;
        this.gulaPasir = (100 / (this.beratTotal/this.beratSatuan)) * jumlahPesan;
        this.butter = (100 / (this.beratTotal/this.beratSatuan)) * jumlahPesan;
        this.ragi = (20 / (this.beratTotal/this.beratSatuan)) * jumlahPesan;
        this.susuBubuk = (200 / (this.beratTotal/this.beratSatuan)) * jumlahPesan;
        this.susuCair = (180 / (this.beratTotal/this.beratSatuan)) * jumlahPesan;
        this.telur = (50 / (this.beratTotal/this.beratSatuan)) * jumlahPesan;
        this.esBatu = (300 / (this.beratTotal/this.beratSatuan)) * jumlahPesan;            
        
//        double[] beratDough = {this.tepungTerigu, this.gulaPasir , this.butter , 
//                this.ragi , this.susuBubuk , this.susuCair , this.telur 
//                , this.esBatu}; 
        double totalBeratDough = this.tepungTerigu + this.gulaPasir + this.butter + 
                this.ragi + this.susuBubuk + this.susuCair + this.telur 
                + this.esBatu;
        return totalBeratDough;
    }
    
//    public double hitungHargaPerPcs(){
//        double hargaPerPcs = Math.ceil(this.hitungHargaPerKemasan() /47);
//        return hargaPerPcs;
//    }
}
