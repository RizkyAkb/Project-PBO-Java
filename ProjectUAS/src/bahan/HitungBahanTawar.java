/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bahan;

/**
 *
 * @author RUDI
 */
public class HitungBahanTawar extends Bahan{
    double beratSatuan = 400.0;
    double beratTotal = 2065.0;
    @Override
    public double hitungHargaPerKemasan(double jumlahPesan) {
        this.tepungTerigu = (1000 / (this.beratTotal/this.beratSatuan)) * jumlahPesan;
        this.gulaPasir = (125 / (this.beratTotal/this.beratSatuan)) * jumlahPesan;
        this.butter = (100 / (this.beratTotal/this.beratSatuan)) * jumlahPesan;
        this.ragi = (20 / (this.beratTotal/this.beratSatuan)) * jumlahPesan;
        this.susuBubuk = (250 / (this.beratTotal/this.beratSatuan)) * jumlahPesan;
        this.susuCair = (200 / (this.beratTotal/this.beratSatuan)) * jumlahPesan;
        this.telur = (70 / (this.beratTotal/this.beratSatuan)) * jumlahPesan;
        this.esBatu = (300 / (this.beratTotal/this.beratSatuan)) * jumlahPesan;            
        
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
