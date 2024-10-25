package Models;

import java.sql.Date;
import java.util.ArrayList;

public class Dosen extends Staff {
    private String departemen;
    private ArrayList<MataKuliah> listMataKuliah = new ArrayList<>();

    public Dosen(String departemen, ArrayList<MataKuliah> listMataKuliah, String nama, String alamat, Date tTL,
            String telepon, String NIK, double gaji) {
        super(nama, alamat, tTL, telepon, NIK, gaji);
        this.departemen = departemen;
        this.listMataKuliah = listMataKuliah;
    }

    public String getDepartemen() {
        return departemen;
    }

    public void setDepartemen(String departemen) {
        this.departemen = departemen;
    }

    public ArrayList<MataKuliah> getListMataKuliah() {
        return listMataKuliah;
    }

    public void setListMataKuliah(ArrayList<MataKuliah> listMataKuliah) {
        this.listMataKuliah = listMataKuliah;
    }

}
