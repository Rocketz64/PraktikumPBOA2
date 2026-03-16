/*  Nama File   : Persegi.java
    Deskripsi   : berisi atribut dan method dalam class Persegi
    Pembuat     : Muhammad Alfaiq Rido Salafy/24060124140148
    Tanggal     : 16/03/2026
 */

public class Lingkaran extends BangunDatar implements IResize{
    private double jari;

    public Lingkaran(){
        setJmlSisi(1);
    }

    public Lingkaran(double diameter){
        this.jmlSisi = 1;
        this.jari = diameter / 2;
    }

    public double getJari(){
        return jari;
    }

    public void setJari(double jari){
        this.jari = jari;
    }

    public double getLuas(){
        return Math.PI * jari * jari;
    }

    public double getKeliling(){
        return jari * 2 * Math.PI;
    }

    @Override
    public void zoomIn(){
        jari = jari * 1.1;
    }

    @Override
    public void zoomOut(){
        jari = jari * 0.9;
    }

    @Override
    public void zoom(int percent){
        jari = jari * (percent / 100.0);
    }

    @Override
    public void printInfo(){
        super.printInfo();
        System.out.println("Jari-Jari: " + jari);
    }

    @Override
    public void printCounterBangunDatar(){
        super.printCounterBangunDatar();
    }
}
