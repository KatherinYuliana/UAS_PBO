import java.util.Scanner;

public class BilanganFibonacci {

    public static int Fibonacci(int n){
        if(n <= 1){
            return n;
        } else {
            return Fibonacci(n - 1) + Fibonacci(n - 2);
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Fibonnaci ke: ");
        int n = scan.nextInt();

        int fib = Fibonacci(n);
        System.out.println("Fibonacci: " + fib);
    }
}
