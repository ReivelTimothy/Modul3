package Models;

import java.sql.Date;
import java.util.ArrayList;

public class MhsMagister extends Mhs{
    private ArrayList<MataKuliah> listMataKuliah = new ArrayList<>();
    private String judulPeneletianTesis;


    public MhsMagister(String nama, String alamat, Date tTL, String telepon, String jurusan, String nim,
            ArrayList<MataKuliah> mataKuliah) {
        super(nama, alamat, tTL, telepon, jurusan, nim);
        this.listMataKuliah = mataKuliah;
    }

    public ArrayList<MataKuliah> getMataKuliah() {
        return listMataKuliah;
    }

    public void setMataKuliah(ArrayList<MataKuliah> listMataKuliah) {
        this.listMataKuliah = listMataKuliah;
    }

    public String getJudulPeneletianTesis() {
        return judulPeneletianTesis;
    }

    public void setJudulPeneletianTesis(String judulPeneletianTesis) {
        this.judulPeneletianTesis = judulPeneletianTesis;
    }
    

     
}
