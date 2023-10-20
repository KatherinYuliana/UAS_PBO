/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PrakStrukdatModul4;

/**
 *
 * @author DELL
 */
public class FungsiRekrusif {
    public static int no1(int n){
        int balik = 0;
        while(n != 0){
            balik = balik * 10;
            balik = balik + n%10;
            n = n/10;
        }
        return balik;
    }
    
    public static char no2(char huruf[], String kata){
        char hasil = ' ';
        for (int i = kata.length()-1; i >= 0; i--) {
            System.out.print(kata.charAt(i));
        }
        return hasil;
    }
    
    public static String no3(int nilai[], int angka){
        for (int i = 0; i < nilai.length; i++) {
            while(angka == nilai[i]){
                return "Angka ada didalam array";
            }
        }
        for (int i = 0; i < nilai.length; i++) {
            while(angka != nilai[i]){
                return "Angka tidak ada didalam array";
            }
        }
        return "";
    }
    
    public static int no4(int array[]){
        int jumlah = 0;
        for (int i = 0; i < array.length; i++) {
            jumlah = jumlah + array[i];
        }
        return jumlah;
    }
    
    public static int no5(int arr[]){
        int max = 0;
        int min = 100;
        for (int i = 0; i < arr.length; i++) {
            if(max < arr[i]){
                max = arr[i];
            }
            if(min > arr[i]){
                min = arr[i];
            }
        }
        System.out.println("Max: " + max);
        System.out.println("Min: " + min);
        return 0;
    }

    public static void no6(int a[], int b[]){
        int temp[] = new int [a.length];
        for (int i = 0; i < a.length; i++){
            temp[i] = a[i];
        }
        for (int i = a.length-1; i >= 0; i--){
            b[i] = temp[i];
            System.out.println(b[i]);
        }
    }

    public static int no7(int n){
        if (n == 1){
            return 1;
        } else {
            return no7(n-1) + pangkat(n,3);
        }
    }

    public static int pangkat(int a, int b){
        if (b == 0){
            return 1;
        } else {
            return a*(pangkat(a, b-1));
        }
    }

    public static void no8(){

    }

    public static double no9(int jumlahAwal, int selangWaktu){

        return jumlahAwal * (Math.pow(3, selangWaktu));
    }

    public static int no10(int angka){
        int puluhan = 0;
        int satuan = 0;
        if (angka < 100){
            puluhan = angka/10;
            satuan = angka - puluhan * 10;
        }
        return puluhan + satuan;
    }
}
