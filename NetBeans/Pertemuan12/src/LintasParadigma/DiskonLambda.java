/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LintasParadigma;

// File: DiskonLambda.java
// Deskripsi: Ekspresi lambda dasar, digunakan untuk menghitung diskon

interface IDiskon {
    public double hitungDiskon(int harga);
}

public class DiskonLambda {
    public static void main(String[] args) {
        // 1. Tanpa lambda (Menggunakan Anonymous Class)
        IDiskon diskonMerdeka = new IDiskon() {
            @Override
            public double hitungDiskon(int harga) {
                return harga - (harga * 0.3); // Diskon 30%
            }
        };

        // 2. Dengan lambda (Ekspresi tunggal / single expression)
        IDiskon diskonLebaran = (harga) -> harga - (harga * 0.4); // Diskon 40%

        // 3. Dengan lambda menggunakan blok statement (multi-line)
        IDiskon diskonBiasa = (harga) -> {
            return harga - (harga * 0.1); // Diskon 10%
        };

        // Menampilkan hasil
        System.out.println("Diskon Merdeka: " + diskonMerdeka.hitungDiskon(45000));
        System.out.println("Diskon Lebaran: " + diskonLebaran.hitungDiskon(45000));
        System.out.println("Diskon Biasa: " + diskonBiasa.hitungDiskon(45000));
    }
}
