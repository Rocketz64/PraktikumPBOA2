/*  Nama File   : Manusia.java
    Deskripsi   : berisi atribut dan method dalam abstract class Manusia
    Pembuat     : Muhammad Alfaiq Rido Salafy/24060124140148
    Tanggal     : 18/03/2026
 */

package Tugas;

import java.time.LocalDate;

public abstract class Manusia {
    //Atribut
    protected String nama;
    protected LocalDate tgl_mulai_kerja;
    protected String alamat;
    protected double pendapatan;
    protected static int counterMhs = 0;


    //Method
    //Constructor
    public Manusia(){
        counterMhs++;
    }

    public Manusia(String nama, LocalDate tgl_mulai_kerja, String alamat, double pendapatan){
        this.nama = nama;
        this.tgl_mulai_kerja = tgl_mulai_kerja;
        this.alamat = alamat;
        this.pendapatan = pendapatan;
        counterMhs++;
    }


    //Selektor
    public String getNama(){
        return this.nama;
    }

    public LocalDate getTglMulaiKerja(){
        return this.tgl_mulai_kerja;
    }

    public String getAlamat(){
        return this.alamat;
    }

    public double getPendapatan(){
        return this.pendapatan;
    }

    public static int getCounterMhs(){
        return counterMhs;
    }


    //Mutator
    public void setNama(String nama){
        this.nama = nama;
    }

    public void setTglMulaiKerja(LocalDate tgl_mulai_kerja){
        this.tgl_mulai_kerja = tgl_mulai_kerja;
    }

    public void setAlamat(String alamat){
        this.alamat = alamat;
    }

    public void setPendapatan(double pendapatan){
        this.pendapatan = pendapatan;
    }


    //cetakInfo
    public void cetakInfo(){
        System.out.println("Nama: " + nama);
        System.out.println("Mulai Kerja: " + tgl_mulai_kerja);
        System.out.println("Alamat: " + alamat);
        System.out.println("Pendapatan: " + pendapatan);
    }

    public static void printCounterMhs(){
        System.out.println("Jumlah Mahasiswa: " + counterMhs);
    }


    //Abstarct Function
    public abstract int hitungMasaKerja();
}
