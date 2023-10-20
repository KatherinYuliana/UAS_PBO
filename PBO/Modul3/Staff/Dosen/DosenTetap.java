package Modul3.Staff.Dosen;

import java.util.List;
import Modul3.MataKuliah.MataKuliah;

public class DosenTetap extends Dosen{
    private double salary;

    public DosenTetap(String name, String address, String TTL, String telephone, String NIK, String status, String departemen, List<MataKuliah> listMataKuliah, double salary) {
        super(name, address, TTL, telephone, NIK, status, departemen, listMataKuliah);
        this.salary = 5000000;
    }

    public int getSalary() {
        return (int) salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
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
                "\nGaji: " + salary;
    }
}
