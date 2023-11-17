import java.util.Scanner;

public class LariJauh {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int k = scan.nextInt();

        int a[] = new int[n];
        for(int i = 0; i < n; i++){
            a[i] = scan.nextInt();
        }

        int b[] = new int[k];
        for(int i = 0; i < k; i++){
            b[i] = scan.nextInt();
        }

        int hasil[] = new int[k];
        int patok = 0;

        for(int i = 0; i < k; i++){
            while (patok < n && a[patok] <= b[i]){
                b[i] -= a[patok];
                patok++;
            }
            hasil[i] = patok + 1;
        }

        for(int i = 0; i < k; i++){
            System.out.println(hasil[i]);
        }
    }
}
