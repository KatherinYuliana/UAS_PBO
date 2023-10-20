package Stragol;

public class RowCoin {
    public static int CoinRow(int C[]){
        int n = C.length;
        if(n == 0){
            return 0;
        } else if(n == 1){
            return C[0];
        }
        
        int F[] = new int[n];
        F[0] = C[0];
        F[1] = Math.max(C[0], C[1]);

        for(int i = 2; i < n; i++){
            F[i] = Math.max(C[i] + F[i - 2], F[i - 1]);
        }
        return F[n-1];
    }
    public static void main(String[] args) {
        int C[] = {5, 1, 2, 10, 6, 2};
        int maxValue = CoinRow(C);
        System.out.println("Nilai maksimum yang bisa diperoleh adalah: " + maxValue);
    }
}
