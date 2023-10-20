import java.util.Scanner;

public class bilanganFibonacci {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Masukkan jumlah bilangan fibonacci: ");
        int bil = scan.nextInt();

        int a = 0;
        int b = 1;
        int temp = 0;

        for (int i = 1; i <= bil; i++){
            //System.out.println("Fibonacci ke - " + i + " : " + a);
            temp = a;
            a = a + b;
            b = a - b;
        }
        System.out.println("Fibonacci : " + temp);
    }
}
