package Models;

import java.sql.Date;
import java.util.ArrayList;

public class Dosen extends Staff {
    private String departemen;
    private ArrayList<MatkulAmbil> listMataKuliah = new ArrayList<>();
        
    public Dosen(String nama, String alamat, Date tTL, String telepon, String nIK, double gaji, String departemen,
            ArrayList<MatkulAmbil> listMataKuliah) {
        super(nama, alamat, tTL, telepon, nIK, gaji);
        this.departemen = departemen;
        this.listMataKuliah = listMataKuliah;
    }

    public String getDepartemen() {
        return departemen;
    }

    public void setDepartemen(String departemen) {
        this.departemen = departemen;
    }

    public ArrayList<MatkulAmbil> getListMataKuliah() {
        return listMataKuliah;
    }

    public void setListMataKuliah(ArrayList<MatkulAmbil> listMataKuliah) {
        this.listMataKuliah = listMataKuliah;
    }

    @Override
    public String toString() {
        return "Dosen [departemen=" + departemen + ", listMataKuliah=" + listMataKuliah + ", getNIK()=" + getNIK()
                + ", getNama()=" + getNama() + ", getGaji()=" + getGaji() + ", getAlamat()=" + getAlamat()
                + ", getDepartemen()=" + getDepartemen() + ", getTTL()=" + getTTL() + ", getListMataKuliah()="
                + getListMataKuliah() + ", getTelepon()=" + getTelepon() + "]";
    }

    
}
