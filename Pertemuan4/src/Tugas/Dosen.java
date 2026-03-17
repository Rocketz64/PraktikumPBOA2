/*  Nama File   : Dosen.java
    Deskripsi   : berisi atribut dan method dalam class Dosen
    Pembuat     : Muhammad Alfaiq Rido Salafy/24060124140148
    Tanggal     : 17/03/2026
 */

package Tugas;

import java.time.LocalDate;

public class Dosen extends Pegawai {
    protected String fakultas;

    public Dosen(String NIP, String nama, LocalDate tglLahir, LocalDate TMT, int gaji, String fakultas) {
        super(NIP, nama, tglLahir, TMT, gaji);
        this.fakultas = fakultas;
    }

    public String getFakultas() {
        return fakultas;
    }

    public void setFakultas(String fakultas) {
        this.fakultas = fakultas;
    }
}
