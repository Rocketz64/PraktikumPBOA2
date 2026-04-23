/*  Nama File   : MNo4.java
    Deskripsi   : MATERI POLIMORFISME UNIVERSAL INCLUSION
    Pembuat     : Muhammad Alfaiq Rido Salafy/24060124140148
    Tanggal     : 21/04/2026
 */

package PBO07_24060124140148;

public class MNo4 {
    public static void main(String[] args) {
        Dosen d1 = new Dosen("Edy Suharto, S.T., M.Kom", "19800101");
        Dosen d2 = new Dosen("Dhena Kamalia Fu'adi, S.Kom., M.Kom.", "19850520");

        MahasiswaNo4 m1 = new MahasiswaNo4("Faiq", "24060124140148");
        MahasiswaNo4 m2 = new MahasiswaNo4("Isa", "25060124140148");
        MahasiswaNo4 m3 = new MahasiswaNo4("Rocky", "25060124140001");
        MahasiswaNo4 m4 = new MahasiswaNo4("Gaby", "25060124140002");
        MahasiswaNo4 m5 = new MahasiswaNo4("Gary", "25060124140003");

        m1.setWali(d1);
        m2.setWali(d1);
        m3.setWali(d2);
        m4.setWali(d2);
        m5.setWali(d1);

        Seminar webinarku = new Seminar();

        System.out.println("\nREGISTRASI:");
        webinarku.registrasi(d1);
        webinarku.registrasi(d2);
        webinarku.registrasi(m1);
        webinarku.registrasi(m2);
        webinarku.registrasi(m3);
        webinarku.registrasi(m4);
        webinarku.registrasi(m5);

        System.out.println("\nTotal Peserta Terdaftar: " + webinarku.countPeserta());

        System.out.println("Jumlah Peserta Kategori Mahasiswa: " + webinarku.countMahasiswa());

        webinarku.tampilPeserta();

        System.out.println("\nDATA MAHASISWA:");
        m1.tampilDataMahasiswa();
        m2.tampilDataMahasiswa();
        m3.tampilDataMahasiswa();
        m4.tampilDataMahasiswa();
        m5.tampilDataMahasiswa();
    }
}
