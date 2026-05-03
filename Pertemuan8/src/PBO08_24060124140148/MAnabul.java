/*  Nama File   : MAnabul.java
    Deskripsi   : GENERIK PADA CLASS
    Pembuat     : Muhammad Alfaiq Rido Salafy/24060124140148
    Tanggal     : 27/04/2026
 */

package PBO08_24060124140148;

public class MAnabul {
    public static void main(String[] args) {
        //I
        System.out.println("\n===== I =====");
        Anabul anjing1 = new Anjing("Doggy");
        Anabul burung1 = new Burung("Birdo");
        Anabul anggora1 = new Anggora("Kitty", 6.5);
        Anabul kemmbangtelon1 = new Kembangtelon("Katty", 2.7);

        Datum<Anabul> datumA = new Datum<Anabul>(anggora1);
        Datum<Anabul> datumB = new Datum<Anabul>(kemmbangtelon1);

        System.out.println("Sebelum Perubahan dengan Set:");
        System.out.println("Datum A: " + datumA.getIsi() + "\nDatum B: "+ datumB.getIsi() + "\n");

        datumA.setIsi(anjing1);
        datumB.setIsi(burung1);

        System.out.println("Setelah Perubahan dengan Set:");
        System.out.println("Datum A: " + datumA.getIsi() + "\nDatum B: "+ datumB.getIsi() + "\n");

        //II
        System.out.println("\n===== II =====");

        Anabul anggora2 = new Anggora("Wewel", 5.4);
        Anabul kemmbangtelon2 = new Kembangtelon("Odi", 4.1);

        Datum<Anabul> datumC = new Datum<Anabul>(anggora2);
        Datum<Anabul> datumD = new Datum<Anabul>(kemmbangtelon2);

        System.out.println("Sebelum Pertukaran:");
        System.out.println("Datum C: " + datumC.getIsi() + "\nDatum D: "+ datumD.getIsi() + "\n");

        OperatorGenerik.Tukar(datumC, datumD);

        System.out.println("Setelah Pertukaran:");
        System.out.println("Datum C: " + datumC.getIsi() + "\nDatum D: "+ datumD.getIsi() + "\n");

        System.out.println("Jumlah Bobot C dan D:");
        System.out.println("Jumlah: " + OperatorGenerik.Bobot2((Kucing) datumC.getIsi(), (Kucing) datumD.getIsi()) + "\n");

        //III
        System.out.println("\n===== III =====");

        Data<Anabul> daftarAnabul = new Data<>();

        daftarAnabul.setIsi(1, anjing1);
        daftarAnabul.setIsi(2, burung1);
        daftarAnabul.setIsi(3, anggora1);
        daftarAnabul.setIsi(4, kemmbangtelon1);
        daftarAnabul.setIsi(5, anggora2);
        daftarAnabul.setIsi(6, kemmbangtelon2);

        System.out.println("Isi data:");
        System.out.println("Data 1: " + daftarAnabul.getIsi(1));
        System.out.println("Data 2: " + daftarAnabul.getIsi(2));
        System.out.println("Data 3: " + daftarAnabul.getIsi(3));
        System.out.println("Data 4: " + daftarAnabul.getIsi(4));
        System.out.println("Data 5: " + daftarAnabul.getIsi(5));
        System.out.println("Data 6: " + daftarAnabul.getIsi(6));

        System.out.println("Total data Hewan yang ada = " + daftarAnabul.getSize());
        }
}
