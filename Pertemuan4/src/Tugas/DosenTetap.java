/*  Nama File   : DosenTetap.java
    Deskripsi   : berisi atribut dan method dalam class Dosen Tetap
    Pembuat     : Muhammad Alfaiq Rido Salafy/24060124140148
    Tanggal     : 17/03/2026
 */

package Tugas;

import java.time.LocalDate;

public class DosenTetap extends Dosen{
    private String NIDN;

    public DosenTetap(String NIP, String nama, LocalDate tglLahir, LocalDate TMT, int gaji, String fakultas, String NIDN) {
        super(NIP, nama, tglLahir, TMT, gaji, fakultas);
        this.NIDN = NIDN;
    }

    public String getNidn() {
        return NIDN;
    }

    public void setNidn(String NIDN) {
        this.NIDN = NIDN;
    }

    public double getTunjangan() {
        int masaKerja = hitungMasaKerjaTahun();
        return 0.02 * masaKerja * getGaji();
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("NIDN: " + NIDN);
        System.out.println("Fakultas: " + getFakultas());
        System.out.println("Tunjangan: " + getTunjangan());
    }
}
