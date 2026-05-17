/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
/*  Nama File   : MainDAO.java
    Deskripsi   : Main DAO
    Pembuat     : Muhammad Alfaiq Rido Salafy/24060124140148
    Tanggal     : 11/05/2026
 */

package pertemuan10;

/**
 *
 * @author alfai
 */
public class MainDAO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Person person = new Person("Indra");
        DAOManager m = new DAOManager();
        m.setPersonDAO(new MySQLPersonDAO());
        try{
            m.getPersonDAO().savePerson(person);
        } catch(Exception e){
            e.printStackTrace();
        }
    }
    
}
