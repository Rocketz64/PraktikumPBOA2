/*  Nama File   : Titik.java
    Deskripsi   : berisi atribut dan method dalam class Titik
    Pembuat     : Muhammad Alfaiq Rido Salafy/24060124140148
    Tanggal     : 19/02/2026
 */

public class Titik {
    private double absis;
    private double ordinat;
    private static int counterTitik = 0;

    public Titik(){
        absis = 0;
        ordinat = 0;
        counterTitik++;
    }

    public Titik(double x, double y){
        absis = x;
        ordinat = y;
        counterTitik++;
    }

    public double getAbsis(){
        return absis;
    }

    public double getOrdinat(){
        return ordinat;
    }

    public static int getCounterTitik(){
        return counterTitik;
    }

    public void setAbsis(double x){
        absis = x;
    }

    public void setOrdinat(double y){
        ordinat = y;
    }

    public void geser(double x, double y){
        absis = absis + x;
        ordinat = ordinat + y;
    }

    public int getKuadran(){
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

    public double getJarakPusat(){
        return Math.sqrt(absis * absis + ordinat * ordinat);
    }

    public double getJarak(Titik T){
        double x = this.absis - T.getAbsis();
        double y = this.ordinat - T.getOrdinat();
        return Math.sqrt(x * x + y * y);
    }

    public void refleksiX(){
        ordinat = ordinat * -1;
    }

    public void refleksiY(){
        absis = absis * -1;
    }

    public Titik getRefleksiX(){
        return new Titik(absis, ordinat * -1);
    }

    public Titik getRefleksiY(){
        return new Titik(absis * -1, ordinat);
    }

    public void printTitik(){
        System.out.println("Titik (" + absis + "," + ordinat + ")");
    }
}