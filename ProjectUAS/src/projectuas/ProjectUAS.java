/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package projectuas;

import bahan.HitungBahanManis;
import bahan.HitungBahanPizza;
import bahan.HitungBahanTawar;
import java.util.Scanner;
import varian.Pizza;
import varian.RotiManis;
import varian.RotiTawar;

/**
 *
 * @author RUDI
 */
public class ProjectUAS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        boolean main = false;
        while (!main) {
            System.out.println("TOKO ROTI PAK RAYY");
            System.out.println("===================");
            System.out.println("1. Menu");
            System.out.println("2. Pesanan");
            System.out.println("3. Exit");
            System.out.println("===================");
            System.out.print("Pilihan : ");
            Scanner input = new Scanner(System.in);
            int mainmenu = input.nextInt();

            switch (mainmenu) {
                case 1:
                    // Menu Toko Roti Pak Rayyyy
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
                    System.out.println("===========================================================");
                    System.out.println("1.Kembali 2.Keluar");
                    System.out.print("Pilihan : ");
                    int pilihMenu = input.nextInt();
                    if (pilihMenu == 1) {
                        main = false;
                    } else if (pilihMenu == 2) {
                        System.exit(0);
                    }
                    break;

                case 2:
                    // Pesanan
                    System.out.println("=======================");
                    System.out.println("Silahkan Pilih Menu");
                    System.out.println("=======================");
                    System.out.println("1. Roti Manis Varian 1");
                    System.out.println("2. Roti Manis Varian 2");
                    System.out.println("3. Roti Manis Varian 3");
                    System.out.println("4. Roti Tawar Varian 1");
                    System.out.println("5. Roti Tawar Varian 2");
                    System.out.println("6. Pizza Varian 1");
                    System.out.print("Pilih Menu : ");
                    int pesan = input.nextInt();
                    System.out.print("Pilih Jumlah : ");
                    int jumlahPesan = input.nextInt();
                    if (pesan == 1) {
                        RotiManis rm = new RotiManis();
                        rm.varian1(jumlahPesan);
                    } else if (pesan == 2) {
                        RotiManis rm = new RotiManis();
                        rm.varian2(jumlahPesan);
                    } else if (pesan == 3) {                        
                        RotiManis rm = new RotiManis();
                        rm.varian3(jumlahPesan);
                    } else if (pesan == 4) {
                        RotiTawar rt = new RotiTawar();
                        rt.varian1(jumlahPesan);
                    } else if (pesan == 5) {                        
                        RotiTawar rt = new RotiTawar();
                        rt.varian2(jumlahPesan);
                    } else if (pesan == 6) {                        
                        Pizza p = new Pizza();
                        p.varian1(jumlahPesan);
                    } else {
                        System.out.println("Pilihan tidak tersedia");
                    }
                    break;
                case 3:
                    System.exit(0);
                default:
                    System.out.println("Pilihan Anda tidak tersedia!!");

            }
        }

    }

}
