import java.util.Scanner;

public class GreatCommonDivisor {
    public static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Masukkan angka ke 1: ");
        int num1 = scan.nextInt();
        System.out.println("Masukkan angka ke 2: ");
        int num2 = scan.nextInt();
        
        int gcdResult = gcd(num1, num2);
        System.out.println("GCD dari " + num1 + " dan " + num2 + " adalah: " + gcdResult);
    }
}
