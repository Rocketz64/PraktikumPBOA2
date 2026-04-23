/*  Nama File   : MAnabul.java
    Deskripsi   : MATERI POLIMORFISME UNIVERSAL INCLUSION
    Pembuat     : Muhammad Alfaiq Rido Salafy/24060124140148
    Tanggal     : 21/04/2026
 */

package PBO07_24060124140148;

public class MAnabul {
    public static void main(String[] args) {
        Anabul kucingSaya = new Kucing("Meow Meow");
        Anabul anjingSaya = new Anjing("Doggo");
        Anabul burungSaya = new Burung("Birdie");

        System.out.println("Simulasi Perilaku Anabul:");

        // Aksi Kucing
        kucingSaya.Gerak();
        kucingSaya.Bersuara();
        System.out.println();

        // Aksi Anjing
        anjingSaya.Gerak();
        anjingSaya.Bersuara();
        System.out.println();

        // Aksi Burung
        burungSaya.Gerak();
        burungSaya.Bersuara();
    }
}
