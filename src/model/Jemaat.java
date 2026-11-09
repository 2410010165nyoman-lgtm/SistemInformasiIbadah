package model;


public class Jemaat {
    // Atribut
    private int idJemaat;
    private String namaLengkap;
    private String jenisKelamin;
    private String tanggalLahir;
    private String noHp;
    private String alamat;
    private String statusJemaat;   
    
    //constructor
    public Jemaat(int idJemaat, String namaLengkap, String jenisKelamin,
            String tanggalLahir, String noHp, String alamat,
            String statusJemaat) {
        this.idJemaat = idJemaat;
        this.namaLengkap = namaLengkap;
        this.jenisKelamin = jenisKelamin;
        this.tanggalLahir = tanggalLahir;
        this.noHp = noHp;
        this.alamat = alamat;
        this.statusJemaat = statusJemaat;
    }
    
    //getter dan setter
    public int getIdJemaat() {
        return idJemaat;
    }
    
    public void setIdJemaat(int idJemaat) {
        this.idJemaat = idJemaat;
    }
    
    public String getNamaLengkap() {
        return namaLengkap;
    }
    
    public void setNamaLengkap(String namaLengkap) {
        this.namaLengkap = namaLengkap;
    }
    
    public String getJenisKelamin() {
        return jenisKelamin;
    }
    
    public void setJenisKelamin(String jenisKelamin) {
        this.jenisKelamin = jenisKelamin;
    }
    
    public String getTanggalLahir() {
        return tanggalLahir;
    }
    
    public void setTanggalLahir(String tanggalLahir) {
        this.tanggalLahir = tanggalLahir;
    }
    
    public String getNoHp(){
        return noHp;
    }
    
    public void setNoHp(String noHP) {
        this.noHp = noHp;
    }
    
    public String getAlamat(){
        return alamat;
    }
    
    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }
    
    public String getStatusJemaat(){
        return statusJemaat;
    }
    
    public void setStatusJemaat(String statusJemaat) {
        this.statusJemaat = statusJemaat;
    }
}

