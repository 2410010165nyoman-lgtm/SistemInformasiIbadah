
package main;

import dao.JemaatDAO;
import model.Jemaat;
import java.util.List;

public class TestJemaatDAO {
    
     public static void main(String[] args) {

        // Membuat objek JemaatDAO
        JemaatDAO jemaatDAO = new JemaatDAO();

        // Mengambil seluruh data jemaat
        List<Jemaat> daftarJemaat = jemaatDAO.getAll();

        // Menampilkan data ke Output
        System.out.println("===== DATA JEMAAT =====");

        for (Jemaat jemaat : daftarJemaat) {

            System.out.println("ID            : " + jemaat.getIdJemaat());
            System.out.println("Nama          : " + jemaat.getNamaLengkap());
            System.out.println("Jenis Kelamin : " + jemaat.getJenisKelamin());
            System.out.println("Tanggal Lahir : " + jemaat.getTanggalLahir());
            System.out.println("No HP         : " + jemaat.getNoHp());
            System.out.println("Alamat        : " + jemaat.getAlamat());
            System.out.println("Status        : " + jemaat.getStatusJemaat());

            System.out.println("----------------------------");
        }
    }
}
