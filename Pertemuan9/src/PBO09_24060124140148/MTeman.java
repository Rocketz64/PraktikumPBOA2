/*  Nama File   : MTeman.java
    Deskripsi   : KOLEKSI KELAS DASAR
    Pembuat     : Muhammad Alfaiq Rido Salafy/24060124140148
    Tanggal     : 04/05/2026
 */

package PBO09_24060124140148;

public class MTeman {
    public static void main(String[] args) {
        Teman Faiq = new Teman();

        //Add
        Faiq.addNama("Isa");
        Faiq.addNama("Isa");
        Faiq.addNama("Isa");
        Faiq.addNama("Adib");
        Faiq.addNama("Galang");
        Faiq.addNama("Ahnaf");
        Faiq.addNama("Fachriza");
        Faiq.addNama("Ibrahim");
        Faiq.addNama("Najib");

        //Show
        System.out.println("Hasil Teman Pertama:");
        Faiq.showTeman();

        //Del
        System.out.println("\nHasil Setelah Delete:");
        Faiq.delNama("Galang");
        Faiq.showTeman();

        //Is Member
        System.out.println("\nIs Faiq member of Faiq?");
        if (Faiq.isMember("Faiq")) {
            System.out.println("Yes!!!");
        }
        else{
            System.out.println("NOOOOOOOOO!!!");
        }
        System.out.println("\nIs Isa member of Faiq?");
        if (Faiq.isMember("Isa")) {
            System.out.println("Yes!!!");
        }
        else{
            System.out.println("NO YOU STUPID BAKA!!!");
        }

        //NBElm
        System.out.println("\nNB Elm: " + Faiq.getNbelm());

        //Count Nama
        System.out.println("\nCount Isa: " + Faiq.countNama("Isa"));

    }
}
