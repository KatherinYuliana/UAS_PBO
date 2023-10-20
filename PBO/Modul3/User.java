package Modul3;

public class User {
    String nama;
    String alamat;
    String ttl;
    String telp;
    String status;

    public User(String nama, String alamat, String ttl, String telp, String status) {
        this.nama = nama;
        this.alamat = alamat;
        this.ttl = ttl;
        this.telp = telp;
        this.status = status;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getTTL() {
        return ttl;
    }

    public void setTTL(String ttl) {
        this.ttl = ttl;
    }

    public String getTelephone() {
        return telp;
    }

    public void setTelephone(String telp) {
        this.telp = telp;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Nama: " + getNama() + 
                "\nAlamat: " + getAlamat() + 
                "\nTTL: " + getTTL() + 
                "\nNo Telepon: " + getTelephone() +
                "\nStatus: " + getStatus();
    }
}
