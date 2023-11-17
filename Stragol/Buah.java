
import java.util.Scanner;

public class Buah {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt(); //banyak apel merah & hijau
        int merah = scan.nextInt(); //berat masing-masing apel merah 
        int hijau = scan.nextInt(); //berat masing-masing apel hijau

        int jumlahApelMerah = 0;
        int jumlahApelHijau = 0;
        int berat = 0;
        int a = merah;
        int b = hijau;
        //int total = 0;

        if(a <= n && b <= n){
            while(a != b){
                if(a < b){
                    a += merah;
                } else {
                    b += hijau;
                }
            }
            
            berat = a;
            jumlahApelMerah = berat / merah;
            jumlahApelHijau = berat / hijau;
            System.out.println((jumlahApelMerah + jumlahApelHijau));
        }

    }
}
