/*  Nama File   : MainDAO.java
    Deskripsi   : Main DAO
    Pembuat     : Muhammad Alfaiq Rido Salafy/24060124140148
    Tanggal     : 11/05/2026
 */

package PBO10A_24060124140148;

public class MainDAO {
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
