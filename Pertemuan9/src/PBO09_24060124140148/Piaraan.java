/*  Nama File   : Piaraan.java
    Deskripsi   : KOLEKSI KELAS BENTUKAN
    Pembuat     : Muhammad Alfaiq Rido Salafy/24060124140148
    Tanggal     : 04/05/2026
 */

package PBO09_24060124140148;

import java.util.ArrayList;
import java.util.List;

public class Piaraan {
    //Attribute
    private int nbelm;
    private List<Anabul> Lanabul;
    
    //Method
    public Piaraan(){
        this.Lanabul = new ArrayList<>();
        this.nbelm = 0;
    }

    public int getNbElm(){
        return nbelm;
    }

    public void enqueueAnabul(Anabul a){
        Lanabul.add(a);
        nbelm++;
    }

    public boolean isMember(Anabul a){
        return Lanabul.contains(a);
    }

    public Anabul getAnabul(){
        if(!Lanabul.isEmpty()){
            return Lanabul.get(0);
        }
        else{
            return null;
        }
    }

    public void dequeueAnabul(){
        if (!Lanabul.isEmpty()) {
            Lanabul.remove(0);
            nbelm--;
        }
    }

    public int countKucing(){
        int count = 0;
        for (Anabul a : Lanabul){
            if (a instanceof Kucing) {
                count++;
            }
        }
        return count;
    }

    public double bobotKucing(){
        double Bobot = 0;
        for (Anabul a : Lanabul) {
            if (a instanceof Kucing) {
                Bobot += ((Kucing) a).getBobot();
            }
        }
        return Bobot;
    }

    public void showAnabul(){
        for (int i = 0; i < nbelm; i++){
            Anabul a = Lanabul.get(i);
            System.out.println("NO: " + (i + 1) + " || NAMA: " + a.getNama() + " || PANGGILAN: " + a.getNama2());
        }
    }

    public void showJenisAnabul() {
    for (Anabul a : Lanabul) {
        System.out.println("Panggilan: " + a.getNama2() + " || Jenis: " + a.getClass().getSimpleName()); 
    }
}
}
