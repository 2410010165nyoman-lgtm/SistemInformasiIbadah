
package main;

import dao.JemaatDAO;
import model.Jemaat;

public class TestInsertJemaat {
    public static void main(String[] args) {
        //membuat ibjek jemaat dao
        JemaatDAO jemaatDAO = new JemaatDAO();
        
        //membuat data jemat baru;
        Jemaat jemaatBaru = new Jemaat(
        0,
        "Deni Triawan",
        "L",
        "2004-01-01",
        "08123456789",
        "Kalimantan Selatan",
        "Aktif"
        );
        
        //menyimpan data je database
        boolean berhasil = jemaatDAO.insert(jemaatBaru);
        
        //menampilkan hasil
        if (berhasil) {
            System.out.println("data jemaat berhasil ditambahkan:");
        } else {
            System.out.println("data gagal ditambahkan");
        }
    }
}
