/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/*  Nama File   : Person.java
    Deskripsi   : Kelas Person
    Pembuat     : Muhammad Alfaiq Rido Salafy/24060124140148
    Tanggal     : 11/05/2026
 */

package pertemuan10;
import java.io.*;
/**
 *
 * @author alfai
 */
public class Person implements Serializable{
    private int id;
    private String name;

    public Person(String n){
        this.name = n;
    }

    public Person(int i, String n){
        this.id = i;
        this.name = n;
    }

    public int getId(){
        return this.id;
    }

    public String getName(){
        return this.name;
    }

    public void setId(int id){
        this.id = id;
    }

    public void setName(String name){
        this.name = name;
    }
}
