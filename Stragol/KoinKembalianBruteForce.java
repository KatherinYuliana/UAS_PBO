import java.util.Scanner;

public class KoinKembalianBruteForce {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // int koin[] = {10, 10, 5};
        int koin[] = {20, 10, 5, 2, 1};

        System.out.println("Masukkan jumlah koin kembalian: ");
        int n = scan.nextInt();
        
        int count = 0;

        //while(n != 0){
            for(int i = 0; i < koin.length; i++){
                count = n / koin[i];
                if(count > 0){
                    System.out.println("Keping koin " + koin[i] + " berjumlah " + count);
                    n %= koin[i];
                }
            }
        //}
    }
}
