/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package LintasParadigma;

// File: LambdaMapLatihan.java
// Deskripsi: Menampilkan NIM (key) dan Nama (value) dari Map menggunakan lambda

import java.util.HashMap;
import java.util.Map;

public class LambdaMapLatihan {
    public static void main(String[] args) {
        // Membuat objek Map dengan Key = String (NIM) dan Value = String (Nama)
        Map<String, String> mahasiswaMap = new HashMap<>();
        
        // Mengisi data ke dalam Map
        mahasiswaMap.put("24060124120001", "Adi");
        mahasiswaMap.put("24060124130002", "Bambang");
        mahasiswaMap.put("24060124140003", "Cici");
        mahasiswaMap.put("24060124140004", "Didi");

        // Menggunakan lambda expression dengan method forEach bawaan Map
        // Method forEach pada Map menerima dua parameter: (key, value)
        System.out.println("--- Daftar Mahasiswa (NIM dan Nama) ---");
        mahasiswaMap.forEach((nim, nama) -> {
            System.out.println("NIM: " + nim + " | Nama: " + nama);
        });
    }
}
