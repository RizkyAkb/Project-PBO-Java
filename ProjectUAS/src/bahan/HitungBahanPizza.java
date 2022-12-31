/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bahan;

/**
 *
 * @author RUDI
 */
public class HitungBahanPizza extends Bahan{
    double beratSatuan = 190.0;
    double beratTotal = 1950.0;
    @Override
    public double hitungBeratBahan(double jumlahPesan) {
        this.tepungTerigu = (1000  / (this.beratTotal/this.beratSatuan)) * jumlahPesan;
        this.gulaPasir = (100 / (this.beratTotal/this.beratSatuan)) * jumlahPesan;
        this.butter = (100 / (this.beratTotal/this.beratSatuan)) * jumlahPesan;
        this.ragi = (20 / (this.beratTotal/this.beratSatuan)) * jumlahPesan;
        this.susuBubuk = (200 / (this.beratTotal/this.beratSatuan)) * jumlahPesan;
        this.susuCair = (180 / (this.beratTotal/this.beratSatuan)) * jumlahPesan;
        this.telur = (50 / (this.beratTotal/this.beratSatuan)) * jumlahPesan;
        this.esBatu = (300 / (this.beratTotal/this.beratSatuan)) * jumlahPesan;
        
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
        
        System.out.println("=====================================================================");
        System.out.println("Bahan              Berat diperlukan         Jumlah Kemasan      Harga");
        System.out.println("=====================================================================");
        System.out.println("Tepung Terigu \t\t" + this.tepungTerigu + "\t\t\t" + bahan[0] + "\t\t" + hrgTepungTerigu);
        System.out.println("Gula Pasir \t\t"    + this.gulaPasir    + "\t\t\t" + bahan[1] + "\t\t" + hrgGulaPasir);
        System.out.println("Butter \t\t\t"      + this.butter       + "\t\t\t" + bahan[2] + "\t\t" + hrgButter);
        System.out.println("Ragi \t\t\t"        + this.ragi         + "\t\t\t" + bahan[3] + "\t\t" + hrgRagi);
        System.out.println("Susu Bubuk \t\t"    + this.susuBubuk    + "\t\t\t" + bahan[4] + "\t\t" + hrgSusuBubuk);
        System.out.println("Susu Cair \t\t"     + this.susuCair     + "\t\t\t" + bahan[5] + "\t\t" + hrgSusuCair);
        System.out.println("Telur \t\t\t"       + this.telur        + "\t\t\t" + bahan[6] + "\t\t" + hrgTelur);
        System.out.println("Es Batu \t\t"       + this.esBatu       + "\t\t\t" + bahan[7] + "\t\t" + hrgEsBatu);
        System.out.println("========================================================================================");
        System.out.println("Total \t\t\t"       + totalBeratDough   + "\t\t\t\t\t"        + totalHargaBeli());
    }
    
//    public double hitungHargaPerPcs(){
//        double hargaPerPcs = Math.ceil(this.hitungHargaPerKemasan() /47);
//        return hargaPerPcs;
//    }
}
