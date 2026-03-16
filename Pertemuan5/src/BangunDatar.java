/*  Nama File   : BangunDatar.java
    Deskripsi   : berisi atribut dan method dalam class Bangun Datar
    Pembuat     : Muhammad Alfaiq Rido Salafy/24060124140148
    Tanggal     : 16/03/2026
 */

public abstract class BangunDatar {
    protected int jmlSisi;
    protected String warna;
    protected String border;
    protected static int counterBangunDatar = 0;

    public BangunDatar(){
        counterBangunDatar++;
    }

    public BangunDatar(int jmlSisi){
        this.jmlSisi = jmlSisi;
        counterBangunDatar++;
    }

    public int getJmlSisi(){
        return jmlSisi;
    }

    public void setJmlSisi(int jmlSisi){
        this.jmlSisi = jmlSisi;
    }

    public void printInfo(){
        System.out.println("Jumlah Sisi: " + jmlSisi);
    }

    public void printCounterBangunDatar(){
        System.out.println("Jumlah objek Bangun Datar: " + counterBangunDatar);
    }

    public abstract double getLuas();
    public abstract double getKeliling();

    public boolean isEqualLuas(BangunDatar X){
        return this.getLuas() == X.getLuas();
    }

    public boolean isEqualKeliling(BangunDatar X){
        return this.getKeliling() == X.getKeliling();
    }
}