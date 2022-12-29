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
public class RotiTawar extends BahanVarian implements Varian2{
    HitungBahanTawar rotitawar = new HitungBahanTawar();

    @Override
    public double Varian1() {
        this.coklat = 80 * (29000/500);
        double hargaVarian1 = this.coklat;
        double hargaJual = (hargaVarian1 + rotitawar.hitungHargaPerPcs()) + ((hargaVarian1 + rotitawar.hitungHargaPerKemasan())*(50/100));
        return hargaJual;
    }

    @Override
    public double varian2() {
        this.keju = 80 * (31000/250);
        double hargaVarian2 = this.keju;
        double hargaJual = (hargaVarian2 + rotitawar.hitungHargaPerPcs()) + ((hargaVarian2 + rotitawar.hitungHargaPerKemasan())*(50/100));
        return hargaJual;
    }
    
}
