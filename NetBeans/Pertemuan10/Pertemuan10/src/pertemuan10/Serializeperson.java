/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/*  Nama File   : Serializeperson.java
    Deskripsi   : Serialisasi objek Person
    Pembuat     : Muhammad Alfaiq Rido Salafy/24060124140148
    Tanggal     : 11/05/2026
 */

package pertemuan10;
import java.io.*;

/**
 *
 * @author alfai
 */

class Person implements Serializable{
    private String name;
    
    public Person(String n){
        this.name = n;
    }
    
    public String getName(){
        return this.name;
    }
    
    public void setName(String name){
        this.name = name;
    }
}

public class Serializeperson {
    public static void main(String[] args){
        Person person = new Person("Panji");
        try{
            FileOutputStream f = new FileOutputStream("person.ser");
            ObjectOutputStream s = new ObjectOutputStream(f);
            s.writeObject(person);
            System.out.println("selesai menulis objek person");
            s.close();
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
