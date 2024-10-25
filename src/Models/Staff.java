package Models;

import java.sql.Date;

public class Staff extends User {
    final private String NIK;
    private double gaji;
    
    public Staff(String nama, String alamat, Date tTL, String telepon, String nIK, double gaji) {
        super(nama, alamat, tTL, telepon);
        NIK = nIK;
        this.gaji = gaji;
    }

    public String getNIK() {
        return NIK;
    }

    public double getGaji() {
        return gaji;
    }

    public void setGaji(double gaji) {
        this.gaji = gaji;
    }
    
}
