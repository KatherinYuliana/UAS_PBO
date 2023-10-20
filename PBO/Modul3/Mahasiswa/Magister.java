package Modul3.Mahasiswa;

import java.util.List;
import Modul3.MataKuliah.MataKuliah;

public class Magister extends Mahasiswa{
    private List<MataKuliah> listMataKuliah;
    private String judulPenelitianTesis;
    private int nilai1;
    private int nilai2;
    private int nilai3;

    public Magister(String name, String address, String TTL, String telephone, String status, String NIM, String jurusan, List<MataKuliah> listMataKuliah, String judulPenelitianTesis, int nilai1, int nilai2, int nilai3) {
        super(name, address, TTL, telephone, status, NIM, jurusan);
        this.listMataKuliah = listMataKuliah;
        this.judulPenelitianTesis = "Judul Penelitian";
        this.nilai1 = nilai1;
        this.nilai2 = nilai2;
        this.nilai3 = nilai3;
    }

    public List<MataKuliah> getListMataKuliah() {
        return listMataKuliah;
    }

    public void setListMataKuliah(List<MataKuliah> listMataKuliah) {
        this.listMataKuliah = listMataKuliah;
    }

    public String getJudulPenelitianTesis() {
        return judulPenelitianTesis;
    }

    public void setJudulPenelitianTesis(String judulPenelitianTesis) {
        this.judulPenelitianTesis = judulPenelitianTesis;
    }

    public int getNilai1() {
        return nilai1;
    }

    public void setNilai1(int nilai1) {
        this.nilai1 = nilai1;
    }

    public int getNilai2() {
        return nilai2;
    }

    public void setNilai2(int nilai2) {
        this.nilai2 = nilai2;
    }

    public int getNilai3() {
        return nilai3;
    }

    public void setNilai3(int nilai3) {
        this.nilai3 = nilai3;
    }

    @Override
    public String toString() {
        return "Nama Mahasiswa: " + getNama() + 
                "\nAlamat: " + getAlamat() + 
                "\nTTL: " + getTTL() + 
                "\nNo Telepon: " + getTelephone() + 
                "\nNIM: " + getNIM() +
                "\nJurusan: " + getJurusan() +
                "\nList Matkul: " + getListMataKuliah() +
                "\nJudul Penelitian Tesis: " + judulPenelitianTesis +
                "\nNilai 1: " + nilai1 + 
                "\nNilai 2: " + nilai2 + 
                "\nNilai 3: " + nilai3;
    }
}
