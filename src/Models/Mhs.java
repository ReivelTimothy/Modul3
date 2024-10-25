package Models;

import java.sql.Date;
import java.util.ArrayList;

abstract public class Mhs extends User{
    private final String nim; 
    private String jurusan;
    private ArrayList<Presensi> listPresensi = new ArrayList<>();
    
    

    public Mhs(String nama, String alamat, Date tTL, String telepon, String nim, String jurusan,
            ArrayList<Presensi> listPresensi) {
        super(nama, alamat, tTL, telepon);
        this.nim = nim;
        this.jurusan = jurusan;
        this.listPresensi = listPresensi;
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

    public ArrayList<Presensi> getLisPresensi() {
        return listPresensi;
    }

    public void setLisPresensi(ArrayList<Presensi> listPresensi) {
        this.listPresensi = listPresensi;
    }

    @Override
    public String toString() {
        return "Mhs [nim=" + nim + ", jurusan=" + jurusan + ", getNim()=" + getNim() + ", getNama()=" + getNama()
                + ", getJurusan()=" + getJurusan() + ", getAlamat()=" + getAlamat() + ", getTTL()=" + getTTL()
                + ", getTelepon()=" + getTelepon() + "]";
    }
}

    



