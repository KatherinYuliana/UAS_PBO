import java.util.Scanner;
// sort jumlah harinya

public class NumberOfTasks {

    public static int tasks(int hari, int banyak[], int barang[]) {
        int n = banyak.length;
        int temp[][] = new int[n + 1][hari + 1];
        int count = 0;

        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= hari; j++) {
                if (i == 0 || j == 0) {
                    temp[i][j] = 0;
                    // count += 1;
                } else if (banyak[i - 1] <= j) {
                    temp[i][j] = Math.max(barang[i - 1] + temp[i - 1][j - banyak[i - 1]], temp[i - 1][j]);
                    // count += 1;
                } else {
                    temp[i][j] = temp[i - 1][j];
                    // count += 1;
                }
            }
        }

        return count;
    }

    public static void main(String[] args) {
        //Scanner scan = new Scanner(System.in);
        int hari = 7;
        int banyak[] = new int[5];
        int barang[] = {4, 3, 1, 5, 2};
        int tasks = tasks(hari, banyak, barang);
        System.out.println("Total pekerjaan yang dapat diselesaikan dalam waktu 7 hari: " + tasks);
        // System.out.println("Masukkan jumlah kapasitas: ");
        // int kapasitas = scan.nextInt();
        // System.out.println("Masukkan banyak barang: ");
        // int banyak = scan.nextInt();
        // int bobot[] = new int[banyak];
        // int harga[] = new int[banyak];

        // for (int i = 0; i < banyak; i++) {
        //     System.out.println("Masukkan bobot: " + (i + 1) + " :");
        //     bobot[i] = scan.nextInt();
        //     System.out.println("Masukkan harga " + (i + 1) + " :");
        //     harga[i] = scan.nextInt();
        // }

        // int total = knapsack(kapasitas, bobot, harga);
        // System.out.println("Total harga: " + total);
    }
}
