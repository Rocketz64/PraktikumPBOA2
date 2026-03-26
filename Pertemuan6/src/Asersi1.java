/*  Nama File   : Asersi1.java
    Deskripsi   : Program Asersi
    Pembuat     : Muhammad Alfaiq Rido Salafy/24060124140148
    Tanggal     : 26/03/2026
 */

public class Asersi1 {
    public static void main(String[] args) {
        int x = 0;
        
        if (x > 0){
            System.out.println("x bilangan positif");
        }
        else{
            assert(x < 0): "Ada kesalahan kode";
            System.out.println("x bilangan negatif");
        }
    }
}
