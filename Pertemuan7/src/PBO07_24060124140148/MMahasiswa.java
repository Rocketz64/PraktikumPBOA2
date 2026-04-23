/*  Nama File   : MMahasiswa.java
    Deskripsi   : MATERI POLIMORFISME AD HOC OVERLOADING
    Pembuat     : Muhammad Alfaiq Rido Salafy/24060124140148
    Tanggal     : 20/04/2026
 */

package PBO07_24060124140148;

public class MMahasiswa {
    public static void main(String[] args){
        Mahasiswa m1 = new Mahasiswa();
        System.out.print("Objek m1 (Default): ");
        m1.printInfo();

        Mahasiswa m2 = new Mahasiswa(12345, "Budi Santoso", "Informatika");
        System.out.print("Objek m2 (Input): ");
        m2.printInfo();

        Mahasiswa m3 = new Mahasiswa(m2);
        System.out.print("Objek m3 (Kloning m2): ");
        m3.printInfo();

        m1.setProgramStudi();
        System.out.print("m1 setelah setProgramStudi(): ");
        m1.printInfo();

        m1.setProgramStudi("Sistem Informasi");
        System.out.print("m1 setelah setProgramStudi(\"Sistem Informasi\"): ");
        m1.printInfo();

        m1.setProgramStudi(m2);
        System.out.print("m1 setelah setProgramStudi(m2): ");
        m1.printInfo();
    }
}
