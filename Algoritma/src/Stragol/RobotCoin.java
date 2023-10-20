package Stragol;

import java.util.Scanner;

public class RobotCoin {

    public static int maxCoins(int[][] C) {
        int n = C.length;
        int m = C[0].length;
        int[][] F = new int[n][m];

        F[0][0] = C[0][0];

        for (int j = 1; j < m; j++) {
            F[0][j] = F[0][j - 1] + C[0][j];
        }

        for (int i = 1; i < n; i++) {
            F[i][0] = F[i - 1][0] + C[i][0];
        }

        for (int i = 1; i < n; i++) {
            for (int j = 1; j < m; j++) {
                F[i][j] = Math.max(F[i - 1][j], F[i][j - 1]) + C[i][j];
            }
        }

        return F[n - 1][m - 1];
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // int C[][] = {
        // {1, 0, 0, 1, 0},
        // {0, 1, 0, 1, 0},
        // {0, 0, 1, 0, 1},
        // {1, 0, 0, 1, 0}
        // };
        System.out.print("Masukkan jumlah baris (n): ");
        int n = scan.nextInt();
        System.out.print("Masukkan jumlah kolom (m): ");
        int m = scan.nextInt();

        int C[][] = new int[n][m];

        System.out.println("Masukkan nilai koin di setiap sel:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                C[i][j] = scan.nextInt();
            }
        }

        int result = maxCoins(C);
        System.out.println("Largest number of coins the robot can collect: " + result);
    }
}