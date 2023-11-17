import java.util.Scanner;

public class fpb {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //int n = scan.nextInt(); //banyak apel merah & hijau
        int a = 2; //berat masing-masing apel merah 
        int b = 3; //berat masing-masing apel hijau

        while (a != b) {
            if(a > b){
                a = a - b;
            } else {
                b = b - a;
            }
        }
            
            //berat = a;
            System.out.println(a);
            
    }
}
