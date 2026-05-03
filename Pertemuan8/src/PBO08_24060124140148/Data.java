/*  Nama File   : Datum.java
    Deskripsi   : LARIK GENERIK
    Pembuat     : Muhammad Alfaiq Rido Salafy/24060124140148
    Tanggal     : 03/05/2026
 */

package PBO08_24060124140148;

public class Data<T> {
    private T[] ruang;
    private int banyak;

    @SuppressWarnings("unchecked")
    public Data(){
        ruang = (T[]) new Object[100];
        banyak = 0;
    }

    public T getIsi(int posisi){
        if (posisi < 1 || posisi > banyak) {
            System.out.println("Posisi tidak valid");
            return null;
        }

        return ruang[posisi - 1];
    }

    public void setIsi(int posisi, T objek){
        if (posisi < 1 || posisi > 100){
            System.out.println("Posisi diluar range!");
            return;
        }

        ruang[posisi - 1] = objek;

        if (posisi > banyak) {
            banyak = posisi;
        }
    }

    public int getSize(){
        return banyak;
    }
}
