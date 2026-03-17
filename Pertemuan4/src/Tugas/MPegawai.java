/*  Nama File   : MPegawai.java
    Deskripsi   : Main dalam class Pegawai, Dosen, Dosen Tamu, Dosen tetap, dan Tendik
    Pembuat     : Muhammad Alfaiq Rido Salafy/24060124140148
    Tanggal     : 17/03/2026
 */

package Tugas;

import java.time.LocalDate;

public class MPegawai {
    public static void main(String[] args) {
        DosenTetap DT1 = new DosenTetap("9545647548", "Andi", LocalDate.of(1990, 5, 5),
        LocalDate.of(2015, 1, 1), 5000000, "Fakultas Sains dan Matematika", "78647324"); 
        DosenTamu DT2 = new DosenTamu("123456789", "Kayla", LocalDate.of(2005, 10, 25),
        LocalDate.of(2020, 12, 31), 2500000, "Fakultas Biofarma", "978456", LocalDate.of(2030, 12, 31));
        Tendik T3 = new Tendik("987654321", "Faiq", LocalDate.of(2005, 10, 30),
        LocalDate.of(2015, 1, 1), 5000000, "Akademik");
        DT1.printInfo();
        System.out.println();
        DT2.printInfo();
        System.out.println();
        T3.printInfo();
    }
}
