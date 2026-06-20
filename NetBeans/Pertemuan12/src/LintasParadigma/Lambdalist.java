/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LintasParadigma;

// File: Lambdalist.java
// Deskripsi: Implementasi lambda pada List, digunakan sebagai parameter pada method

import java.util.ArrayList;

public class Lambdalist {
    public static void main(String[] args) {
        ArrayList<String> mahasiswaList = new ArrayList<>();
        mahasiswaList.add("Adi");
        mahasiswaList.add("Bambang");
        mahasiswaList.add("Cici");
        mahasiswaList.add("Didi");

        // Lambda digunakan sebagai parameter pada method forEach
        mahasiswaList.forEach((nama) -> System.out.println(nama));
    }
}