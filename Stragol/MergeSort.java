public class MergeSort {
    public static void mergeSort(int[] arr){
        int n = arr.length;
        if(n > 1){
            int mid = n / 2;
            int[] left = new int[mid];
            int[] right = new int[n - mid];

            // Memisahkan array menjadi dua bagian
            for (int i = 0; i < mid; i++) {
                left[i] = arr[i];
            }
            for (int i = mid; i < n; i++) {
                right[i - mid] = arr[i];
            }

            // Memanggil rekursif Mergesort untuk kedua bagian
            mergeSort(left);
            mergeSort(right);
            
            // Menggabungkan dua bagian yang sudah diurutkan
            merge(left, right, arr);
        }
    }

    public static void merge(int[] left, int[] right, int[] arr) {
        int n1 = left.length;
        int n2 = right.length;
        int i = 0, j = 0, k = 0;

        while (i < n1 && j < n2) {
            if (left[i] <= right[j]) {
                arr[k] = left[i];
                i++;
            } else {
                arr[k] = right[j];
                j++;
            }
            k++;
        }

        while (i < n1) {
            arr[k] = left[i];
            i++;
            k++;
        }

        while (j < n2) {
            arr[k] = right[j];
            j++;
            k++;
        }
    }

    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = {30, 17, 11, 4, 28, 15, 8, 9};
        System.out.println("Array sebelum diurutkan:");
        printArray(arr);

        mergeSort(arr);

        System.out.println("Array setelah diurutkan:");
        printArray(arr);
    }
}