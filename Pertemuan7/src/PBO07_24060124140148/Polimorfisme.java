/*  Nama File   : Polimorfisme.java
    Deskripsi   : MATERI POLIMORFISME AD HOC COERCION
    Pembuat     : Muhammad Alfaiq Rido Salafy/24060124140148
    Tanggal     : 20/04/2026
 */

package PBO07_24060124140148;

public class Polimorfisme {
    public static void main(String[] args) {
        
        //A
        int nInt = 65;
        char nChar = (char) nInt; 
        double nReal = (double) nInt;
        
        System.out.println("Integer: " + nInt);
        System.out.println("Karakter: " + nChar);
        System.out.println("Real: " + nReal);

        //B
        int intBaru = (int) nReal; 
        System.out.println("Kembali ke Integer di variabel berbeda: " + intBaru);

        //C
        String X = "1234";
        String Y = "5678";
        
        String S = X + Y;
        int Z = Integer.parseInt(X) + Integer.parseInt(Y);
        
        System.out.println("Hasil Konkatenasi S: " + S);
        System.out.println("Hasil Penjumlahan Z: " + Z);

        //D
        String P = "12.34";
        String Q = "56.78";
        
        String R = P + Q;
        double D = Double.parseDouble(P) + Double.parseDouble(Q);
        
        System.out.println("Hasil Konkatenasi R: " + R);
        System.out.println("Hasil Penjumlahan D: " + D);

        //E
        Integer A = Integer.valueOf(S); 
        System.out.println("Objek Integer A: " + A);

        //F
        String T = A.toString();
        System.out.println("Objek String T: " + T);
    }
}
