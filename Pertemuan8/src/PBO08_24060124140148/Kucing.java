/*  Nama File   : Kucing.java
    Deskripsi   : GENERIK PADA CLASS
    Pembuat     : Muhammad Alfaiq Rido Salafy/24060124140148
    Tanggal     : 27/04/2026
 */

package PBO08_24060124140148;

public class Kucing extends Anabul {

    double bobot;

    public Kucing(String nama, double bobot) {
        super(nama);
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
