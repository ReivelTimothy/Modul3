package Models;

import java.sql.Date;
import java.util.ArrayList;

public class Staff extends User {
    final private String nIK;
    private double gaji;

    public Staff(String nama, String alamat, Date tTL, String telepon, String nIK, double gaji) {
        super(nama, alamat, tTL, telepon);
        this.nIK = nIK;
        this.gaji = gaji;
    }

    public String getNIK() {
        return nIK;
    }

    public double getGaji() {
        return gaji;
    }

    public void setGaji(double gaji) {
        this.gaji = gaji;
    }

    @Override
    public String toString() {
        return "Staff [NIK=" + nIK + ", gaji=" + gaji + ", getNIK()=" + getNIK() + ", getNama()=" + getNama()
                + ", getGaji()=" + getGaji() + ", getAlamat()=" + getAlamat() + ", getTTL()=" + getTTL()
                + ", getTelepon()=" + getTelepon() + "]";
    }

}
