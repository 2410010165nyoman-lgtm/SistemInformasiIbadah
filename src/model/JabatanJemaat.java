package model;


public class JabatanJemaat {
    //Atribut
    private int idJabatanJemaat;
    private int idJemaat;
    private String namaJabatan;
    private String tanggalMulai;
    private String tanggalSelesai;
    private String status;
    
    //contructor
    public JabatanJemaat(int idJabatanJemaat, int idJemaat, String namaJabatan,
         String tanggalMulai, String tanggalSelesai, String status) {
        
        this.idJabatanJemaat = idJabatanJemaat;
        this.idJemaat = idJemaat;
        this.namaJabatan = namaJabatan;
        this.tanggalMulai = tanggalMulai;
        this.tanggalSelesai = tanggalSelesai;
        this.status = status;
    }
    
    //getter dan setter
    public int getIdJabatanJemaat(){
        return idJabatanJemaat;
    }
    
    public void setIdJabatanJemaat(int idJabatanJemaat) {
        this.idJabatanJemaat = idJabatanJemaat;
    }
    
    public int getIdJemaat(){
        return idJemaat;
    }
    
    public void setIdJemaat(int idJemaat) {
        this.idJemaat = idJemaat;
    }
    
    public String getNamajabatan(){
        return namaJabatan;
    }
    public void setNamaJabatan(String namaJabatan) {
        this.namaJabatan = namaJabatan;
    }
    
    public String getTanggalMulai(){
        return tanggalMulai;
    }
    
    public void setTanggalMulai(String tanggalMulai) {
        this.tanggalMulai = tanggalMulai;
    }
    
    public String getTanggalSelesai(){
        return tanggalSelesai;
    }
    
    public void setTanggalSelesai(String tanggalSelesai) {
        this.tanggalSelesai = tanggalSelesai;
    }
    
    public String getStatus() {
        return status;
    }
    
    public void setStatus(String status) {
        this.status = status;
    }
}
