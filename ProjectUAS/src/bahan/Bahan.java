/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bahan;

import java.text.DecimalFormat;

/**
 *
 * @author RUDI
 */
public abstract class Bahan {

    double tepungTerigu, gulaPasir, butter, ragi, susuBubuk, susuCair, telur, esBatu;
    double kemasanTepungTerigu = 1000,
            kemasanGulaPasir = 1000,
            kemasanButter = 500,
            kemasanRagi = 11,
            kemasanSusuBubuk = 1000,
            kemasanSusuCair = 1000,
            kemasanTelur = 1000,
            kemasanEsBatu = 1000;
    double hargaTepungTerigu = 40000,
            hargaGulaPasir = 25000,
            hargaButter = 23000,
            hargaRagi = 5000,
            hargaSusuBubuk = 39000,
            hargaSusuCair = 24000,
            hargaTelur = 23000,
            hargaEsBatu = 2000;
    double hrgTepungTerigu, hrgGulaPasir, hrgButter, hrgRagi, hrgSusuBubuk, hrgSusuCair, hrgTelur, hrgEsBatu;
    double totalBeratDough;

    DecimalFormat numberFormat = new DecimalFormat("#.00");

    public abstract double hitungBeratBahan(double jumlahPesan);

    public abstract void hitungHargaBahan();

    public abstract double totalHargaBeli();

    public abstract void tampilBahan();
}
