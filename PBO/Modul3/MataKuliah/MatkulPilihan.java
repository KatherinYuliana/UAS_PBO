package Modul3.MataKuliah;

public class MatkulPilihan extends MataKuliah{
    private int minMahasiswa;

    public MatkulPilihan(String kode, int SKS, String namaMK, int minMahasiswa) {
        super(kode, SKS, namaMK);
        this.minMahasiswa = minMahasiswa;
    }

    public int getMinMahasiswa() {
        return minMahasiswa;
    }

    public void setMinMahasiswa(int minMahasiswa) {
        this.minMahasiswa = minMahasiswa;
    }

    @Override
    public String toString() {
        return "MatkulPilihan{" +
                "kode='" + getKode() + '\'' +
                ", SKS=" + getSKS() +
                ", nama='" + getNamaMK() + '\'' +
                ", minMahasiswa=" + minMahasiswa +
                '}';
    }
}
