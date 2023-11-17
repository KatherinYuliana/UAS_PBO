import java.util.Scanner;

public class BuyingToys {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //System.out.println("Masukkan jumlah uang(x): ");
        int x = scan.nextInt();
        //System.out.println("Masukkan barang(a): ");
        int a = scan.nextInt();
        //System.out.println("Masukkan barang(b): ");
        int b = scan.nextInt();
        //System.out.println("Masukkan barang(c): ");
        int c = scan.nextInt();

        int temp[] = {a, b, c};
        int count = 0;
        for(int n : temp){
            while(x >= n){
                count++;
                x -= n;
            }
        }

        System.out.println(count);    
    }
}
