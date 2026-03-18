/*  Nama File   : Manusia.java
    Deskripsi   : berisi atribut dan method dalam class PNS
    Pembuat     : Muhammad Alfaiq Rido Salafy/24060124140148
    Tanggal     : 18/03/2026
 */

package Tugas;

import java.time.LocalDate;
import java.time.Period;

public class PNS extends Manusia implements Pajak{
    //Atribut
    private String nip;
    private static int counterPNS = 0;


    //Method
    //Contructor
    public PNS(){
        counterPNS++;
    }

    public PNS(String nama, LocalDate tgl_mulai_kerja, String alamat, double pendapatan, String nip){
        super(nama, tgl_mulai_kerja, alamat, pendapatan);
        this.nip = nip;
        counterPNS++;
    }


    //Selektor
    public String getNip(){
        return this.nip;
    }

    public static int getCounterPNS(){
        return counterPNS;
    }


    //Mutator
    public void setNip(String nip){
        this.nip = nip;
    }


    //Fungsi
    //Abstract
    public int hitungMasaKerja(){
        LocalDate today = LocalDate.now();
        Period t = Period.between(tgl_mulai_kerja, today);
        return t.getYears() + 8;
    }


    //Interface
    @Override
    public double hitungPajak(){
        return 0.1 * pendapatan;
    }
}
