/*  Nama File   : DAOManager.java
    Deskripsi   : Pengelola DAO dalam Program
    Pembuat     : Muhammad Alfaiq Rido Salafy/24060124140148
    Tanggal     : 11/05/2026
 */

package PBO10A_24060124140148;

public class DAOManager {
    private PersonDAO personDAO;

    public void setPersonDAO(PersonDAO person){
        personDAO = person;
    }
    public PersonDAO getPersonDAO(){
        return personDAO;
    }
}
