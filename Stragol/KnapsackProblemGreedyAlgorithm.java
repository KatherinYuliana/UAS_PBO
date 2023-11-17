import java.util.Scanner;

public class KnapsackProblemGreedyAlgorithm {
    public static int knapsack(int kapasitas, int bobot[], int harga[]) {
        int n = bobot.length;
        int temp[][] = new int[n + 1][kapasitas + 1];

        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= kapasitas; j++) {
                if (i == 0 || j == 0) {
                    temp[i][j] = 0;
                } else if (bobot[i - 1] <= j) {
                    temp[i][j] = Math.max(harga[i - 1] + temp[i - 1][j - bobot[i - 1]], temp[i - 1][j]);
                } else {
                    temp[i][j] = temp[i - 1][j];
                }
            }
        }

        return temp[n][kapasitas];
    }
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Masukkan jumlah kapasitas: ");
        int kapasitas = scan.nextInt();
        System.out.println("Masukkan banyak barang: ");
        int banyak = scan.nextInt();
        int bobot[] = new int[banyak];
        int harga[] = new int[banyak];

        for (int i = 0; i < banyak; i++) {
            System.out.println("Masukkan bobot: " + (i + 1) + " :");
            bobot[i] = scan.nextInt();
            System.out.println("Masukkan harga " + (i + 1) + " :");
            harga[i] = scan.nextInt();
        }

        int total = knapsack(kapasitas, bobot, harga);
        System.out.println("Total harga: " + total);
    }
}
