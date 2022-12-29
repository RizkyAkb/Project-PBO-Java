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
public class Pizza extends BahanVarian{
    
    @Override
    public double Varian1() {
        this.keju = 30 * (31000/250);
        this.sosis = 50 * (80000/1000);
        this.beef = 50 * (90000/1000);
        this.bawang = 30 * (40000/500);
        double hargaVarian1 = this.keju + this.sosis + this.beef + this.bawang;
        return hargaVarian1;
    }
}
