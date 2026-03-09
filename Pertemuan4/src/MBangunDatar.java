/*  Nama File   : MBangunDatar.java
    Deskripsi   : Main dalam class Bangun Datar, Persegi, dan Lingkaran
    Pembuat     : Muhammad Alfaiq Rido Salafy/24060124140148
    Tanggal     : 09/03/2026
 */

public class MBangunDatar {
    public static void main(String[] args) {
        Persegi P1 = new Persegi(64.0, "BIRU", "PUTIH");
        Lingkaran L1 = new Lingkaran(32.5, "HIJAU", "HITAM");
        System.out.println("Jmlh Sisi Persegi: " + P1.getJmlSisi());
        System.out.println("Jmlh Sisi Lingkaran: " + L1.getJmlSisi());
        System.out.println("Warna Persegi: " + P1.getWarna());
        System.out.println("Warna Lingkaran: " + L1.getWarna());
        System.out.println("Border Persegi: " + P1.getBorder());
        System.out.println("Border Lingkaran: " + L1.getBorder());
        P1.printInfo();
        P1.setSisi(49.7);
        System.out.println("Sisi Persegi: " + P1.getSisi());
        System.out.println("Luas Persegi: " + P1.getLuas());
        System.out.println("Keliling Persegi: " + P1.getKeliling());
        System.out.println("Diagonal Persegi: " + P1.getDiagonal());
        L1.printInfo();
        L1.setJari(16.7);
        System.out.println("Jari2 Lingkaran: " + L1.getJari());
        System.out.println("Luas Lingkaran: " + L1.getLuas());
        System.out.println("Keliling Lingkaran: " + L1.getKeliling());
        P1.printCounterBangunDatar();
        L1.printCounterBangunDatar();
    }
}
