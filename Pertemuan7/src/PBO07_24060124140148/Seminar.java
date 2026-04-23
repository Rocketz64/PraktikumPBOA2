/*  Nama File   : Seminar.java
    Deskripsi   : MATERI POLIMORFISME UNIVERSAL INCLUSION
    Pembuat     : Muhammad Alfaiq Rido Salafy/24060124140148
    Tanggal     : 21/04/2026
 */

package PBO07_24060124140148;

public class Seminar {
    private Civitasakademika[] pesertas;
    private int banyakpeserta;

    public Seminar() {
        this.pesertas = new Civitasakademika[100];
        this.banyakpeserta = 0;
    }

    public int countPeserta() {
        return banyakpeserta;
    }

    public void registrasi(Civitasakademika p) {
        if (banyakpeserta < 100) {
            pesertas[banyakpeserta] = p;
            banyakpeserta++;
            System.out.println(p.getNama() + " (" + p.getNomor() + ')' + " Telah Masuk!");
        } else {
            System.out.println("Kapasitas seminar penuh!!!");
        }
    }

    public void tampilPeserta() {
        System.out.println("\nDAFTAR PESERTA SEMINAR:");
        for (int i = 0; i < banyakpeserta; i++) {
            System.out.println((i + 1) + ". [" + pesertas[i].getNomor() + "] " + pesertas[i].getNama());
        }
    }

    public int countMahasiswa() {
        int jumlahMhs = 0;
        for (int i = 0; i < banyakpeserta; i++) {
            if (pesertas[i] instanceof MahasiswaNo4) {
                jumlahMhs++;
            }
        }
        return jumlahMhs;
    }
}
