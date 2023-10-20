package Modul3.Staff.Presensi;

public class PresensiStaff {
    private String tanggal;
    private String status;
    private double jam;

    public PresensiStaff(String tanggal, String status, double jam) {
        this.tanggal = tanggal;
        this.status = status;
        this.jam = jam;
    }

    public String getTanggal() {
        return tanggal;
    }

    public void setTanggal(String tanggal) {
        this.tanggal = tanggal;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public double getJam() {
        return jam;
    }

    public void setJam(double jam) {
        this.jam = jam;
    }

    @Override
    public String toString() {
        return "Tanggal: " + tanggal + " Status: " + status + " Jam: " + jam;
    }
}
