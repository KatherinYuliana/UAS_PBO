import java.util.Scanner;

public class bilanganFibonacci {

    public static int Fibonacci(int bil){
        if(bil <= 1){
            return bil;
        } else {
            return Fibonacci(bil - 1) + Fibonacci(bil - 2);
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Fibonnaci ke: ");
        int bil = scan.nextInt();

        // int a = 0;
        // int b = 1;
        // int temp = 0;

        // for (int i = 1; i <= bil; i++){
        //     //System.out.println("Fibonacci ke - " + i + " : " + a);
        //     temp = a;
        //     a = a + b;
        //     b = a - b;
        // }
        // System.out.println("Fibonacci : " + temp);
        int fib = Fibonacci(bil);
        System.out.println("Fibonacci: " + fib);
    }
}
