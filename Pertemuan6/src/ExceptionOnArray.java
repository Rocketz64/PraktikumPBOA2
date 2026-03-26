/*  Nama File   : ExceptionOnArray.java
    Deskripsi   : Program Exception pada Array
    Pembuat     : Muhammad Alfaiq Rido Salafy/24060124140148
    Tanggal     : 26/03/2026
 */

public class ExceptionOnArray {
    public static void main(String[] args) {
        Integer[] arrayInteger = new Integer[4];
        try{
            arrayInteger[2] = 11;
            arrayInteger[4] = 10;
        } catch(ArrayIndexOutOfBoundsException exception){
            exception.printStackTrace();
        } finally{
            System.out.println("Clean up code...");
        }
    }
}
