/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bahan;

/**
 *
 * @author RUDI
 */
public class HitungBahanManis extends Bahan {
    double beratSatuan = 50.0;
    double beratTotal = 2350.0;    

    //Menghitung total berat bahan
    @Override
    public double hitungBeratBahan(int jumlahPesan) {        
        this.tepungTerigu = (1000 / (this.beratTotal / this.beratSatuan)) * jumlahPesan;
        this.gulaPasir = (150 / (this.beratTotal / this.beratSatuan)) * jumlahPesan;
        this.butter = (150 / (this.beratTotal / this.beratSatuan)) * jumlahPesan;
        this.ragi = (20 / (this.beratTotal / this.beratSatuan)) * jumlahPesan;
        this.susuBubuk = (300 / (this.beratTotal / this.beratSatuan)) * jumlahPesan;
        this.susuCair = (250 / (this.beratTotal / this.beratSatuan)) * jumlahPesan;
        this.telur = (80 / (this.beratTotal / this.beratSatuan)) * jumlahPesan;
        this.esBatu = (400 / (this.beratTotal / this.beratSatuan)) * jumlahPesan;

        this.totalBeratDough = this.tepungTerigu + this.gulaPasir + this.butter
                + this.ragi + this.susuBubuk + this.susuCair + this.telur
                + this.esBatu;
        return totalBeratDough;
    }

    //menghitung harga bahan satuan berdasarkan banyaknya bahan yang diperlukan
    @Override
    public void hitungHargaBahan() {
        this.hrgTepungTerigu = this.tepungTerigu / this.kemasanTepungTerigu * this.hargaTepungTerigu;
        this.hrgGulaPasir = this.gulaPasir / this.kemasanGulaPasir * this.hargaGulaPasir;
        this.hrgButter = this.butter / this.kemasanButter * this.hargaButter;
        this.hrgRagi = this.ragi / this.kemasanRagi * this.hargaRagi;
        this.hrgSusuBubuk = this.susuBubuk / this.kemasanSusuBubuk * this.hargaSusuBubuk;
        this.hrgSusuCair = this.susuCair / this.kemasanSusuCair * this.hargaSusuCair;
        this.hrgTelur = this.telur / this.kemasanTelur * this.hargaTelur;
        this.hrgEsBatu = this.esBatu / this.kemasanEsBatu * this.hargaEsBatu;
    }

    //Menghitung harga yang perlu dibayar untuk bahan yang dibeli
    @Override
    public double totalHargaBeli() {
        double totalHrgBeli = this.hrgTepungTerigu + this.hrgGulaPasir + this.hrgButter + this.hrgRagi + this.hrgSusuBubuk + this.hrgSusuCair + this.hrgTelur + this.hrgEsBatu;
        return totalHrgBeli;
    }

    //Menampilkan tabel bahan    
    @Override
    public void tampilBahan() {
        hitungHargaBahan();
        System.out.println("=================================================================");
        System.out.println("\t\t\t    DOUGH");
        System.out.println("=================================================================");
        System.out.println("Bahan                   Berat diperlukan             Harga");
        System.out.println("=================================================================");
        System.out.println("Tepung Terigu \t\t" + numberFormat.format(this.tepungTerigu) + " gr " + "\t\t Rp " + numberFormat.format(this.hrgTepungTerigu));
        System.out.println("Gula Pasir \t\t" + numberFormat.format(this.gulaPasir) + " gr " + "\t\t Rp " + numberFormat.format(this.hrgGulaPasir));
        System.out.println("Butter \t\t\t" + numberFormat.format(this.butter) + " gr " + "\t\t Rp " + numberFormat.format(this.hrgButter));
        System.out.println("Ragi \t\t\t" + numberFormat.format(this.ragi) + " gr " + "\t\t Rp " + numberFormat.format(this.hrgRagi));
        System.out.println("Susu Bubuk \t\t" + numberFormat.format(this.susuBubuk) + " gr " + "\t\t Rp " + numberFormat.format(this.hrgSusuBubuk));
        System.out.println("Susu Cair \t\t" + numberFormat.format(this.susuCair) + " gr " + "\t\t Rp " + numberFormat.format(this.hrgSusuCair));
        System.out.println("Telur \t\t\t" + numberFormat.format(this.telur) + " gr " + "\t\t Rp " + numberFormat.format(this.hrgTelur));
        System.out.println("Es Batu \t\t" + numberFormat.format(this.esBatu) + " gr " + "\t\t Rp " + numberFormat.format(this.hrgEsBatu));
        System.out.println("----------------------------------------------------------------- + ");
        System.out.println("Total \t\t\t" + numberFormat.format(this.totalBeratDough) + " gr \t\t Rp " + numberFormat.format(totalHargaBeli()));        
        System.out.println(" ");
    }
}
