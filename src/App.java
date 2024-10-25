import java.sql.Date;
import java.util.ArrayList;

import Models.*;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("test");  
        MataKuliah matkulPilihan1 = new MatkulPilihan("0A1", 2, "Interprenership", 0);
        MataKuliah matkulPilihan2 = new MatkulPilihan("0A2", 3, "Design thinking", 0);
        MataKuliah mataKuliah1 = new MataKuliah("0M1", 2, "Algo");
        MataKuliah mataKuliah2 = new MataKuliah("0M2", 4, "PBO");
        Presensi presensiStaff1 = new PresensiStaff(new Date(0), StatusKehadiran.ALPHA, "01:00");
        Presensi presensiStaff2 = new PresensiStaff(new Date(0), StatusKehadiran.HADIR, "01:00");
        Presensi presensi1 = new Presensi(new Date(0), StatusKehadiran.ALPHA);
        Presensi presensi2 = new Presensi(new Date(0), StatusKehadiran.HADIR);

        ArrayList<Presensi> presensi = new ArrayList<>();
        presensi.add(presensi1);
        ArrayList <PresensiStaff> listPresensiStaff = new ArrayList<>();
        ArrayList<MatkulAjar> listMatkulAjar = new ArrayList<>();
        ArrayList<MatkulAmbil> listMatkulAmbil = new ArrayList<>();

        listMatkulAjar.add(new MatkulAjar(mataKuliah2, new ArrayList<>()));
        listMatkulAmbil.add(new MatkulAmbil(matkulPilihan2, presensi, null));

        Mhs mahasiswa1 = new MhsSarjana("Reivel", "fjaosi", new Date(0), "03812310", "1213010", "if", presensi, listMatkulAmbil);
        Mhs mahasiswa2 = new MhsMagister("Reivel1", "fjaosi", new Date(0), "03812310", "1213010", "if" ,presensi, listMatkulAmbil, "mengolah pangan dengan dfs");
        Mhs mahasiswa3 = new MhsDoktor("Reivel2", "fjaosi", new Date(0), "03812310", "1213010", "if", presensi, new double[]{90,90,90}, "fjask");
        Dosen dosen = new DosenHonorer("Ko DIoni", "fnas", new Date(0), "03198476", "01298347", 1092384, "IF", listMatkulAmbil, 30928);
        Dosen dosen2 = new DosenTetap("Ko DIoni1", "fnas", new Date(0), "03198476", "01298347", 1092384, "IF", listMatkulAmbil, 1231231);
        Karyawan karyawan1 = new Karyawan("Pa Ganjar", "fnas", new Date(0), "03198476", "01298347", 1092384, listPresensiStaff);

        System.out.println(mahasiswa1.toString() + "\n\n");
        System.out.println(mahasiswa2.toString()+ "\n\n");
        System.out.println(mahasiswa3.toString()+ "\n\n");
        System.out.println(dosen.toString()+ "\n\n");
        System.out.println(dosen2.toString()+ "\n\n");
        System.out.println(karyawan1.toString()+ "\n\n");


        

    }
}
