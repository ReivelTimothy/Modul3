package Models;

import java.sql.Date;

public class Presensi {
    private Date tanggal;
    private StatusKehadiran status;

    public Presensi(Date tanggal, StatusKehadiran status) {
        this.tanggal = tanggal;
        this.status = status;
    }

    public Date getTanggal() {
        return tanggal;
    }

    public void setTanggal(Date tanggal) {
        this.tanggal = tanggal;
    }

    public StatusKehadiran getStatus() {
        return status;
    }

    public void setStatus(StatusKehadiran status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Presensi [tanggal=" + tanggal + ", status=" + status + ", getTanggal()=" + getTanggal()
                + ", getStatus()=" + getStatus() + "]";
    }

}
