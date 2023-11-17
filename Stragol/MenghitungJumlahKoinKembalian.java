import java.util.Scanner;

public class MenghitungJumlahKoinKembalian {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // int koin[] = {100, 50, 25, 10, 5, 1};
        // int koin[] = {10, 10, 5};
        int koin[] = {20, 10, 5, 2, 1};

        System.out.println("Masukkan jumlah koin kembalian: ");
        int n = scan.nextInt();
        
        int count = 0;

        for(int temp : koin){
            while(n >= temp){
                count++;
                n -= temp;
            }
            //System.out.println("Keping koin " + koin[count] + " berjumlah " + count);
        }

        System.out.println("Jumlah keping koin: " + count);
    }
}
