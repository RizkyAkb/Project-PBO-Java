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
double tepungTerigu;
double gulaPasir;
double butter;
double ragi;
double susuBubuk;
double susuCair;
double telur;
double esBatu;
double kemasanTepungTerigu = 1000;
double kemasanGulaPasir = 1000;
double kemasanButter = 500;
double kemasanRagi = 11;
double kemasanSusuBubuk = 1000;
double kemasanSusuCair = 1000;
double kemasanTelur = 1000;
double kemasanEsBatu = 1000;
double hargaTepungTerigu = 40000;
double hargaGulaPasir = 25000;
double hargaButter = 23000;
double hargaRagi = 5000;
double hargaSusuBubuk = 39000;
double hargaSusuCair = 24000;
double hargaTelur = 23000;
double hargaEsBatu = 2000;

DecimalFormat numberFormat = new DecimalFormat("#.00");
public abstract double hitungBeratBahan(double jumlahPesan);

//public abstract double hitungTotalHargaBahan();


}
