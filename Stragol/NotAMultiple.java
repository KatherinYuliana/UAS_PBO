import java.util.Scanner;

public class NotAMultiple {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        int x = 0;

        for(int i = 0; i < 100; i++){
            x = i;
            if(x >= 2 && x <= 100){
                if(x % 2 != a && x % 2 != b && x % 2 != c){
                    System.out.println(x);
                    break;
                }
            }
        }
    }
}
