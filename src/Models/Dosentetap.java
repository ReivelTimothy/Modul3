package Models;

import java.sql.Date;
import java.util.ArrayList;

public class DosenTetap extends Dosen {
    private double gaji;

    
    public DosenTetap(String nama, String alamat, Date tTL, String telepon, String nIK, double gaji, String departemen,
            ArrayList<MatkulAmbil> listMataKuliah, double gaji2) {
        super(nama, alamat, tTL, telepon, nIK, gaji, departemen, listMataKuliah);
        gaji = gaji2;
    }

    public double getGaji() {
        return gaji;
    }

    public void setGaji(double gaji) {
        this.gaji = gaji;
    }

    @Override
    public String toString() {
        return "DosenTetap [gaji=" + gaji + ", getNIK()=" + getNIK() + ", getNama()=" + getNama() + ", getGaji()="
                + getGaji() + ", getAlamat()=" + getAlamat() + ", getDepartemen()=" + getDepartemen() + ", getTTL()="
                + getTTL() + ", getListMataKuliah()=" + getListMataKuliah() + ", getTelepon()=" + getTelepon() + "]";
    }

    

    
}
