package model;


public class Ibadah {
    
   //Atribut
    private int idIbadah;
    private Integer idJemaat;
    private String namaIbadah;
    private String tanggal;
    private String waktuMulai;
    private String waktuSelesai;
    private String lokasi;
    private String keterangan;
    
    //constructor
    public Ibadah(int idIbadah, Integer idJemaat, String namaIbadah,
            String tanggal, String waktuMulai, String waktuSelesai,
            String lokasi, String keterangan) {
        
        this.idIbadah = idIbadah;
        this.idJemaat = idJemaat;
        this.namaIbadah = namaIbadah;
        this.tanggal = tanggal;
        this.waktuMulai = waktuMulai;
        this.waktuSelesai = waktuSelesai;
        this.lokasi = lokasi;
        this.keterangan = keterangan;
    }
    
    //getter dan setter
    public int getIdIbadah(){
        return idIbadah;
    }
    
    public void setIdIbadah (int idIbadah) {
        this.idIbadah = idIbadah;
    }
    
    public Integer getIdJemaat(){
        return idJemaat;
    }
    
    public void setIdJemaat(Integer idJemaat){
        this.idJemaat = idJemaat;
    }
    
    public String getNamaIbadah(){
        return namaIbadah;
    }
    
    public void setNamaIbadah(String namaIbadah) {
        this.namaIbadah = namaIbadah;
    }
    
    public String getTanggal(){
        return tanggal;
    }
    
    public void setTanggal(String tanggal){
        this.tanggal = tanggal;
    }
    
    public String getWaktuMulai(){
        return waktuMulai;
    }
    
    public void setWaktuMulai(String waktuMulai) {
        this.waktuMulai = waktuMulai;
    }
    
    public String getWaktuSelesai(){
        return waktuSelesai;
    }
    
    public void setWaktuSelesai(String waktuSelesai) {
        this.waktuSelesai = waktuSelesai;
    }
    
    public String getLokasi(){
        return lokasi;
    }
    
    public void setLokasi(String lokasi) {
        this.lokasi = lokasi;
    }
    
    public String getKeterangan(){
        return keterangan;
    }
    
    public void setKeterangan(String keterangan) {
        this.keterangan = keterangan;
    }
}
