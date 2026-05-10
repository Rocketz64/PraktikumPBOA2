/*  Nama File   : Kucing.java
    Deskripsi   : KOLEKSI KELAS BENTUKAN
    Pembuat     : Muhammad Alfaiq Rido Salafy/24060124140148
    Tanggal     : 04/05/2026
 */

package PBO09_24060124140148;

public class Kucing extends Anabul {

    double bobot;

    public Kucing(String nama, String panggilan, double bobot) {
        super(nama, panggilan);
        this.bobot = bobot;
    }

    public double getBobot(){
        return this.bobot;
    }

    public void setBobot(double bobot){
        this.bobot = bobot;
    }

    @Override
    public void Gerak() {
        System.out.println(getNama() + " bergerak dengan melata.");
    }

    @Override
    public void Bersuara() {
        System.out.println(getNama() + " bersuara: Meong!");
    }

    public void tampilkanBobot() {
        System.out.println("Bobot " + getNama() + ": " + bobot + " kg");
    }
}
