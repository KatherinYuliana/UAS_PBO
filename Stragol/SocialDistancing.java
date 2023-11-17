import java.util.Scanner;

public class SocialDistancing {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Masukkan n: ");
        int n = scan.nextInt();
        System.out.println("Masukkan i: ");
        int i = scan.nextInt();
        int a[] = new int[n];

        for(int j = 0; j < n; j++){
            System.out.println("Masukkan n: ");
            a[j] = scan.nextInt();
        }
    }
}
