/*  Nama File   : Datum.java
    Deskripsi   : GENERIK PADA OPERATOR
    Pembuat     : Muhammad Alfaiq Rido Salafy/24060124140148
    Tanggal     : 27/04/2026
 */

package PBO08_24060124140148;

public class OperatorGenerik {
    // Prosedur generik Tukar
    public static <T> void Tukar(Datum<T> a, Datum<T> b) {
        T temp = a.isi;
        a.isi = b.isi;
        b.isi = temp;
    }

    // Fungsi generik Bobot2
    public static <T extends Kucing> double Bobot2(T k1, T k2) {
        return k1.getBobot() + k2.getBobot();
    }
}
