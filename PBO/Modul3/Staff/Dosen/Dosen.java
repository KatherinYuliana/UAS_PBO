package Modul3.Staff.Dosen;

import java.util.List;
import Modul3.MataKuliah.MataKuliah;
import Modul3.Staff.Staff;

public class Dosen extends Staff{
    private String departemen;
    private List<MataKuliah> listMataKuliah;

    public Dosen(String name, String address, String TTL, String telephone, String NIK, String status, String departemen, List<MataKuliah> listMataKuliah) {
        super(name, address, TTL, telephone, NIK, status);
        this.departemen = "Informatika";
        this.listMataKuliah = listMataKuliah;
    }

    public String getDepartemen() {
        return departemen;
    }

    public void setDepartemen(String departemen) {
        this.departemen = departemen;
    }

    public List<MataKuliah> getListMataKuliah() {
        return listMataKuliah;
    }

    public void setListMataKuliah(List<MataKuliah> listMataKuliah) {
        this.listMataKuliah = listMataKuliah;
    }
}
