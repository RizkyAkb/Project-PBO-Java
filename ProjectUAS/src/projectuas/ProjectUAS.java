/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package projectuas;

import bahan.HitungBahanManis;
import java.util.Scanner;

/**
 *
 * @author RUDI
 */
public class ProjectUAS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("TOKO ROTI PAK RAYY");
        System.out.println("===================");
        System.out.println("1. Menu");
        System.out.println("2. Pesan");
        System.out.println("3. Keranjang");
        System.out.println("4. Total Harga");
        System.out.println("===================");
        System.out.print("Pilihan : ");
        Scanner input = new Scanner (System.in);
        int tokoroti = input.nextInt();
        
        switch(tokoroti){
            // Menu Toko Roti Pak Rayy
            case 1 :
                System.out.println("1. Roti Manis");
                System.out.println("   a. Varian 1");
                System.out.println("      - Filling = Keju, Coklat");
                System.out.println("      - Topping  = Coklat");
                
                System.out.println("   b. Varian 2");
                System.out.println("      - Filling = Red Beans");
                System.out.println("      - Topping  = Krim Vanilla");
                
                System.out.println("   c. Varian 3");
                System.out.println("      - Filling = Keju, Sosis");
                
                System.out.println("2. Roti Tawar");
                System.out.println("   a. Varian 1");
                System.out.println("      - Filling = Coklat");
                
                System.out.println("   b. Varian 2");
                System.out.println("      - Filling = Keju");
                
                System.out.println("3. Pizza");
                System.out.println("   a. Varian 1");
                System.out.println("      - Topping = Keju, Sosis, Smoked Beef, Bawang Bombay");
        }
        
        
        
//        HitungBahanManis hb = new HitungBahanManis();
//        ManisperKemasan = (Math.ceil(hb));
                
//       System.out.println("Harga roti manis per kemasan: Rp "+
//              (hb.hitungHargaPerPcs()));
    }
    
}
