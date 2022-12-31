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
        
        double totalBeratDough = this.tepungTerigu + this.gulaPasir + this.butter + 
                this.ragi + this.susuBubuk + this.susuCair + this.telur 
                + this.esBatu;
        return totalBeratDough;        
    }
    
    
    public double[] jmlBeliKemasan(){
        double jmlTepungTerigu = Math.ceil(this.tepungTerigu/this.kemasanTepungTerigu);
        double jmlGulaPasir = Math.ceil(this.gulaPasir/this.kemasanGulaPasir);
        double jmlButter = Math.ceil(this.butter/this.kemasanButter);
        double jmlRagi = Math.ceil(this.ragi/this.kemasanRagi);
        double jmlSusuBubuk = Math.ceil(this.susuBubuk/this.kemasanSusuBubuk);
        double jmlSusuCair = Math.ceil(this.susuCair/this.kemasanSusuCair);
        double jmlTelur = Math.ceil(this.telur/this.kemasanTelur);
        double jmlEsBatu = Math.ceil(this.esBatu/this.kemasanEsBatu);
        double[] jmlBeliKemasan = {jmlTepungTerigu, jmlGulaPasir, jmlButter, jmlRagi, jmlSusuBubuk, jmlSusuCair, jmlTelur, jmlEsBatu};
        return jmlBeliKemasan;
    }
    
    public double totalHargaBeli(){
        double bahan[] = jmlBeliKemasan();
        double hrgTepungTerigu = bahan[0] * this.hargaTepungTerigu;
        double hrgGulaPasir = bahan[1] * this.hargaGulaPasir;
        double hrgButter = bahan[2] * this.hargaButter;
        double hrgRagi = bahan[3] * this.hargaRagi;
        double hrgSusuBubuk = bahan[4] * this.hargaSusuBubuk;
        double hrgSusuCair = bahan[5] * this.hargaSusuCair;
        double hrgTelur = bahan[6] * this.hargaTelur;
        double hrgEsBatu = bahan[7] * this.hargaEsBatu;        
        double totalHrgBeli = hrgTepungTerigu + hrgGulaPasir + hrgButter + hrgRagi + hrgSusuBubuk + hrgSusuCair + hrgTelur + hrgEsBatu;        
        return totalHrgBeli;
    }
    
    public void tampilBahan(){
        double totalBeratDough = this.tepungTerigu + this.gulaPasir + this.butter + 
                this.ragi + this.susuBubuk + this.susuCair + this.telur 
                + this.esBatu;
        
        double bahan[] = jmlBeliKemasan();      
        
        double hrgTepungTerigu = bahan[0] * this.hargaTepungTerigu;
        double hrgGulaPasir = bahan[1] * this.hargaGulaPasir;
        double hrgButter = bahan[2] * this.hargaButter;
        double hrgRagi = bahan[3] * this.hargaRagi;
        double hrgSusuBubuk = bahan[4] * this.hargaSusuBubuk;
        double hrgSusuCair = bahan[5] * this.hargaSusuCair;
        double hrgTelur = bahan[6] * this.hargaTelur;
        double hrgEsBatu = bahan[7] * this.hargaEsBatu;
        
        System.out.println("Bahan              Berat diperlukan     Jumlah Kemasan");
        System.out.println("Tepung Terigu   "+ this.tepungTerigu + "    " +bahan[0]  + "    " + hrgTepungTerigu);
        System.out.println("Gula Pasir      "+ this.gulaPasir +    "    " + bahan[1] + "    " + hrgGulaPasir);
        System.out.println("Butter          "+ this.butter + "    " + bahan[2] + "    " + hrgButter);
        System.out.println("Ragi            "+ this.ragi + "    " + bahan[3] + "    " + hrgRagi);
        System.out.println("Susu Bubuk      "+ this.susuBubuk + "    " + bahan[4] + "    " + hrgSusuBubuk);
        System.out.println("Susu Cair       "+ this.susuCair + "    " + bahan[5] + "    " + hrgSusuCair);
        System.out.println("Telur           "+ this.telur + "    " + bahan[6] + "    " + hrgTelur);
        System.out.println("Es Batu         "+ this.esBatu + "    " + bahan[7] + "    " + hrgEsBatu);
        System.out.println("========================================================================================");
        System.out.println("Total           "+ totalBeratDough + "   " + totalHargaBeli());
    }
}
