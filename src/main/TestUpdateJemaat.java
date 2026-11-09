
package main;

import dao.JemaatDAO;
import model.Jemaat;

public class TestUpdateJemaat {
    public static void main(String[] args) {
        //membuat objek dao
        JemaatDAO jemaatDAO = new JemaatDAO();
        
        //membuat objek jemaat dengan id yang akan diubah
        Jemaat jemaat = new Jemaat(
        1,
        "I Nyoman deni triawam",
        "L",
        "2004-01-01",
        "08123456789",
        "Kalimantan selatan",
        "Aktif"
        );
        
        //memanggil fungsi update
        boolean berhasil = jemaatDAO.update(jemaat);
        
        //menampilkan hasil
        if (berhasil) {
            System.out.println("Data berhasil di uodate");
        } else {
            System.out.println("data gagal di update");
        }
    }
}
