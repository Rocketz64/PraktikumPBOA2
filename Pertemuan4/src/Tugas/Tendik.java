/*  Nama File   : Tendik.java
    Deskripsi   : berisi atribut dan method dalam class Tendik
    Pembuat     : Muhammad Alfaiq Rido Salafy/24060124140148
    Tanggal     : 17/03/2026
 */

package Tugas;

import java.time.LocalDate;

public class Tendik extends Pegawai{
    private String bidang;

    public Tendik(String NIP, String nama, LocalDate tglLahir, LocalDate TMT, int gaji, String bidang){
        super(NIP, nama, tglLahir, TMT, gaji);
        this.bidang = bidang;
    }
    
    public String getBidang() {
        return bidang;
    }

    public void setBidang(String bidang) {
        this.bidang = bidang;
    }

    public double getTunjangan() {
        int masaKerja = hitungMasaKerjaTahun();
        return 0.01 * masaKerja * getGaji();
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Bidang: " + bidang);
        System.out.println("Tunjangan: " + getTunjangan());
    }
}
