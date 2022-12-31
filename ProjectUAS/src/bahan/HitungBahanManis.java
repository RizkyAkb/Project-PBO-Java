/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bahan;

/**
 *
 * @author RUDI
 */
public class HitungBahanManis extends Bahan{
    double beratSatuan = 50.0;
    double beratTotal = 2350.0;
    @Override
    public double hitungBeratBahan(double jumlahPesan) {
        this.tepungTerigu = (1000 / (this.beratTotal/this.beratSatuan)) * jumlahPesan;
        this.gulaPasir = (150 / (this.beratTotal/this.beratSatuan)) * jumlahPesan;
        this.butter = (150 / (this.beratTotal/this.beratSatuan)) * jumlahPesan;
        this.ragi = (20 / (this.beratTotal/this.beratSatuan)) * jumlahPesan;
        this.susuBubuk = (300 / (this.beratTotal/this.beratSatuan)) * jumlahPesan;
        this.susuCair = (250 / (this.beratTotal/this.beratSatuan)) * jumlahPesan;
        this.telur = (80 / (this.beratTotal/this.beratSatuan)) * jumlahPesan;
        this.esBatu = (400 / (this.beratTotal/this.beratSatuan)) * jumlahPesan;              
        
//        double[] beratDough = {this.tepungTerigu, this.gulaPasir , this.butter , 
//                this.ragi , this.susuBubuk , this.susuCair , this.telur 
//                , this.esBatu}; 
        double totalBeratDough = this.tepungTerigu + this.gulaPasir + this.butter + 
                this.ragi + this.susuBubuk + this.susuCair + this.telur 
                + this.esBatu;
        return totalBeratDough;        
    }

    public void jumlahBahanYangDibeli(){
        double totalBeratDough = this.tepungTerigu + this.gulaPasir + this.butter + 
                this.ragi + this.susuBubuk + this.susuCair + this.telur 
                + this.esBatu;
        
        double jmlTepungTerigu = Math.ceil(this.tepungTerigu/this.kemasanTepungTerigu);
        double jmlGulaPasir = Math.ceil(this.gulaPasir/this.kemasanGulaPasir);
        double jmlButter = Math.ceil(this.butter/this.kemasanButter);
        double jmlRagi = Math.ceil(this.ragi/this.kemasanRagi);
        double jmlSusuBubuk = Math.ceil(this.susuBubuk/this.kemasanSusuBubuk);
        double jmlSusuCair = Math.ceil(this.susuCair/this.kemasanSusuCair);
        double jmlTelur = Math.ceil(this.telur/this.kemasanTelur);
        double jmlEsBatu = Math.ceil(this.esBatu/this.kemasanEsBatu);        
        
        double hrgTepungTerigu = jmlTepungTerigu * this.hargaTepungTerigu;
        double hrgGulaPasir = jmlGulaPasir * this.hargaGulaPasir;
        double hrgButter = jmlButter * this.hargaButter;
        double hrgRagi = jmlRagi * this.hargaRagi;
        double hrgSusuBubuk = jmlSusuBubuk * this.hargaSusuBubuk;
        double hrgSusuCair = jmlSusuCair * this.hargaSusuCair;
        double hrgTelur = jmlTelur * this.hargaTelur;
        double hrgEsBatu = jmlEsBatu * this.hargaEsBatu;        
        double totalHrgBeli = hrgTepungTerigu + hrgGulaPasir + hrgButter + hrgRagi + hrgSusuBubuk + hrgSusuCair + hrgTelur + hrgEsBatu;
        
        System.out.println("Bahan              Berat diperlukan     Jumlah Kemasan");
        System.out.println("Tepung Terigu   "+ this.tepungTerigu + "    " +jmlTepungTerigu  + " " + hrgTepungTerigu);
        System.out.println("Gula Pasir      "+ this.gulaPasir + "       " + jmlGulaPasir + " " + hrgGulaPasir);
        System.out.println("Butter          "+ this.butter + "          " + jmlButter + " " + hrgButter);
        System.out.println("Ragi            "+ this.ragi + "    " + jmlRagi + " " + hrgRagi);
        System.out.println("Susu Bubuk      "+ this.susuBubuk + "   " + jmlSusuBubuk + " " + hrgSusuBubuk);
        System.out.println("Susu Cair       "+ this.susuCair + "    " + jmlSusuCair + " " + hrgSusuCair);
        System.out.println("Telur           "+ this.telur + "   " + jmlTelur + " " + hrgTelur);
        System.out.println("Es Batu         "+ this.esBatu + "  " + jmlEsBatu + " " + hrgEsBatu);
        System.out.println("========================================================================================");
        System.out.println("Total           "+ totalBeratDough + "   " + totalHrgBeli);
    }
}
