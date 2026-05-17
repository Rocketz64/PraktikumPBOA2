package jdbc.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import jdbc.model.Mahasiswa;
import jdbc.utilities.MysqlUtility;

public class MysqlMahasiswaService {
    private Connection koneksi = null;

    // Constructor mendirikan koneksi database via Utility
    public MysqlMahasiswaService() {
        this.koneksi = MysqlUtility.getConnection();
    }

    // Tambah data mahasiswa (Create)
    public void add(Mahasiswa mhs) {
        String sql = "INSERT INTO mahasiswa (id, nama) VALUES (?, ?)";
        try (PreparedStatement ps = koneksi.prepareStatement(sql)) {
            ps.setInt(1, mhs.getId());
            ps.setString(2, mhs.getNama());
            ps.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Gagal insert: " + e.getMessage());
        }
    }

    // Update data mahasiswa (Update)
    public void update(Mahasiswa mhs) {
        String sql = "UPDATE mahasiswa SET nama = ? WHERE id = ?";
        try (PreparedStatement ps = koneksi.prepareStatement(sql)) {
            ps.setString(1, mhs.getNama());
            ps.setInt(2, mhs.getId());
            ps.executeUpdate();
            System.out.println("Berhasil update");
        } catch (SQLException e) {
            System.out.println("Gagal update: " + e.getMessage());
        }
    }

    // Hapus data mahasiswa (Delete)
    public void delete(int id) {
        String sql = "DELETE FROM mahasiswa WHERE id = ?";
        try (PreparedStatement ps = koneksi.prepareStatement(sql)) {
            ps.setInt(1, id);
            ps.executeUpdate();
            System.out.println("Berhasil delete");
        } catch (SQLException e) {
            System.out.println("Gagal delete: " + e.getMessage());
        }
    }

    // Ambil data mahasiswa berdasarkan ID (Read tunggal)
    public Mahasiswa getById(int id) {
        String sql = "SELECT * FROM mahasiswa WHERE id = ?";
        try (PreparedStatement ps = koneksi.prepareStatement(sql)) {
            ps.setInt(1, id);
            try (ResultSet rs = ps.executeQuery()) {
                if (rs.next()) {
                    return new Mahasiswa(rs.getInt("id"), rs.getString("nama"));
                }
            }
        } catch (SQLException e) {
            System.out.println("Gagal getById: " + e.getMessage());
        }
        return null;
    }

    // Ambil seluruh isi tabel mahasiswa (Read multi-row)
    public List<Mahasiswa> getAll() {
        List<Mahasiswa> listMhs = new ArrayList<>();
        String sql = "SELECT * FROM mahasiswa";
        try (PreparedStatement ps = koneksi.prepareStatement(sql);
             ResultSet rs = ps.executeQuery()) {
            while (rs.next()) {
                listMhs.add(new Mahasiswa(rs.getInt("id"), rs.getString("nama")));
            }
        } catch (SQLException e) {
            System.out.println("Gagal getAll: " + e.getMessage());
        }
        return listMhs;
    }
}