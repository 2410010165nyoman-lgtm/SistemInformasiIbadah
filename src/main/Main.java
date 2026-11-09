package main;

import model.Ibadah;
import model.JabatanJemaat;

public class Main {
    public static void main(String[] args){
      
          //membuat objek jabatan jemaat
          JabatanJemaat jabatan1 = new JabatanJemaat(
          1,
          1,
          "ketua",
          "2026-01-01",
          "2027-01-01",
          "Aktif"
          );
          
          //membuat objek ibadah
          Ibadah ibadah1 = new Ibadah(
          1,
          1,
          "Persembahyangan Bersama",
          "2026-11-10",
          "08:00:00",
          "10:00:00",
          "pura",
          "Kegiatan Persembahyangan Rutin"
          );
          
          //menampilkan data jabatan         
        System.out.println("==== DATA JABATAM JEMAAT ===");
        System.out.println("NAMA JABATAN       : " + jabatan1.getNamajabatan());
        System.out.println("STATUS             : " + jabatan1.getStatus());
        
        //menampilkan data ibadah
        System.out.println("\n=== DATA IBADAH ===");
        System.out.println("Nama Ibadah     : " + ibadah1.getNamaIbadah());
        System.out.println("Tanggal         : " + ibadah1.getTanggal() );
        System.out.println("Lokasi          : " + ibadah1.getLokasi());
        System.out.println("Keterangan      : " + ibadah1.getKeterangan() );
        System.out.println("Program berhasil dijalankan!");
    }
    
}
