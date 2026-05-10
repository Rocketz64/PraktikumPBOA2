/*  Nama File   : Anabul.java
    Deskripsi   : KOLEKSI KELAS BENTUKAN
    Pembuat     : Muhammad Alfaiq Rido Salafy/24060124140148
    Tanggal     : 04/05/2026
 */

package PBO09_24060124140148;

public abstract class Anabul {
    private String nama;
    private String panggilan;

    public Anabul(String nama, String panggilan) {
        this.nama = nama;
        this.panggilan = panggilan;
    }

    public String getNama() {
        return nama;
    }

    public String getNama2() {
        return panggilan;
    }

    public void setNama(String panggilan) {
        this.panggilan = panggilan;
    }

    public abstract void Gerak();
    public abstract void Bersuara();
}