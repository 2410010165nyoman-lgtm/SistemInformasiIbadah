
package config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class Koneksi {
    //konfigurasi database
    private static final String URL =
     "jdbc:mysql://localhost:3306/agama_2410010165";
    
    private static final String USER = "root";
    private static final String PASSWORD = "";
    
    //method untuk menghubungkan database
    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(
        URL,
        USER,
        PASSWORD
        );
    }
    
}
