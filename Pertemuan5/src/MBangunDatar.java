/*  Nama File   : MBangunDatar.java
    Deskripsi   : Main dalam class Bangun Datar, Persegi, dan Lingkaran
    Pembuat     : Muhammad Alfaiq Rido Salafy/24060124140148
    Tanggal     : 16/03/2026
 */

public class MBangunDatar {
    public static void main(String[] args) {
        /*
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
        */
        
        //BangunDatar B1 = new BangunDatar();
        //BangunDatar() itu Abstract jadi tidak bisa

        BangunDatar P2 = new Persegi(10);
        Persegi P3 = new Persegi(5);
        BangunDatar L2 = new Lingkaran(7);
        Lingkaran L3 = new Lingkaran(14); //Lingkaran jangan L2 karena sudah ada Variabel L2 di sebelumnya

        Persegi P4 = new Persegi(11);
        Lingkaran L4 = new Lingkaran(14);

        System.out.println("Luas P2 = " + P2.getLuas());
        System.out.println("Luas P3 = " + P3.getLuas());
        System.out.println("Luas P4 = " + P4.getLuas());
        System.out.println("Luas L2 = " + L2.getLuas());
        System.out.println("Luas L3 = " + L3.getLuas());
        System.out.println("Luas L4 = " + L4.getLuas());

        System.out.println("Keliling P4 = " + P4.getKeliling());
        System.out.println("Keliling L4 = " + L4.getKeliling());

        if (P2.isEqualLuas(L2)) {
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }

        if (P4.isEqualKeliling(L4)) {
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }

        Persegi P5 = new Persegi(10);
        System.out.println("Initial Area: " + P5.getLuas());

        P5.zoomIn();
        System.out.println("Area after Zoom In (10%): " + P5.getLuas()); 

        P5.zoom(200);
        System.out.println("Area after Zoom 200%: " + P5.getLuas());
        
        // Testing Interface Reference
        IResize resizableShape = new Lingkaran(10);
        resizableShape.zoomOut();
    }
}
