import java.util.Arrays;
import java.util.Scanner;

public class EliminasiGauss {
    
    public static void printMatrix(double[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Masukkan ukuran matriks: ");
        int n = scan.nextInt();

        // System.out.println("Masukkan nilai a: ");
        // double a = scan.nextDouble();

        // System.out.println("Masukkan nilai b: ");
        // double b = scan.nextDouble();

        // System.out.println("Masukkan nilai c: ");
        // double c = scan.nextDouble();

        double[][] augmentedMatrix = new double[n][n + 1];

        System.out.println("Masukkan elemen-elemen matriks augmented:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= n; j++) {
                //System.out.println("Masukkan nilai [" + i + "][" + j + "] :");
                augmentedMatrix[i][j] = scan.nextDouble();
            }
        }

        System.out.println("Matriks Awal:");
        printMatrix(augmentedMatrix);

        for (int k = 0; k < n; k++) {
            for (int i = k + 1; i < n; i++) {
                double factor = augmentedMatrix[i][k] / augmentedMatrix[k][k];
                for (int j = k; j <= n; j++) {
                    augmentedMatrix[i][j] -= factor * augmentedMatrix[k][j];
                }
            }

            System.out.println("Langkah " + (k + 1) + ":");
            printMatrix(augmentedMatrix);
        }

        double[] solution = new double[n];
        for (int i = n - 1; i >= 0; i--) {
            solution[i] = augmentedMatrix[i][n] / augmentedMatrix[i][i];
            for (int j = i + 1; j < n; j++) {
                solution[i] -= augmentedMatrix[i][j] * solution[j] / augmentedMatrix[i][i];
            }
        }

        System.out.println("Solusi Akhir:");
        System.out.println(Arrays.toString(solution));
    }

}