/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package projectuas;

import bahan.HitungBahanManis;

/**
 *
 * @author RUDI
 */
public class ProjectUAS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        HitungBahanManis hb = new HitungBahanManis();
//        ManisperKemasan = (Math.ceil(hb));
                
        System.out.println("Harga roti manis per kemasan: Rp "+
                (hb.hitungHargaPerPcs()));
    }
    
}
