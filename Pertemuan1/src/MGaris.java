/*  Nama File   : MGaris.java
    Deskripsi   : main dalam class Garis
    Pembuat     : Muhammad Alfaiq Rido Salafy/24060124140148
    Tanggal     : 28/02/2026
 */

public class MGaris {
    public static void main(String[] args) {

        Titik T1 = new Titik();
        Titik T2 = new Titik(3, 2);
        Titik T3 = new Titik(-7, 1);
        Titik T4 = new Titik(-3,-5);

        Garis G1 = new Garis();
        G1.printGaris();
        Garis G2 = new Garis(T1, T3);
        G2.printGaris();
        Garis G3 = new Garis(T2, T4);
        G3.printGaris();

        System.out.println("Panjang G2: " + G2.getPanjang());
        System.out.println("Gradien G2: " + G2.getGradien());
        System.out.println("Persamaan G2: " + G2.printPersamaan());

        System.out.println("G1 sejajar G2: " + G1.isSejajar(G2));

        Titik middle = G3.getTengah();
        System.out.println("Titik Tengah G3: ");
        middle.printTitik();

        System.out.println("Counter Garis: " + Garis.getCounterGaris());
    }
}
