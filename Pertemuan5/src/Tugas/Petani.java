/*  Nama File   : Manusia.java
    Deskripsi   : berisi atribut dan method dalam class Petani
    Pembuat     : Muhammad Alfaiq Rido Salafy/24060124140148
    Tanggal     : 18/03/2026
 */

package Tugas;

import java.time.LocalDate;
import java.time.Period;

public class Petani extends Manusia implements Pajak{
    //Atribut
    private String asal_kota;
    private static int counterPetani = 0;

    //Method
    //Contructor
    public Petani(){
        counterPetani++;
    }

    public Petani(String nama, LocalDate tgl_mulai_kerja, String alamat, double pendapatan, String asal_kota){
        super(nama, tgl_mulai_kerja, alamat, pendapatan);
        this.asal_kota = asal_kota;
        counterPetani++;
    }


    //Selektor
    public String getAsalKota(){
        return this.asal_kota;
    }

    public static int getCounterPetani(){
        return counterPetani;
    }


    //Mutator
    public void setAsalKota(String asal_kota){
        this.asal_kota = asal_kota;
    }


    //Fungsi
    //Abstract
    public int hitungMasaKerja(){
        LocalDate today = LocalDate.now();
        Period t = Period.between(tgl_mulai_kerja, today);
        return t.getYears() + 0;
    }

    //Interface
    @Override
    public double hitungPajak(){
        return 0;
    }
}
