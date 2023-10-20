package Stragol;

public class CekDuplikasi {
    public static boolean hasDuplicates(int arr[]){
        int n = arr.length;

        for(int i = 0; i < n - 1; i++){
            for(int j = i + 1; j < n; j++){
                if(arr[i] == arr[j]){
                    return true;
                }
            }
        }

        return false;
    }

    public static void main(String[] args) {
        int arr[] = {10, 7, 6, 9, 3, 5, 7, 10, 1, 2};
        boolean hasDuplicates = hasDuplicates(arr);

        if(hasDuplicates){
            System.out.println("Ada elemen yang duplikat");
        } else {
            System.out.println("Tidak ada elemen yang diduplikat");
        }
    }

    // function hasDuplicates(arr){
    //     n = length(arr);

    //     for(int i = 0; i < n - 1; i++){
    //         for(int j = i + 1; j < n; j++){
    //             if(arr[i] == arr[j]){
    //                 return true;
    //             }
    //         }
    //     }

    //     return false;
    // }
}
