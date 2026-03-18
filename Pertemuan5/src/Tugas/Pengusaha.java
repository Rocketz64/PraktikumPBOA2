/*  Nama File   : Manusia.java
    Deskripsi   : berisi atribut dan method dalam class Pengusaha
    Pembuat     : Muhammad Alfaiq Rido Salafy/24060124140148
    Tanggal     : 18/03/2026
 */

package Tugas;

import java.time.LocalDate;
import java.time.Period;

public class Pengusaha extends Manusia implements Pajak{
    //Atribut
    private String npwp;
    private static int counterPengusaha = 0;

    //Method
    //Contructor
    public Pengusaha(){
        counterPengusaha++;
    }

    public Pengusaha(String nama, LocalDate tgl_mulai_kerja, String alamat, double pendapatan, String npwp){
        super(nama, tgl_mulai_kerja, alamat, pendapatan);
        this.npwp = npwp;
        counterPengusaha++;
    }


    //Selektor
    public String getNpwp(){
        return this.npwp;
    }

    public static int getCounterPengusaha(){
        return counterPengusaha;
    }


    //Mutator
    public void setNpwp(String npwp){
        this.npwp = npwp;
    }


    //Fungsi
    //Abstract
    public int hitungMasaKerja(){
        LocalDate today = LocalDate.now();
        Period t = Period.between(tgl_mulai_kerja, today);
        return t.getYears() + 1;
    }

    //Interface
    @Override
    public double hitungPajak(){
        return 0.15 * pendapatan;
    }
}
