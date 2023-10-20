package PrakStrukdatModul7;

public class Modul7_No5_1122041_KatherinYuliana {
    public static void main(String[] args) {
        int arr[][] = 
        {
            {7, 8, 10, 12, 14},
            {2, 0, 1, 8, 15},
            {6, 9, 5, 10, 9},
            {12, 8, 3, 6, 11},
            {1, 10, 11, 14, 13}
        };
        int count = 0;

        for(int i = 0; i < arr.length; i++){
            System.out.println("Derajat keabuan " + i + " muncul ");
            for(int j = 0; j < arr.length; j++){
                count++;
            }
            System.out.println(count + " kali");
        }

    
    }
}
