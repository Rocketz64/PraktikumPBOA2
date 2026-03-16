/*  Nama File   : Persegi.java
    Deskripsi   : berisi atribut dan method dalam class Persegi
    Pembuat     : Muhammad Alfaiq Rido Salafy/24060124140148
    Tanggal     : 16/03/2026
 */

public class Persegi extends BangunDatar implements IResize{
    private double sisi;

    public Persegi(){
        setJmlSisi(4);
    }

    public Persegi(double sisi){
        this.jmlSisi = 4;
        this.sisi = sisi;
    }

    public double getSisi(){
        return sisi;
    }

    public void setSisi(double sisi){
        this.sisi = sisi;
    }

    public double getLuas(){
        return sisi * sisi;
    }

    public double getKeliling(){
        return sisi * 4;
    }

    public double getDiagonal(){
        return Math.sqrt(sisi*sisi + sisi*sisi);
    }

    @Override
    public void zoomIn(){
        sisi = sisi * 1.1;
    }

    @Override
    public void zoomOut(){
        sisi = sisi * 0.9;
    }

    @Override
    public void zoom(int percent){
        sisi = sisi * (percent / 100.0);
    }

    @Override
    public void printInfo(){
        super.printInfo();
        System.out.println("Sisi: " + sisi);
    }

    @Override
    public void printCounterBangunDatar(){
        super.printCounterBangunDatar();
    }
}
