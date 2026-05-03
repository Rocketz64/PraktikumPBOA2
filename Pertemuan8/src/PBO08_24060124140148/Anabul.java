/*  Nama File   : Anabul.java
    Deskripsi   : GENERIK PADA CLASS
    Pembuat     : Muhammad Alfaiq Rido Salafy/24060124140148
    Tanggal     : 27/04/2026
 */

package PBO08_24060124140148;

public abstract class Anabul {
    private String nama;

    public Anabul(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return nama;
    }

    public abstract void Gerak();
    public abstract void Bersuara();
}