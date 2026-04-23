/*  Nama File   : Mahasiswa.java
    Deskripsi   : MATERI POLIMORFISME AD HOC COERCION
    Pembuat     : Muhammad Alfaiq Rido Salafy/24060124140148
    Tanggal     : 20/04/2026
 */

package PBO07_24060124140148;

public class Mahasiswa {
    private int nim;
    private String nama;
    private String programStudi;

    public Mahasiswa() {
        this.nim = -999;
        this.nama = "NULL";
        this.programStudi = "NULL";
    }

    public Mahasiswa(int nim, String nama, String programStudi) {
        this.nim = nim;
        this.nama = nama;
        this.programStudi = programStudi;
    }

    public Mahasiswa(Mahasiswa m) {
        this.nim = m.nim;
        this.nama = m.nama;
        this.programStudi = m.programStudi;
    }

    public void setProgramStudi() {
        this.programStudi = "NULL";
    }

    public void setProgramStudi(String programStudi) {
        this.programStudi = programStudi;
    }

    public void setProgramStudi(Mahasiswa m) {
        this.programStudi = m.programStudi;
    }

    public void printInfo() {
        System.out.println("\nNIM: " + nim + "\nNama: " + nama + "\nProdi: " + programStudi + "\n");
    }
}
