/*  Nama File   : Matakuliah.java
    Deskripsi   : berisi atribut dan method dalam class Mata Kuliah
    Pembuat     : Muhammad Alfaiq Rido Salafy/24060124140148
    Tanggal     : 02/03/2026
 */

public class Matakuliah {

    //Atribut
    private String idMatkul;
    private String nama;
    private Integer sks;

    //Method
    //Konstruktor tanpa Parameter
    public Matakuliah(){
        this.idMatkul = "";
        this.nama = "";
        this.sks = 0;
    }

    //Konstruktor dengan Parameter
    public Matakuliah(String x, String y, Integer z){
        this.idMatkul = x;
        this.nama = y;
        this.sks = z;
    }

    //Selektor IDMatKul
    public String getIdMatkul(){
        return idMatkul;
    }

    //Selektor Nama
    public String getNama(){
        return nama;
    }

    //Selektor Prodi
    public Integer getSks(){
        return sks;
    }

    //Mutator IDMatKul
    public void setIdMatkul(String a){
        this.idMatkul = a;
    }
    
    //Mutator Nama
    public void setNama(String b){
        this.nama = b;
    }

    //Mutator Prodi
    public void setSks(Integer c){
        this.sks = c;
    }
    
}
