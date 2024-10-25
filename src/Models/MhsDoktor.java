package Models;

import java.sql.Date;

public class MhsDoktor extends Mhs {
    private double[] nilai = new double[3];
    private String judulPenelitian;

    public MhsDoktor(String nama, String alamat, Date tTL, String telepon, String jurusan, String nim, double[] nilai,
            String judulPenelitian) {
        super(nama, alamat, tTL, telepon, jurusan, nim);
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

}
