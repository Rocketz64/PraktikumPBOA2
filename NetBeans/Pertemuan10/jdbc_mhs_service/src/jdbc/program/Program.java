package jdbc.program;

import java.util.List;
import jdbc.model.Mahasiswa;
import jdbc.service.MysqlMahasiswaService;

public class Program {
    static MysqlMahasiswaService service = new MysqlMahasiswaService();

    public static void main(String[] args) {
        System.out.println("");

        // 1. INSERT
        System.out.println("===insert");
        Mahasiswa mhsAdd = new Mahasiswa(240005, "Haryo");
        service.add(mhsAdd);
        System.out.println("berhasil insert: " + mhsAdd);
        displayAll();

        // 2. UPDATE
        System.out.println("===update");
        Mahasiswa mhsUpdate = service.getById(240005);
        if (mhsUpdate != null) {
            System.out.println("Akan diupdate data lama: " + mhsUpdate);
            mhsUpdate.setNama("Dinaya");
            System.out.println("dengan data baru: " + mhsUpdate);
            service.update(mhsUpdate);
        }
        displayAll();

        // 3. DELETE
        System.out.println("===delete");
        System.out.println("akan di delete: " + service.getById(240005));
        service.delete(240005);
        displayAll();
    }

    public static void displayAll() {
        System.out.println("===displayAll");
        List<Mahasiswa> listMhs = service.getAll();
        for (Mahasiswa mhs : listMhs) {
            System.out.println(mhs);
        }
    }
}