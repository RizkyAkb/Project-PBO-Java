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

    @Override
    public double Varian1() {
        this.coklat = 80 * (29000/500);
        return this.coklat;
    }

    @Override
    public double varian2() {
        this.keju = 80 * (31000/250);
        return this.keju;
    }
    
}
