/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bahan;

/**
 *
 * @author RUDI
 */
public class HitungBahanManis extends Bahan{
    int beratSatuan = 50;
    int beratTotal = 2350;
    @Override
    public double hitungHargaPerKemasan(int jumlahPesan) {
        this.tepungTerigu = (1000 / (this.beratTotal/this.beratSatuan)) * jumlahPesan;
        this.gulaPasir = (150 / (this.beratTotal/this.beratSatuan)) * jumlahPesan;
        this.butter = (150 / (this.beratTotal/this.beratSatuan)) * jumlahPesan;
        this.ragi = (20 / (this.beratTotal/this.beratSatuan)) * jumlahPesan;
        this.susuBubuk = (300 / (this.beratTotal/this.beratSatuan)) * jumlahPesan;
        this.susuCair = (250 / (this.beratTotal/this.beratSatuan)) * jumlahPesan;
        this.telur = (80 / (this.beratTotal/this.beratSatuan)) * jumlahPesan;
        this.esBatu = (400 / (this.beratTotal/this.beratSatuan)) * jumlahPesan;              
        
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
