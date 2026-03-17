/*  Nama File   : DosenTamu.java
    Deskripsi   : berisi atribut dan method dalam class Dosen Tamu
    Pembuat     : Muhammad Alfaiq Rido Salafy/24060124140148
    Tanggal     : 17/03/2026
 */

package Tugas;

import java.time.LocalDate;

public class DosenTamu extends Dosen{
    private String NIDK;
    private LocalDate akhirKontrak;

    public DosenTamu(String NIP, String nama, LocalDate tglLahir, LocalDate TMT, int gaji, String fakultas, String NIDK, LocalDate akhirKontrak){
        super(NIP, nama, tglLahir, TMT, gaji, fakultas);
        this.NIDK = NIDK;
        this.akhirKontrak = akhirKontrak;
    }

    public String getNidk() {
        return NIDK;
    }
    public LocalDate getAkhirKontrak() {
        return akhirKontrak;
    }

    public void setNidk(String NIDK) {
        this.NIDK = NIDK;
    }

    public void setAkhirKontrak(LocalDate akhirKontrak) {
        this.akhirKontrak = akhirKontrak;
    }

    public double getTunjangan() {
    return 0.025 * getGaji();
}

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("NIDK: " + NIDK);
        System.out.println("Kontrak Berakhir: " + akhirKontrak);
        System.out.println("Fakultas: " + getFakultas());
        System.out.println("Tunjangan: " + getTunjangan());
    }
}
