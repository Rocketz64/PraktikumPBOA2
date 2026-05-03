/*  Nama File   : Datum.java
    Deskripsi   : GENERIK PADA CLASS
    Pembuat     : Muhammad Alfaiq Rido Salafy/24060124140148
    Tanggal     : 27/04/2026
 */

package PBO08_24060124140148;

public class Datum<T> {
    public T isi;

    public Datum(T isi) {
        this.isi = isi;
    }

    public T getIsi() {
        return isi;
    }

    public void setIsi(T isiBaru) {
        this.isi = isiBaru;
    }
}
