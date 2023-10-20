package UASPrakStrukdat;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Scanner;

class Data{
    String nama;
    String telp;
    String queryNama;
}

public class UAS_No2_1122041_KatherinYuliana {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Data data = new Data();
        HashMap<String, String> list = new HashMap<String, String>();
        LinkedList<String> query = new LinkedList<String>();

        int jumlah = scan.nextInt();

        //input data
        for (int i = 0; i < jumlah; i++){
            data.nama = scan.next();
            data.telp = scan.next();
            list.put(data.nama, data.telp);
        }

        //input query nama
        for (int i = 0; i < jumlah; i++){
            data.queryNama = scan.next();
            query.add(data.queryNama);
        }

        //output
        for (int i = 0; i < jumlah; i++){
            if (query.contains(i) == list.containsKey(data.nama)){
                System.out.println(list.get(data.nama));
            } else {
                System.out.println("Not Found");
            }
        }
    }
}
