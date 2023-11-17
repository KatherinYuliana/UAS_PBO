import java.util.Scanner;

public class KoinKembalianDynamicProgramming {
    public static int coin_change(int koin[], int value){
        int count = 0;
        int total = 0;

        for(int i = 0; i < koin.length; i++){
            count = value / koin[i];
            if(count > 0){
                value %= koin[i];
                total = total + count;
            }
        }
        
        return total;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int koin[] = {20, 10, 5, 2, 1};

        System.out.println("Masukkan jumlah value koin kembalian: ");
        int value = scan.nextInt();
        
        int hasil = coin_change(koin, value);
        System.out.println("Jumlah keping koin kembalian: " + hasil);
    }
}
