/*  Nama File   : Burung.java
    Deskripsi   : KOLEKSI KELAS BENTUKAN
    Pembuat     : Muhammad Alfaiq Rido Salafy/24060124140148
    Tanggal     : 04/05/2026
 */

package PBO09_24060124140148;

public class Burung extends Anabul {
    public Burung(String nama, String panggilan) {
        super(nama, panggilan);
    }

    @Override
    public void Gerak() {
        System.out.println(getNama() + " bergerak dengan terbang.");
    }

    @Override
    public void Bersuara() {
        System.out.println(getNama() + " bersuara: Cuit!");
    }
}
