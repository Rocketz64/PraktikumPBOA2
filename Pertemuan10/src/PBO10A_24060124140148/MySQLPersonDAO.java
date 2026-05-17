/*  Nama File   : MySQLPersonDAO.java
    Deskripsi   : Implementasi PersonDAO untuk MySQL
    Pembuat     : Muhammad Alfaiq Rido Salafy/24060124140148
    Tanggal     : 11/05/2026
 */

package PBO10A_24060124140148;

import java.sql.*;

public class MySQLPersonDAO implements PersonDAO{
    public void savePerson(Person person) throws Exception{
        String name = person.getName();
        Class.forName("com.mysql.jbdc.Driver");
        Connection con = DriverManager.getConnection("jbdc:mysql://localhost/pbo","root","");
        String query = "INSERT INTO person(name) VALUES('"+name+"')";
        System.out.println(query);
        Statement s = con.createStatement();
        s.executeUpdate(query);
        con.close();
    }
}
