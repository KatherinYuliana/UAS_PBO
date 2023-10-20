package Stragol;

import java.util.Scanner;

// kompleksitas waktu untuk menyelesaikan knapsack problem jauh lebih cepat

public class KnapsackProblem {

    public static int knapsack(int capacity, int weight[], int values[]) {
        int n = weight.length;
        int dp[][] = new int[n + 1][capacity + 1];

        for (int i = 0; i <= n; i++) {
            for (int w = 0; w <= capacity; w++) {
                if (i == 0 || w == 0) {
                    dp[i][w] = 0;
                } else if (weight[i - 1] <= w) {
                    dp[i][w] = Math.max(values[i - 1] + dp[i - 1][w - weight[i - 1]], dp[i - 1][w]);
                } else {
                    dp[i][w] = dp[i - 1][w];
                }
            }
        }

        return dp[n][capacity];
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Masukkan jumlah kapasitas: ");
        int capacity = scan.nextInt();
        System.out.println("Masukkan banyak values: ");
        int val = scan.nextInt();
        int values[] = new int[val];
        int weight[] = new int[val];

        for (int i = 0; i < val; i++) {
            System.out.println("Masukkan values " + (i + 1) + " :");
            values[i] = scan.nextInt();
        }
        for (int i = 0; i < val; i++) {
            System.out.println("Masukkan weight: " + (i + 1) + " :");
            weight[i] = scan.nextInt();
        }

        int maxValue = knapsack(capacity, weight, values);
        System.out.println("Values maksimum yang dapat dimuat dalam knapsack adalah: " + maxValue);
    }
}
