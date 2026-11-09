
package main;

import config.Koneksi;
import java.sql.Connection;
import java.sql.SQLException;

public class TestKoneksi {
    
    public static void main(String[] args) {
        try (Connection connection = Koneksi.getConnection()) {
            System.out.println("KONEKSI DATABASE BERHASIL");
            System.out.println("Database : agama_2410010165");
            System.out.println("Status terhubung");
            
        } catch (SQLException e) {
            System.out.println("KONEKSI DATABASE GAGAL");
            System.out.println("Pesan error:" + e.getMessage());
        }
    }
}
