/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AlgoMinggu9;


import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class SoalNo2 {
    public static double rataQuis(int quis1, int quis2, int quis3, int quis4, int quis5){
        double rataQuis = 0;
        if (quis1 < quis2 && quis1 < quis3 && quis1 < quis4 && quis1 < quis5) {
            rataQuis = (quis2 + quis3 + quis4 + quis5) / 4;
        }
        if (quis2 < quis3 && quis2< quis4 && quis2 < quis5) {
            rataQuis = (quis1 + quis3 + quis4 + quis5) / 4;
        }
        if (quis3< quis4 && quis3< quis5) {
            rataQuis = (quis1 + quis2 + quis4 + quis5) / 4;
        }
        if (quis4 < quis5) {
            rataQuis = (quis1 + quis2 + quis3 + quis5) / 4;
        }
        if (quis5 > quis1 && quis5 > quis2 && quis5 > quis3 && quis5 > quis4) {
            rataQuis = (quis1 + quis2 + quis3 + quis4) / 4;
        }
        return rataQuis;
    }
    
    public static double angkaAkhir(double rataQuis, int uts, int uas){
        double angkaAkhir = 0;
        angkaAkhir = (rataQuis * 20 / 100) + (uts * 30 / 100) + (uas * 50 / 100);
        return angkaAkhir;
    }
    
    public static String hurufMutu(double angkaAkhir){
        String hurufMutu = "";
        if (angkaAkhir >= 80 ) {
            hurufMutu = "A";
        } else if (angkaAkhir >= 68) {
            hurufMutu = "B";
        } else if (angkaAkhir >= 56) {
            hurufMutu = "C";
        } else if (angkaAkhir >= 41) {
            hurufMutu = "D";
        } else {
            hurufMutu = "E";
        }
        return hurufMutu;
    }
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Masukkan nilai quis 1: ");
        int quis1 = scan.nextInt();
        System.out.println("Masukkan nilai quis 2: ");
        int quis2 = scan.nextInt();
        System.out.println("Masukkan nilai quis 3: ");
        int quis3 = scan.nextInt();
        System.out.println("Masukkan nilai quis 4: ");
        int quis4 = scan.nextInt();
        System.out.println("Masukkan nilai quis 5: ");
        int quis5 = scan.nextInt();
        System.out.println("Masukkan nilai uts : ");
        int uts = scan.nextInt();
        System.out.println("Masukkan nilai uas : ");
        int uas = scan.nextInt();
        
        double quis = rataQuis(quis1, quis2, quis3, quis4, quis5);
        double nilaiAkhir = angkaAkhir(quis, uts, uas);
        String nilaiMutu = hurufMutu(nilaiAkhir);
        
        System.out.println("Nilai Akhir : " + nilaiAkhir);
        System.out.println("Huruf Mutu : " + nilaiMutu);
    }
}
