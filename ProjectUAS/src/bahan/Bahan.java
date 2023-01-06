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

    //Dough
    double tepungTerigu, gulaPasir, butter, ragi, susuBubuk, susuCair, telur, esBatu;
    int kemasanTepungTerigu = 1000,
            kemasanGulaPasir = 1000,
            kemasanButter = 500,
            kemasanRagi = 11,
            kemasanSusuBubuk = 1000,
            kemasanSusuCair = 1000,
            kemasanTelur = 1000,
            kemasanEsBatu = 1000,
            hargaTepungTerigu = 40000,
            hargaGulaPasir = 25000,
            hargaButter = 23000,
            hargaRagi = 5000,
            hargaSusuBubuk = 39000,
            hargaSusuCair = 24000,
            hargaTelur = 23000,
            hargaEsBatu = 2000;
    double hrgTepungTerigu, hrgGulaPasir, hrgButter, hrgRagi, hrgSusuBubuk, hrgSusuCair, hrgTelur, hrgEsBatu;
    double totalBeratDough;

    //Varian
    protected double keju, coklat, krim, selai, sosis, smokedBeef, bawangBombai;
    protected int kemasanKeju = 250,
            kemasanCoklat = 500,
            kemasanKrim = 500, kemasanSelai = 500,
            kemasanSosis = 1000,
            kemasanSmokedBeef = 1000,
            kemasanBawangBombai = 500,
            hargaKeju = 31000,
            hargaCoklat = 29000,
            hargaKrim = 30000,
            hargaSelai = 25000,
            hargaSosis = 80000,
            hargaSmokedBeef = 90000,
            hargaBawangBombai = 40000,
            jumlahPesan;

    protected DecimalFormat numberFormat = new DecimalFormat("#.00");

    public abstract double hitungBeratBahan(int jumlahPesan);

    public abstract void hitungHargaBahan();

    public abstract double totalHargaBeli();

    public abstract void tampilBahan();
}
