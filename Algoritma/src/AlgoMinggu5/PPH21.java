/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AlgoMinggu5;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class PPH21 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int gaji = 0;
        int ptkp = 0;
        double pph21 = 0;
        double pajak = 0;
       
        boolean npwp = true;
        System.out.print("Karyawan tetap / tidak : ");
        String statusKaryawan = scan.next();

        while (statusKaryawan.equals("tetap")) {
            System.out.print("NPWP ? ");
            npwp = scan.nextBoolean();
            System.out.print("Masukkan gaji : ");
            gaji = scan.nextInt();
            System.out.print("Masukkan tunjangan : ");
            int tunjangan = scan.nextInt();
            System.out.println("Masukkan status (pribadi/menikah/gabungan/3 anak): ");
            String status = scan.next();
            
            switch(status){
                case "pribadi":
                    ptkp = 54000000;
                    break;
                case "menikah":
                    ptkp = 4500000;
                    break;
                case "gabungan":
                    ptkp = 54000000;
                    break;
                case "3 anak":
                    ptkp = 4500000;
                    break;
            }

            double jjk = (gaji * 0.24 / 100);
            double jk = (gaji * 0.3 / 100);
            double bruto = gaji + tunjangan + jjk + jk;

            double jabatan = bruto * 5 / 100;
            double jht = gaji * 2 / 100;
            double jp = gaji * 1 / 100;
            double pengurangan = jabatan + jht + jp;

            double netoSebulan = bruto - pengurangan;
            double pkp = netoSebulan - ptkp;
            double netoSetahun = 12 * netoSebulan;

            double pajakSetahun = netoSetahun - ptkp;
            double pphTerhutang = pajakSetahun * 5 / 100;
            pph21 = pphTerhutang / 12;
            
            if(pkp < 50000000){
               pajak = pph21 * 5/ 100;
            } else if (pkp > 50000000 && pkp < 250000000){
                pajak = pph21 * 15 / 100;
            } else if (pkp > 250000000 && pkp < 500000000){
                pajak = pph21 * 25 / 100;
            } else {
                pajak = pph21 * 30 / 100;
            }

            if (npwp != true) {
                pph21 = pph21 * 120 / 100;
            }
            System.out.println("PPH 21 : " + pph21);
            break;
        }

        while (statusKaryawan.equals("tidak")) {
            System.out.print("NPWP ? ");
            npwp = scan.nextBoolean();
            System.out.print("Masukkan gaji : ");
            gaji = scan.nextInt();
            pph21 = gaji * 5 / 100 * 50 / 100;

            if (npwp != true) {
                pph21 = pph21 * 120 / 100;
            }
            System.out.println("PPH 21 : " + pph21);
            break;
        }
    }
}
