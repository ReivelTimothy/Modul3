package Models;

public class MatkulPilihan extends MataKuliah {

    private int minMhs;

    public MatkulPilihan(String kode, int SKS, String nama, int minMhs) {
        super(kode, SKS, nama);
        this.minMhs = minMhs;
    }

    public int getMinMhs() {
        return minMhs;
    }



    public void setMinMhs(int minMhs) {
        this.minMhs = minMhs;
    }

    @Override
    public String toString() {
        return "MatkulPilihan [minMhs=" + minMhs + ", getMinMhs()=" + getMinMhs() + ", getKode()=" + getKode()
                + ", getSKS()=" + getSKS() + ", getNama()=" + getNama() + "]";
    }

    
    
}