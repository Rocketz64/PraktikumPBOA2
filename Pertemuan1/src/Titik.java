/*  Nama File   : Titik.java
    Deskripsi   : berisi atribut dan method dalam class Titik
    Pembuat     : Muhammad Alfaiq Rido Salafy/24060124140148
    Tanggal     : 19/02/2026
 */

public class Titik {
    double absis;
    double ordinat;
    static int counterTitik = 0;

    Titik(){
        absis = 0;
        ordinat = 0;
        counterTitik++;
    }

    Titik(double x, double y){
        absis = x;
        ordinat = y;
        counterTitik++;
    }

    double getAbsis(){
        return absis;
    }

    double getOrdinat(){
        return ordinat;
    }

    static int getCounterTitik(){
        return counterTitik;
    }

    void setAbsis(double x){
        absis = x;
    }

    void setOrdinat(double y){
        ordinat = y;
    }

    void geser(double x, double y){
        absis = absis + x;
        ordinat = ordinat + y;
    }

    int getKuadran(){
        if (absis > 0 && ordinat > 0) {
            return 1;
        }
        else if (absis < 0 && ordinat > 0) {
            return 2;
        }
        else if (absis < 0 && ordinat < 0) {
            return 3;
        }
        else if (absis > 0 && ordinat < 0) {
            return 4;
        }
        else{
            return 0;
        }
    }

    double getJarakPusat(){
        return Math.sqrt(absis * absis + ordinat * ordinat);
    }

    double getJarak(Titik T){
        double x = this.absis - T.getAbsis();
        double y = this.ordinat - T.getOrdinat();
        return Math.sqrt(x * x + y * y);
    }

    void refleksiX(){
        ordinat = ordinat * -1;
    }

    void refleksiY(){
        absis = absis * -1;
    }

    Titik getRefleksiX(){
        return new Titik(absis, ordinat * -1);
    }

    Titik getRefleksiY(){
        return new Titik(absis * -1, ordinat);
    }

    void printTitik(){
        System.out.println("Titik (" + absis + "," + ordinat + ")");
    }
}