import java.util.Scanner;

public class EatingEducation {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Masukkan jumlah murid(n): ");
        int n = scan.nextInt();
        System.out.println("Masukkan max ruangan kelas(m): ");
        int m = scan.nextInt();
        int a[] = new int[n];
        for(int i = 0; i < n; i++){
            System.out.println("Masukkan a: ");
            a[i] = scan.nextInt();
        }

        int totalWaktu = 0;
        for(int i = 0; i < n; i++){
            int waktu = 0;
            if(a[i] != a[n - 1]){
                waktu = a[i] - a[i + 1];
            } else {
                waktu = 0;
            }
            totalWaktu = waktu + totalWaktu;
        }

        System.out.println("Total waktu: " + totalWaktu);
    }
}
