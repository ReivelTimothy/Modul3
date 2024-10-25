package Models;

import java.sql.Date;
import java.util.ArrayList;

public class MhsSarjana extends Mhs {

    private ArrayList<MatkulAmbil> mataKuliah = new ArrayList<>();

    public MhsSarjana(String nama, String alamat, Date tTL, String telepon, String nim, String jurusan,
            ArrayList<Presensi> lisPresensi, ArrayList<MatkulAmbil> mataKuliah) {
        super(nama, alamat, tTL, telepon, nim, jurusan, lisPresensi);
        this.mataKuliah = mataKuliah;
    }

    public ArrayList<MatkulAmbil> getMataKuliah() {
        return mataKuliah;
    }

    public void setMataKuliah(ArrayList<MatkulAmbil> mataKuliah) {
        this.mataKuliah = mataKuliah;
    }

    @Override
    public String toString() {
        return "MhsSarjana [mataKuliah=" + mataKuliah + ", getNim()=" + getNim() + ", getNama()=" + getNama()
                + ", getJurusan()=" + getJurusan() + ", getMataKuliah()=" + getMataKuliah() + ", getAlamat()="
                + getAlamat() + ", getTTL()=" + getTTL() + ", getTelepon()=" + getTelepon() + "]";
    }
    
}
