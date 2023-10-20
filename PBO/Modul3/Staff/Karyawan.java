package Modul3.Staff;

import java.util.List;
import Modul3.Staff.Presensi.PresensiStaff;

public class Karyawan extends Staff{
    private double salary;
    private List<PresensiStaff> listPresensiStaff;

    public Karyawan(String name, String address, String TTL, String telephone, String status, String NIK, double salary, List<PresensiStaff> listPresensiStaff) {
        super(name, address, TTL, telephone, NIK, status);
        this.salary = 1000000;
        this.listPresensiStaff = listPresensiStaff;
    }

    public int getSalary() {
        return (int) salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public List<PresensiStaff> getListPresensiStaff() {
        return listPresensiStaff;
    }

    public void setListPresensiStaff(List<PresensiStaff> listPresensiStaff) {
        this.listPresensiStaff = listPresensiStaff;
    }

    @Override
    public String toString() {
        return "Nama Karyawan: " + getNama() + 
                "\nAlamat: " + getAlamat() + 
                "\nTTL: " + getTTL() + 
                "\nNo Telepon: " + getTelephone() + 
                "\nNIK: " + getNIK() +
                "\nGaji: " + salary +
                "\nList Presensi: " + listPresensiStaff;
    }
}
