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
    @Override
    public double hitungHargaPerKemasan() {
        this.tepungTerigu = 1000 * (40000/1000);
        this.gulaPasir = 150 * (25000/1000);
        this.butter = 150 * (23000/500);
        this.ragi = 20 * (5000/11);
        this.susuBubuk = 300 * (39000/1000);
        this.susuCair = 250 * (24000/1000);
        this.telur = 80 * (23000/1000);
        this.esBatu = 400 * (2000/1000);              
        
        double totalHarga = this.tepungTerigu + this.gulaPasir + this.butter + 
                this.ragi + this.susuBubuk + this.susuCair + this.telur 
                + this.esBatu;
        return totalHarga;
    }

    public double hitungHargaPerPcs(){
        double hargaPerPcs = Math.ceil(this.hitungHargaPerKemasan() /47);
        return hargaPerPcs;
    }
    
}
