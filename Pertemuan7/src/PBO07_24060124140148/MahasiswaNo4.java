/*  Nama File   : MahasiswaNo4.java
    Deskripsi   : MATERI POLIMORFISME UNIVERSAL INCLUSION
    Pembuat     : Muhammad Alfaiq Rido Salafy/24060124140148
    Tanggal     : 21/04/2026
 */

package PBO07_24060124140148;

public class MahasiswaNo4 extends Civitasakademika {
    private String nim;
    private Dosen dosenwali;

    public MahasiswaNo4(String nama, String nim) {
        super(nama);
        this.nim = nim;
    }

    public void setWali(Dosen d) {
        this.dosenwali = d;
    }

    @Override
    public String getNomor() {
        return nim;
    }

    public void tampilDataMahasiswa() {
        String namaWali = (dosenwali != null) ? dosenwali.getNama() : "Belum ditentukan";
        System.out.println("NIM: " + nim + " | Nama: " + nama + " | Dosen Wali: " + namaWali);
    }
}
