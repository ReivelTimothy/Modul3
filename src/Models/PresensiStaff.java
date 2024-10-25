package Models;

import java.sql.Date;

public class PresensiStaff extends Presensi {

    private String jam;

    public PresensiStaff(Date tanggal, StatusKehadiran status, String jam) {
        super(tanggal, status);
        this.jam = jam;
    }

    public String getJam() {
        return jam;
    }

    public void setJam(String jam) {
        this.jam = jam;
    }

    @Override
    public String toString() {
        return "PresensiStaff [jam=" + jam + ", getJam()=" + getJam() + ", getTanggal()=" + getTanggal()
                + ", getStatus()=" + getStatus() + "]";
    }

}