package Modul3.Mahasiswa;

import Modul3.User;

public class Mahasiswa extends User{
    String nim;
    String jurusan;

    public Mahasiswa(String nama, String alamat, String ttl, String telp, String status, String nim, String jurusan) {
        super(nama, alamat, ttl, telp, status);
        this.nim = "1122041";
        this.jurusan = "Informatika";
    }

    public String getNIM() {
        return nim;
    }

    public void setNIM(String nim) {
        this.nim = nim;
    }

    public String getJurusan() {
        return jurusan;
    }

    public void setJurusan(String jurusan) {
        this.jurusan = jurusan;
    }
}
