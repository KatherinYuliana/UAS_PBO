import java.util.ArrayList;
import java.util.List;

class Pekerjaan {
    int mulai;
    int selesai;

    public Pekerjaan (int mulai, int selesai){
        this.mulai = mulai;
        this.selesai = selesai;
    }
}

public class Penjadwalan {
    public static int maxIrisan(List<Pekerjaan> pekerjaan){
        int waktuAkhir = pekerjaan.get(0).selesai;
        int irisan = 1;
        for(int i = 0; i < pekerjaan.size(); i++){
            if(pekerjaan.get(i).mulai >= waktuAkhir){
                irisan += 1;
                waktuAkhir = pekerjaan.get(i).selesai;
            }
        }
        return irisan;
    }

    public static void main(String[] args) {
        List<Pekerjaan> pekerjaan = new ArrayList<>();
        pekerjaan.add(new Pekerjaan(0, 6));
        pekerjaan.add(new Pekerjaan(1, 4));
        pekerjaan.add(new Pekerjaan(3, 5));
        pekerjaan.add(new Pekerjaan(3, 8));
        pekerjaan.add(new Pekerjaan(4, 7));
        pekerjaan.add(new Pekerjaan(5, 9));
        pekerjaan.add(new Pekerjaan(6, 10));
        pekerjaan.add(new Pekerjaan(8, 11));

        // int totalHari = 11;
        String namaPekerjaan[] = {"a", "b", "c", "d", "e", "f", "g", "h"};
        int maxIrisan = maxIrisan(pekerjaan);
        System.out.println(maxIrisan);
        // int durasi[] = {6, 3, 2, 5, 3, 4, 4, 3};
        // int irisanWaktu = 0;

        // for(int i = 0; i < pekerjaan.length - 1; i++){
        //     // if(){

        //     // }
        //     irisanWaktu = durasi[i] - durasi [i + 1];
        // }
    }
}
