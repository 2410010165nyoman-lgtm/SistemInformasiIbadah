
package main;

import dao.JemaatDAO;


public class TestDeleteJemaat {
    public static void main(String[] args) {
        JemaatDAO jemaatDAO = new JemaatDAO();
        
        int idJemaat = 3;
        
        boolean berhasil = jemaatDAO.delete(idJemaat);
        
        if (berhasil) {
            System.out.println("Data berhasil di delete");
        } else{
            System.out.println("Data gagal di delete");
        }
        
    }
}
