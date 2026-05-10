/*  Nama File   : Teman.java
    Deskripsi   : KOLEKSI KELAS DASAR
    Pembuat     : Muhammad Alfaiq Rido Salafy/24060124140148
    Tanggal     : 04/05/2026
 */

package PBO09_24060124140148;

import java.util.ArrayList;
import java.util.List;

public class Teman {
    //Atribut
    private int nbelm;
    private List<String> Lnama;

    //Method
    public Teman(){
        this.Lnama = new ArrayList<>();
        this.nbelm = 0;
    }

    public int getNbelm(){
        return this.nbelm;
    }

    public String getNama(int i){
        if (i < 0 || i >= nbelm) {
            return null;
        }
        return Lnama.get(i);
    }

    public void setNama(int i, String nama){
        Lnama.set(i, nama);
    }

    public void addNama(String nama){
        nbelm += 1;
        Lnama.add(nama);
    }

    public void delNama(String nama){
        if (!Lnama.contains(nama)) {
            return;
        }
        nbelm -= 1;
        Lnama.remove(nama);
    }

    public boolean isMember(String nama){
        return Lnama.contains(nama);
    }

    public void gantiNama(String nama, String namabaru){
        int i = Lnama.indexOf(nama);

        if (i != -1) {
            Lnama.set(i, namabaru);
        }
    }

    public int countNama(String nama){
        int count = 0;
        for (int i = 0; i < nbelm; i++) {
            if (Lnama.get(i).contentEquals(nama)) {
                count++;
            }
            else{
                continue;
            }
        }
        return count;
    }

    public void showTeman(){
        for (int i = 1; i <= nbelm; i++){
            System.out.println("NO: " + i + " || NAMA: " + getNama(i-1));
        }
    }
}
