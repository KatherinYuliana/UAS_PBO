import java.util.Scanner;

public class MencariElemenSebuahArray {
    public static int sequentialSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i; // Mengembalikan indeks elemen jika ditemukan
            }
        }
        return -1; // Mengembalikan -1 jika elemen tidak ditemukan
    }

    public static int binarySearch(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == target) {
                return mid; // Mengembalikan indeks elemen jika ditemukan
            } else if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return -1; // Mengembalikan -1 jika elemen tidak ditemukan
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //sequential search
        System.out.println("Masukkan elemen yang mau dicari: ");
        int targetElement = scan.nextInt();
        int[] array = { 4, 7, 2, 10, 5, 8 };

        int resultIndex = sequentialSearch(array, targetElement);

        if (resultIndex != -1) {
            System.out.println("Elemen ditemukan pada indeks: " + resultIndex);
        } else {
            System.out.println("Elemen tidak ditemukan dalam array.");
        }

        //binary search
        System.out.println("Masukkan elemen yang mau dicari: ");
        int targetElement2 = scan.nextInt();
        int[] sortedArray = { 2, 4, 5, 7, 8, 10 };

        int resultIndex2 = binarySearch(sortedArray, targetElement2);

        if (resultIndex != -1) {
            System.out.println("Elemen ditemukan pada indeks: " + resultIndex2);
        } else {
            System.out.println("Elemen tidak ditemukan dalam array.");
        }
    }
}

//binary search lebih efisien karena ketika jumlah elemen dalam array besar, binary search akan menggunakan perhitungan secara logaritmik