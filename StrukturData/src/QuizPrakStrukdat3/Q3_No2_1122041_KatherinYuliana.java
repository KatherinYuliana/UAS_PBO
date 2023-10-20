package QuizPrakStrukdat3;

import java.util.ArrayList;
import java.util.Scanner;

public class Q3_No2_1122041_KatherinYuliana {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<Integer>();

        int jumlahData = scan.nextInt();
        int data = 0;
        for (int i = 0; i < jumlahData; i++){
            data = scan.nextInt();
            list.add(data);
        }

        int max = 0;
        int min = 100;
        double rata = 0;
        double count = 0;
        int hari = 0;
        int hari2 = 0;
        int hari3 = 0;
        int hari4 = 0;

        for (int i = 0; i < jumlahData; i++){
            //suhu tertinggi
            if (max < list.get(i)) {
                max = list.get(i);
            }
            
            //suhu terendah
            if (min > list.get(i)) {
                min = list.get(i);
            }

            //rata-rata
            count = list.get(i) + count;

            //banyak hari
            if (list.get(i) < 0){
                hari += 1;
            } else if (list.get(i) == 0){
                hari2 += 1;
            } else if (list.get(i) < 35){
                hari3 += 1;
            } else {
                hari4 += 1;
            }
        }
        rata = count / jumlahData;

        //System.out.println("Output");
        System.out.println(max);
        System.out.println(min);
        System.out.println(rata);
        System.out.println(hari);
        System.out.println(hari2);
        System.out.println(hari3);
        System.out.println(hari4);
    }
}
