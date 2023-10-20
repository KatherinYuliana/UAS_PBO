package Modul3.MataKuliah;

import java.util.List;
import Modul3.Staff.Presensi.PresensiStaff;

public class MatkulAjar {
    private MataKuliah mataKuliah;
    private List<PresensiStaff> listPresensiStaff;

    public MatkulAjar(MataKuliah mataKuliah, List<PresensiStaff> listPresensiStaff) {
        this.mataKuliah = mataKuliah;
        this.listPresensiStaff = listPresensiStaff;
    }

    public MataKuliah getMataKuliah() {
        return mataKuliah;
    }

    public void setMataKuliah(MataKuliah mataKuliah) {
        this.mataKuliah = mataKuliah;
    }

    public List<PresensiStaff> getListPresensiStaff() {
        return listPresensiStaff;
    }

    public void setListPresensiStaff(List<PresensiStaff> listPresensiStaff) {
        this.listPresensiStaff = listPresensiStaff;
    }

    @Override
    public String toString() {
        return "MatkulAjar{" +
                "mataKuliah=" + mataKuliah +
                ", listPresensiStaff=" + listPresensiStaff +
                '}';
    }
}
