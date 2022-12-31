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
    
    //Menghitung total berat bahan
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
    
    //Menghitung jumlah kemasan yang perlu dibeli untuk masing-masing bahan
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
    
    //Menghitung harga yang perlu dibayar untuk bahan yang dibeli
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
    
    //Menampilkan tabel bahan
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
        
        System.out.println("===========================================================================");
        System.out.println("Bahan              Berat diperlukan         Jumlah Kemasan          Harga");
        System.out.println("===========================================================================");
        System.out.println("Tepung Terigu \t\t" + numberFormat.format(this.tepungTerigu) + " gr \t\t" + bahan[0] + "\t\t Rp " + hrgTepungTerigu);
        System.out.println("Gula Pasir \t\t"    + numberFormat.format(this.gulaPasir)    + " gr \t\t" + bahan[1] + "\t\t Rp " + hrgGulaPasir);
        System.out.println("Butter \t\t\t"      + numberFormat.format(this.butter)       + " gr \t\t" + bahan[2] + "\t\t Rp " + hrgButter);
        System.out.println("Ragi \t\t\t"        + numberFormat.format(this.ragi)         + " gr \t\t" + bahan[3] + "\t\t Rp " + hrgRagi);
        System.out.println("Susu Bubuk \t\t"    + numberFormat.format(this.susuBubuk)    + " gr \t\t" + bahan[4] + "\t\t Rp " + hrgSusuBubuk);
        System.out.println("Susu Cair \t\t"     + numberFormat.format(this.susuCair)     + " gr \t\t" + bahan[5] + "\t\t Rp " + hrgSusuCair);
        System.out.println("Telur \t\t\t"       + numberFormat.format(this.telur)        + " gr \t\t" + bahan[6] + "\t\t Rp " + hrgTelur);
        System.out.println("Es Batu \t\t"       + numberFormat.format(this.esBatu)       + " gr \t\t" + bahan[7] + "\t\t Rp " + hrgEsBatu);
        System.out.println("===========================================================================");
        System.out.println("Total \t\t\t"       + numberFormat.format(totalBeratDough)   + " gr \t\t\t\t Rp "      + totalHargaBeli());
    }
}
