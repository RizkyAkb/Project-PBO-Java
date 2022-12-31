/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package projectuas;

import bahan.HitungBahanManis;
import bahan.HitungBahanPizza;
import bahan.HitungBahanTawar;
import java.util.Scanner;
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
        System.out.println("TOKO ROTI PAK RAYY");
        System.out.println("===================");
        System.out.println("1. Menu");
        System.out.println("2. Pesanan");
        System.out.println("5. Exit");
        System.out.println("===================");
        System.out.print("Pilihan : ");
        Scanner input = new Scanner(System.in);
        int mainmenu = input.nextInt();

        switch (mainmenu) {
            // Menu Toko Roti Pak Rayyyy
            case 1:
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
                double jumlahPesan = input.nextDouble();
                if (pesan == 1) {
                    HitungBahanManis hbm = new HitungBahanManis();
                    RotiManis rm = new RotiManis();
                    hbm.hitungBeratBahan(jumlahPesan);
                    hbm.tampilBahan();
                    System.out.println("Harga satuan : " + rm.varian1(jumlahPesan));
                } else if (pesan == 2) {
                    HitungBahanManis hbm = new HitungBahanManis();
                    RotiManis rm = new RotiManis();
                    hbm.hitungBeratBahan(jumlahPesan);
                    hbm.tampilBahan();
                    System.out.println("Harga satuan : " + rm.varian2(jumlahPesan));
                } else if (pesan == 3) {
                    HitungBahanManis hbm = new HitungBahanManis();
                    RotiManis rm = new RotiManis();
                    hbm.hitungBeratBahan(jumlahPesan);
                    hbm.tampilBahan();
                    System.out.println("Harga satuan : " + rm.varian3(jumlahPesan));
                } else if (pesan == 4) {
                    HitungBahanTawar hbt = new HitungBahanTawar();
                    RotiTawar rt = new RotiTawar();
                    hbt.hitungBeratBahan(jumlahPesan);
                    hbt.tampilBahan();
                    System.out.println("Harga satuan : " + rt.varian1(jumlahPesan));
                } else if (pesan == 5) {
                    HitungBahanManis hbm = new HitungBahanManis();
                    RotiManis rm = new RotiManis();
                    hbm.hitungBeratBahan(jumlahPesan);
                    hbm.tampilBahan();
                    System.out.println("Harga satuan : " + rm.varian1(jumlahPesan));
                } else if (pesan == 6) {
                    HitungBahanManis hbm = new HitungBahanManis();
                    RotiManis rm = new RotiManis();
                    hbm.hitungBeratBahan(jumlahPesan);
                    hbm.tampilBahan();
                    System.out.println("Harga satuan : " + rm.varian1(jumlahPesan));
                } else {
                    System.out.println("Pilihan tidak tersedia");
                }
                break;

            // EXIT
        }

//        HitungBahanManis hb = new HitungBahanManis();
//        ManisperKemasan = (Math.ceil(hb));
//       System.out.println("Harga roti manis per kemasan: Rp "+
//              (hb.hitungHargaPerPcs()));
    }

}
