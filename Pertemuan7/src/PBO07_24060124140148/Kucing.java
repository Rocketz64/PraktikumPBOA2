/*  Nama File   : Kucing.java
    Deskripsi   : MATERI POLIMORFISME UNIVERSAL INCLUSION
    Pembuat     : Muhammad Alfaiq Rido Salafy/24060124140148
    Tanggal     : 21/04/2026
 */

package PBO07_24060124140148;

public class Kucing extends Anabul {
    public Kucing(String nama) {
        super(nama);
    }

    @Override
    public void Gerak() {
        System.out.println(getNama() + " bergerak dengan melata.");
    }

    @Override
    public void Bersuara() {
        System.out.println(getNama() + " bersuara: Meong!");
    }
}
