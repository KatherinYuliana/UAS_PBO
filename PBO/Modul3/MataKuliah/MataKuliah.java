package Modul3.MataKuliah;

public class MataKuliah {
    private String kode;
    private int SKS;
    private String namaMK;

    public MataKuliah(String kode, int SKS, String namaMK) {
        this.kode = "IF-301";
        this.SKS = 3;
        this.namaMK = "PBO";
    }

    public String getKode() {
        return kode;
    }

    public void setKode(String kode) {
        this.kode = kode;
    }

    public int getSKS() {
        return SKS;
    }

    public void setSKS(int SKS) {
        this.SKS = SKS;
    }

    public String getNamaMK() {
        return namaMK;
    }

    public void setNama(String namaMK) {
        this.namaMK = namaMK;
    }

    @Override
    public String toString() {
        return "Matakuliah: \nKode: " + kode + "\nNama Matakuliah: " + namaMK + "\nSKS: " + SKS;
    }
}
