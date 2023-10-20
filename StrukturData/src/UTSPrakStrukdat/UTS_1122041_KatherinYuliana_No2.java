package UTSPrakStrukdat;

class Transaksi{
    String namaPemilik;
    float jumlahUang;
    public Transaksi(String namaPemilik, float jumlahUang){
        this.namaPemilik = namaPemilik;
        this.jumlahUang = jumlahUang;
    }
}

public class UTS_1122041_KatherinYuliana_No2 {
    public static float total(Transaksi dataTransaksi[]){
        float total = 0;
        for(int i = 0; i < dataTransaksi.length; i++){
            total = dataTransaksi[i].jumlahUang + total;
        }
        return total;
    }

    public static float rata(float total){
        return total / 3;
    }
    
    public static void main(String[] args) {
        Transaksi dataTransaksi[] = new Transaksi[3];
        dataTransaksi[0] = new Transaksi("Albert", 20000);
        dataTransaksi[1] = new Transaksi("Dion", 25000);
        dataTransaksi[2] = new Transaksi("Lisa", 10000);
        
        float total = total(dataTransaksi);
        float rata = rata(total);
        System.out.println("Total = " + total);
        System.out.println("Rata-rata = " + rata);
    }
}
