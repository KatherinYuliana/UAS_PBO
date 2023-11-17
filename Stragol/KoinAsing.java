import java.util.Scanner;

public class KoinAsing {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        char koin[] = new char[8];
        char koinAsing = koin[0];
        int posisi = 0;

        for(int i = 0; i < 8; i++){
            // System.out.println("Masukkan koin " + i + " : ");
            koin[i] = scan.next().charAt(0);
        }

        for(int i = 0; i < 8; i++){
            if(koin[i] != koinAsing){
                posisi = i + 1;
                break;
            }
        }

        if(posisi != -1){
            System.out.println(posisi);
        }
    }
}
