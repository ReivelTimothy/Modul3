package Models;

import java.sql.Date;
import java.util.ArrayList;

public class MhsSarjana extends Mhs {

    private ArrayList<MataKuliah> mataKuliah = new ArrayList<>();

    public MhsSarjana(String nama, String alamat, Date tTL, String telepon, String jurusan, String nim, ArrayList<MataKuliah> mataKuliah) {
        super(nama, alamat, tTL, telepon, jurusan, nim);
        this.mataKuliah = mataKuliah;
    }

    public ArrayList<MataKuliah> getMataKuliah() {
        return mataKuliah;
    }

    public void setMataKuliah(ArrayList<MataKuliah> mataKuliah) {
        this.mataKuliah = mataKuliah;
    }

}
