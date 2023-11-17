// Heapsort bekerja dengan dua tahap. Tahap pertama, konstruksi heap yaitu, membangun sebuah heap untuk array yang diberikan. 
// Tahap kedua, penghapusan maksimum yaitu, menerapkan operasi penghapusan akar sebanyak n – 1 kali untuk heap yang tersisa.
// dibandingkan dengan algoritma sort yang lain, algoritma heap sort jauh lebih efisien dalam kompleksitas waktu.
// kompleksitas waktu heap sort adalah O(n log n)
// https://123dok.com/document/yen8wr0y-transform-and-conquer.html

public class HeapSort {
    public static void heapSort(int arr[]){
        int n = arr.length;

        for(int i = n/2-1; i >= 0; i--){
            heap(arr, n, i);
        }

        for(int i = n - 1; i >= 0; i--){
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

            heap(arr, i, 0);
        }
    }

    public static void heap(int arr[], int n, int i){
        int largest = i;
        int leftChild = 2 * i + 1;
        int rightChild = 2 * i + 2;

        if(leftChild < n && arr[leftChild] > arr[largest]){
            largest = leftChild;
        }

        if(rightChild < n && arr[rightChild] > arr[largest]){
            largest = rightChild;
        }

        if(largest != i){
            int swap = arr[i];
            arr[i] = arr[largest];
            arr[largest] = swap;

            heap(arr, n, largest);
        }
    }
    public static void main(String[] args) {
        int arr[] = {12, 1, 13, 5, 4, 7};

        System.out.print("Data sebelum diurutkan: ");
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }

        heapSort(arr);

        System.out.print("\nSetelah diurutkan:");
        for(int num : arr){
            System.out.print(num + " ");
        }
    }    
}
