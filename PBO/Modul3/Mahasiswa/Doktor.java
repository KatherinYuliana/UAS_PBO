package Modul3.Mahasiswa;

public class Doktor extends Mahasiswa{
    private String judulPenelitianDisertasi;
    private int sidang1;
    private int sidang2;
    private int sidang3;

    public Doktor(String name, String address, String TTL, String telephone, String status, String NIM, String jurusan, String judulPenelitianDisertasi, int sidang1, int sidang2, int sidang3) {
        super(name, address, TTL, telephone, status, NIM, jurusan);
        this.judulPenelitianDisertasi = "Judul Penelitian";
        this.sidang1 = sidang1;
        this.sidang2 = sidang2;
        this.sidang3 = sidang3;
    }

    public String getJudulPenelitianDisertasi() {
        return judulPenelitianDisertasi;
    }

    public void setJudulPenelitianDisertasi(String judulPenelitianDisertasi) {
        this.judulPenelitianDisertasi = judulPenelitianDisertasi;
    }

    public int getSidang1() {
        return sidang1;
    }

    public void setSidang1(int sidang1) {
        this.sidang1 = sidang1;
    }

    public int getSidang2() {
        return sidang2;
    }

    public void setSidang2(int sidang2) {
        this.sidang2 = sidang2;
    }

    public int getSidang3() {
        return sidang3;
    }

    public void setSidang3(int sidang3) {
        this.sidang3 = sidang3;
    }

    @Override
    public String toString() {
        return "Nama Mahasiswa: " + getNama() + 
                "\nAlamat: " + getAlamat() + 
                "\nTTL: " + getTTL() + 
                "\nNo Telepon: " + getTelephone() + 
                "\nNIM: " + getNIM() +
                "\nJurusan: " + getJurusan() +
                "\nJudul Penelitian Disertasi: " + judulPenelitianDisertasi +
                "\nNilai Sidang 1: " + sidang1 + 
                "\nNilai Sidang 2: " + sidang2 + 
                "\nNilai Sidang 3: " + sidang3;
    }
}
