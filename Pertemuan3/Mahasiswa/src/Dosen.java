/*  Nama File   : Dosen.java
    Deskripsi   : berisi atribut dan method dalam class Dosen
    Pembuat     : Muhammad Alfaiq Rido Salafy/24060124140148
    Tanggal     : 02/03/2026
 */

public class Dosen {

    //Atribut
    private String nip;
    private String nama;
    private String prodi;

    //Method
    //Konstruktor tanpa Parameter
    public Dosen(){
        this.nip = "";
        this.nama = "";
        this.prodi = "";
    }

    //Konstruktor dengan Parameter
    public Dosen(String x, String y, String z){
        this.nip = x;
        this.nama = y;
        this.prodi = z;
    }

    //Selektor Nip
    public String getNip(){
        return nip;
    }

    //Selektor Nama
    public String getNama(){
        return nama;
    }

    //Selektor Prodi
    public String getProdi(){
        return prodi;
    }

    //Mutator Nip
    public void setNip(String a){
        this.nip = a;
    }
    
    //Mutator Nama
    public void setNama(String b){
        this.nama = b;
    }

    //Mutator Prodi
    public void setProdi(String c){
        this.prodi = c;
    }
}
