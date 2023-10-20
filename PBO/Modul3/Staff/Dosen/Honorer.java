package Modul3.Staff.Dosen;

import java.util.List;
import Modul3.MataKuliah.MataKuliah;

public class Honorer extends Dosen{
    private double honorPerSKS;

    public Honorer(String name, String address, String TTL, String telephone, String NIK, String status, String departemen, List<MataKuliah> listMataKuliah, double honorPerSKS) {
        super(name, address, TTL, telephone, NIK, status, departemen, listMataKuliah);
        this.honorPerSKS = 550000;
    }

    public double getHonorPerSKS() {
        return honorPerSKS;
    }

    public void setHonorPerSKS(double honorPerSKS) {
        this.honorPerSKS = honorPerSKS;
    }

    @Override
    public String toString() {
        return "Nama Dosen: " + getNama() + 
                "\nAlamat: " + getAlamat() + 
                "\nTTL: " + getTTL() + 
                "\nNo Telepon: " + getTelephone() + 
                "\nNIK: " + getNIK() +
                "\nDepartemen: " + getDepartemen() +
                "\nList Matkul: " + getListMataKuliah() + 
                "\nHonor Per SKS: " + getHonorPerSKS();
    }
}
