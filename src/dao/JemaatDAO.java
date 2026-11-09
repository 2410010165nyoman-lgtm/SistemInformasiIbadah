
package dao;

import config.Koneksi;
import model.Jemaat;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class JemaatDAO {
    //mengambil seluruh data jemaat
    public List<Jemaat> getAll(){
        
        List<Jemaat> daftarJemaat = new ArrayList<>();
        String sql = "SELECT * FROM jemaat ORDER BY id_jemaat ASC";
        
        try (Connection conn = Koneksi.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql);
             ResultSet rs = ps.executeQuery()) {
            while (rs.next()) {
                
                Jemaat jemaat = new Jemaat(
                rs.getInt("id_jemaat"),
                rs.getString("nama_lengkap"),
                rs.getString("jenis_kelamin"),
                rs.getString("tanggal_lahir"),
                rs.getString("no_hp"),
                rs.getString("alamat"),
                rs.getString("status_jemaat")
                );
                
                daftarJemaat.add(jemaat);
            }
            
        } catch (SQLException e) {
            System.out.println("gagal mengambil data: " + e.getMessage());
        }
        return daftarJemaat;
        
    }
    
    //menambahkan data jemaat
    public boolean insert(Jemaat jemaat) {
        String sql = "INSERT INTO jemaat"
                + "(nama_lengkap, jenis_kelamin, tanggal_lahir, "
                + "no_hp, alamat, status_jemaat )"
                + "VALUES (?, ?, ?, ?, ?, ?)";
        
        try (Connection conn = Koneksi.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {
            
            ps.setString(1, jemaat.getNamaLengkap());
            ps.setString(2, jemaat.getJenisKelamin());
            ps.setString(3, jemaat.getTanggalLahir());
            ps.setString(4, jemaat.getNoHp());
            ps.setString(5, jemaat.getAlamat());
            ps.setString(6, jemaat.getStatusJemaat());
            
            return ps.executeUpdate() >0;
            
        } catch (SQLException e) {
            System.out.println("Gagal menambahkan data: " + e.getMessage());
            return false;
        } 
    }
        
        //mengubah data jemaat
         public boolean update(Jemaat jemaat) {
            
            String sql = "UPDATE jemaat SET "
                    + "nama_lengkap = ?, jenis_kelamin = ?, "
                    + "tanggal_lahir = ?, no_hp = ?,"
                    + "alamat = ?, status_jemaat =? "
                    + "WHERE id_jemaat =?";
            
            try (Connection conn = Koneksi.getConnection();
                 PreparedStatement ps = conn.prepareStatement(sql)) {
                
            ps.setString(1, jemaat.getNamaLengkap());
            ps.setString(2, jemaat.getJenisKelamin());
            ps.setString(3, jemaat.getTanggalLahir());
            ps.setString(4, jemaat.getNoHp());
            ps.setString(5, jemaat.getAlamat());
            ps.setString(6, jemaat.getStatusJemaat());
            ps.setInt(7, jemaat.getIdJemaat());

            return ps.executeUpdate() > 0;
            
            } catch (SQLException e) {
                System.out.println("Gagal mengubah data: " + e.getMessage());
                return false;
            }
        }
        
        //menghapus data jemaat
        public boolean delete(int idJemaat) {
            
            String sql = "DELETE FROM jemaat WHERE id_jemaat = ?";
            
            try (Connection conn = Koneksi.getConnection();
                 PreparedStatement ps = conn.prepareStatement(sql)) {
                
                ps.setInt(1, idJemaat);
                
                return ps.executeUpdate() > 0;
                
            } catch (SQLException e) {
                System.out.println("gagal menghapus data: " + e.getMessage());
                return false;
            }
        }
    }
    

