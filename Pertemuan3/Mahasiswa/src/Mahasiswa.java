/*  Nama File   : Mahasiswa.java
    Deskripsi   : berisi atribut dan method dalam class Mahasiswa
    Pembuat     : Muhammad Alfaiq Rido Salafy/24060124140148
    Tanggal     : 02/03/2026
 */

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Mahasiswa {

    //Atribut
    private String nim;
    private String nama;
    private String prodi;
    ArrayList<Matakuliah> listMatkul;
    private Dosen dosenWali; 
    private Kendaraan kendaraan;
    
    
    //Method
    //Konstruktor tanpa Parameter
    public Mahasiswa(){
        this.listMatkul = new ArrayList<>();
    }

    //Konstruktor dengan Parameter
    public Mahasiswa(String x, String y, String z){
        this.listMatkul = new ArrayList<>();
        this.nim = x;
        this.nama = y;
        this.prodi = z;
    }

    //Selektor Nim
    public String getNim(){
        return nim;
    }

    //Selektor Nama
    public String getNama(){
        return nama;
    }

    //Selektor Prodi
    public String getProdi(){
        return prodi;
    }

    //Selektor Dosen Wali
    public Dosen getDosenWali(){
        return dosenWali;
    }

    //Selektor Kendaraan
    public Kendaraan getKendaraan(){
        return kendaraan;
    }

    //Mutator Nim
    public void setNim(String a){
        this.nim = a;
    }
    
    //Mutator Nama
    public void setNama(String b){
        this.nama = b;
    }

    //Mutator Prodi
    public void setProdi(String c){
        this.prodi = c;
    }

    //Mutator Dosen Wali
    public void setDosenWali(Dosen d){
        this.dosenWali = d;
    }

    //Mutator Kendaraan
    public void setKendaraan(Kendaraan e){
        this.kendaraan = e;
    }

    //Method AddMatkul
    public void addMatkul(Matakuliah newMatKul){
        listMatkul.add(newMatKul);
    }

    //Method getJumlahSKS
    public Integer getJumlahSKS(){
        int jumlah = 0;
        int i;

        for(i = 0; i < listMatkul.size(); i++){
            jumlah = jumlah + listMatkul.get(i).getSks();
        }

        return jumlah;
    }

    //Method getJumlahMatkul
    public Integer getJumlahMatkul(){
        return listMatkul.size();
    }

    //Print Mahasiswa
    public void printMhs(){
        System.out.println("Nim: " + nim + " ; " + "Nama: " + nama + " ; " + "Prodi: " + prodi);
    }

    //Print Detail Mahasiswa
    public void printDetailMhs(){
        System.out.println("Nim: " + nim);
        System.out.println("Nama: " + nama);
        System.out.println("Prodi: " + prodi);
        System.out.println("Prodi: " + prodi);
        int i;
        for(i=0; i<listMatkul.size(); i++){
            System.out.println(listMatkul.get(i).getNama());
        }
        System.out.println("Nama Dosen Wali: " + dosenWali.getNama());
        System.out.println("NIP Dosen Wali: " + dosenWali.getNip());
        System.out.println("Prodi Dosen Wali: " + dosenWali.getProdi());
        System.out.println("Plat Kendaraan: " + kendaraan.getNoplat());
        System.out.println("Jenis Kendaraan: " + kendaraan.getJenis());
    }
}
