package Models;

import java.sql.Date;

abstract public class Mhs extends User{
    private final String nim; 
    private String jurusan;

    public Mhs(String nama, String alamat, Date tTL, String telepon,String jurusan, String nim) {
        super(nama, alamat, tTL, telepon);
        this.jurusan = jurusan;
        this.nim = nim;
    }

    public String getNim() {
        return nim;
    }

    public String getJurusan() {
        return jurusan;
    }

    public void setJurusan(String jurusan) {
        this.jurusan = jurusan;
    }
    
}

    



