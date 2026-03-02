/*  Nama File   : Kendaraan.java
    Deskripsi   : berisi atribut dan method dalam class Kendaraan
    Pembuat     : Muhammad Alfaiq Rido Salafy/24060124140148
    Tanggal     : 02/03/2026
 */

public class Kendaraan {

    //Atribut
    private String noPlat;
    private String jenis;
    
    //Method
    //Konstruktor tanpa Parameter
    public Kendaraan(){
        this.noPlat = "";
        this.jenis = "";
    }

    //Konstruktor dengan Parameter
    public Kendaraan(String x, String y){
        this.noPlat = x;
        this.jenis = y;
    }

    //Selektor NoPlat
    public String getNoplat(){
        return noPlat;
    }

    //Selektor Jenis
    public String getJenis(){
        return jenis;
    }

    //Mutator NoPlat
    public void setNoplat(String a){
        this.noPlat = a;
    }
    
    //Mutator Nama
    public void setJenis(String b){
        this.jenis = b;
    }

}
