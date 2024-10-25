package Models;

abstract public class MataKuliah {
    private final String kode, sks, nama;

    public MataKuliah(String kode, String sks, String nama) {
        this.kode = kode;
        this.sks = sks;
        this.nama = nama;
    }

    public String getKode() {
        return kode;
    }

    public String getSks() {
        return sks;
    }

    public String getNama() {
        return nama;
    }

}
