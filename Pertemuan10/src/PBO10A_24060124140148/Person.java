/*  Nama File   : Person.java
    Deskripsi   : Kelas Person
    Pembuat     : Muhammad Alfaiq Rido Salafy/24060124140148
    Tanggal     : 11/05/2026
 */

package PBO10A_24060124140148;

public class Person {
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
