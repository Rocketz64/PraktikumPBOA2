/*  Nama File   : Pegawai.java
    Deskripsi   : berisi atribut dan method dalam class Pegawai
    Pembuat     : Muhammad Alfaiq Rido Salafy/24060124140148
    Tanggal     : 17/03/2026
 */

package Tugas;

import java.time.LocalDate;
import java.time.Period;

public class Pegawai {
    protected String NIP;
    protected String nama;
    protected LocalDate tglLahir;
    protected LocalDate TMT;
    protected int gaji;
    protected static int counterPegawai = 0;

    public Pegawai(){
        counterPegawai++;
    }

    public Pegawai(String NIP, String nama, LocalDate tglLahir, LocalDate TMT, int gaji){
        this.NIP = NIP;
        this.nama = nama;
        this.tglLahir = tglLahir;
        this.TMT = TMT;
        this.gaji = gaji;
        counterPegawai++;
    }

    public String getNIP(){
        return NIP;
    }

    public String getNama(){
        return nama;
    }

    public LocalDate getTglLahir(){
        return tglLahir;
    }

    public LocalDate getTMT(){
        return TMT;
    }

    public int getGaji(){
        return gaji;
    }


    public void setNIP(String NIP){
        this.NIP = NIP;
    }

    public void setNama(String nama){
        this.nama = nama;
    }

    public void setTglLahir(LocalDate tglLahir){
        this.tglLahir= tglLahir;
    }

    public void setTMT(LocalDate TMT){
        this.TMT = TMT;
    }

    public void setGaji(int gaji){
        this.gaji = gaji;
    }


    public int hitungMasaKerjaTahun() {
        LocalDate sekarang = LocalDate.now();
        Period p = Period.between(TMT, sekarang);
        return p.getYears();
    }

    public String hitungMasaKerja() {
        LocalDate sekarang = LocalDate.now();
        Period p = Period.between(TMT, sekarang);
        return p.getYears() + " tahun " + p.getMonths() + " bulan";
    }


    public void printInfo(){
        System.out.println("NIP: " + NIP);
        System.out.println("Nama: " + nama);
        System.out.println("Tgl Lahir: " + tglLahir);
        System.out.println("TMT: " + TMT);
        System.out.println("Gaji: " + gaji);
    }

    public void printCounterBangunDatar(){
        System.out.println("Jumlah Pegawai: " + counterPegawai);
    }
}
