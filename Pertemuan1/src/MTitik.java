/*  Nama File   : MTitik.java
    Deskripsi   : Main dalam class Titik
    Pembuat     : Muhammad Alfaiq Rido Salafy/24060124140148
    Tanggal     : 19/02/2026
 */

public class MTitik {
    public static void main(String[] args){
        Titik T1 = new Titik();
        T1.setAbsis(3);
        T1.setOrdinat(4);
        T1.printTitik();
        T1.geser(3, 4);
        T1.printTitik();

        Titik T2 = T1;
        T2.printTitik();
        T1.setAbsis(10);
        T1.setOrdinat(10);
        T2.printTitik();

        Titik T3 = new Titik();
        Titik T4 = new Titik(3,5);

        System.out.println("Jumlah Objek Titik = " + Titik.getCounterTitik());
        System.out.println("Jumlah Objek Titik = " + T4.getCounterTitik());

        T4.setAbsis(-3);
        T4.setOrdinat(-7);

        System.out.println("Kuadran T1: " + T1.getKuadran());
        System.out.println("Kuadran T2: " + T2.getKuadran());
        System.out.println("Kuadran T3: " + T3.getKuadran());
        System.out.println("Kuadran T4: " + T4.getKuadran());

        System.out.println("Jarak pusat T2: " + T2.getJarakPusat());
        System.out.println("Jarak pusat T4: " + T4.getJarakPusat());

        System.out.println("Jarak Titik T1 - T4: " + T1.getJarak(T4));
        System.out.println("Jarak Titik T3 - T4: " + T3.getJarak(T4));

        T2.refleksiX();
        T2.refleksiY();
        T2.printTitik();

        Titik T5 = T1.getRefleksiX();
        Titik T6 = T1.getRefleksiY();
        T5.printTitik();
        T6.printTitik();
    }
}