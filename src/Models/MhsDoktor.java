package Models;

import java.sql.Date;
import java.util.ArrayList;
import java.util.Arrays;

public class MhsDoktor extends Mhs {
    private double[] nilai = new double[3];
    private String judulPenelitian;

    

    public MhsDoktor(String nama, String alamat, Date tTL, String telepon, String nim, String jurusan,
            ArrayList<Presensi> lisPresensi, double[] nilai, String judulPenelitian) {
        super(nama, alamat, tTL, telepon, nim, jurusan, lisPresensi);
        this.nilai = nilai;
        this.judulPenelitian = judulPenelitian;
    }

    public double[] getNilai() {
        return nilai;
    }

    public void setNilai(double[] nilai) {
        this.nilai = nilai;
    }

    public String getJudulPenelitian() {
        return judulPenelitian;
    }

    public void setJudulPenelitian(String judulPenelitian) {
        this.judulPenelitian = judulPenelitian;
    }

    @Override
    public String toString() {
        return "MhsDoktor [nilai=" + Arrays.toString(nilai) + ", judulPenelitian=" + judulPenelitian + ", getNim()="
                + getNim() + ", getNama()=" + getNama() + ", getJurusan()=" + getJurusan() + ", getNilai()="
                + Arrays.toString(getNilai()) + ", getAlamat()=" + getAlamat() + ", toString()=" + super.toString()
                + ", getJudulPenelitian()=" + getJudulPenelitian() + ", getTTL()=" + getTTL() + ", getTelepon()="
                + getTelepon() + "]";
    }
    
}
