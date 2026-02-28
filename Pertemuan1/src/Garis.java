/*  Nama File   : Garis.java
    Deskripsi   : berisi atribut dan method dalam class Garis
    Pembuat     : Muhammad Alfaiq Rido Salafy/24060124140148
    Tanggal     : 28/02/2026
 */

public class Garis {
    Titik awalTitik;
    Titik akhirTitik;
    static int counterGaris = 0;

    Garis(){
        this.awalTitik = new Titik();
        this.akhirTitik = new Titik(1, 1);
        counterGaris++;
    }

    Garis(Titik a, Titik b){
        this.awalTitik = a;
        this.akhirTitik = b;
        counterGaris++;
    }

    Titik getAwalGaris(){
        return awalTitik;
    }

    Titik getAkhirTitik(){
        return akhirTitik;
    }

    static int getCounterGaris(){
        return counterGaris;
    }

    void setAwalTitik(Titik a){
        this.awalTitik = a;
    }

    void setAkhirTitik(Titik b){
        this.akhirTitik = b;
    }

    double getPanjang(){
        return awalTitik.getJarak(akhirTitik);
    }

    double getGradien(){
        double x = akhirTitik.getAbsis() - awalTitik.getAbsis();
        double y = akhirTitik.getOrdinat() - awalTitik.getOrdinat();
        if (x == 0) {
            return -999;
        }
        else{
            return y / x;
        }
    }

    Titik getTengah(){
        double xT = (awalTitik.getAbsis() + akhirTitik.getAbsis()) / 2;
        double yT = (awalTitik.getOrdinat() + akhirTitik.getOrdinat()) / 2;
        return new Titik(xT, yT);
    }

    boolean isSejajar(Garis G){
        return this.getGradien() == G.getGradien();
    }

    boolean isTegakLurus(Garis G){
        return (this.getGradien() * G.getGradien()) == -1;
    }

    void printGaris(){
        System.out.println("Titik Awal: ");
        awalTitik.printTitik();
        System.out.println("Titik Akhir: ");
        akhirTitik.printTitik();
    }

    String printPersamaan(){
        double m = getGradien();
        double c = awalTitik.getOrdinat() - (m * awalTitik.getAbsis());
        return "y = " + m + "x + " + c;
    }
}
