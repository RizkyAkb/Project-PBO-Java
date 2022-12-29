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
public class RotiManis extends BahanVarian implements Varian2, Varian3{
    HitungBahanManis rotimanis = new HitungBahanManis();
    @Override
    public double Varian1() {
        this.keju = 5 * (31000/250);
        this.coklat = 10 * (29000/500);
        double hargaVarian1 = this.keju + this.coklat;
        double hargaJual = (hargaVarian1 + rotimanis.hitungHargaPerPcs()) + ((hargaVarian1 + rotimanis.hitungHargaPerKemasan())*(50/100));
//        return hargaVarian1;
        return hargaJual;
    }

    @Override
    public double varian2() {
        this.selai = 10 * (25000/500);
        this.krim = 5 * (30000 / 500);
        double hargaVarian2 = this.selai + this.krim;
        double hargaJual = (hargaVarian2 + rotimanis.hitungHargaPerPcs()) + ((hargaVarian2 + rotimanis.hitungHargaPerPcs()) * (50/100));
//        return hargaVarian2;
        return hargaJual;
    }

    @Override
    public double varian3() {
        this.keju = 10 * (31000/250);
        this.sosis = 10 * (80000/1000);
        double hargaVarian3 = this.keju + this.sosis;
        double hargaJual = (hargaVarian3 + rotimanis.hitungHargaPerPcs()) + ((hargaVarian3 + rotimanis.hitungHargaPerPcs()) * (50/100));
//        return hargaVarian3;
        return hargaJual;
    }
    
    
}
