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
    
    @Override
    public double Varian1() {
        this.keju = 5 * (31000/250);
        this.coklat = 10 * (29000/500);
        double hargaVarian1 = this.keju + this.coklat;
        return hargaVarian1;
    }

    @Override
    public double varian2() {
    }

    @Override
    public double varian3() {
    }
    
    
}
