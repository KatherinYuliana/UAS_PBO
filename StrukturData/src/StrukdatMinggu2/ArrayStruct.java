/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package StrukdatMinggu2;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
class SMatkul {

    String kodeMK, namaMK;
    int banyakNilai;
    int nilai[] = new int[5];
    float persentase[] = new float[5];
    float nAkhir;
    char nHuruf;
}

class SMhs {

    String nim, nama;
    int ambilMK;
    SMatkul mk[] = new SMatkul[10];
    float ip;
}

public class ArrayStruct {

    public static float nilaiAkhir(SMhs mhs[], SMatkul mk[]) {
        float total = 0;
        for (int i = 0; i < mk[i].banyakNilai; i++) {
            total = total + mhs[i].mk[i].nilai[i] * mhs[i].mk[i].persentase[i];
        }
        return total;
    }

    public static char nilaiHuruf(float nAkhir) {
        char huruf;
        if(nAkhir > 80){
            huruf = 'A';
        } else if(nAkhir > 70){
            huruf = 'B';
        } else if(nAkhir > 60){
            huruf = 'C';
        } else if (nAkhir > 50){
            huruf = 'D';
        } else {
            huruf = 'E';
        }
        return huruf;
    }

    public static void tampilkanData(SMhs mhs[]) {
        for (int i = 0; i < 2; i++) {
            System.out.println("NIM : " + mhs[i].nim);
            System.out.println("Nama: " + mhs[i].nama);
            System.out.println("Kode MK \tNama MK \tNilai1 \tNilai2 \tNilai3 \tNilai4 \tNilai5 \tNilai Akhir \tNilai Huruf");
            for (int j = 0; j < mhs[i].ambilMK; j++) {
                System.out.print(mhs[i].mk[j].kodeMK + "\t" + mhs[i].mk[j].namaMK + "\t");
                for (int k = 0; k < 10; k++) {
                    
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        SMhs mhs[] = new SMhs[2];

        for (int i = 0; i < 2; i++) {
            mhs[i] = new SMhs();

            System.out.println("Masukkan NIM: ");
            mhs[i].nim = scan.next();
            System.out.println("Masukkan Nama: ");
            mhs[i].nama = scan.next();
            System.out.println("Jumlah MK yang diambil: ");
            mhs[i].ambilMK = scan.nextInt();

            for (int j = 0; j < mhs[i].ambilMK; i++) {
                mhs[i].mk[j] = new SMatkul();
                
                System.out.println("Masukkan kode MK: ");
                mhs[i].mk[j].kodeMK = scan.next();
                System.out.println("Masukkan nama MK: ");
                mhs[i].mk[j].namaMK = scan.next();
                System.out.println("Banyak nilai: ");
                mhs[i].mk[j].banyakNilai = scan.nextInt();
                
                for (int k = 0; k < mhs[i].mk[j].banyakNilai; k++) {
                    System.out.println("Masukkan nilai ke-" + (k+1) + ": ");
                    mhs[i].mk[j].nilai[k] = scan.nextInt();
                    System.out.println("Masukkan persentase nilai ke-" + (k+1) + ": ");
                    mhs[i].mk[j].persentase[k] = scan.nextFloat();
                }
            }
        }
        
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < mhs[i].ambilMK; j++) {
                SMatkul mk[] = new SMatkul[10];
                mhs[i].mk[j].nAkhir = nilaiAkhir(mhs, mk);
                mhs[i].mk[j].nHuruf = nilaiHuruf(mhs[i].mk[j].nAkhir);
            }
        }
        
        tampilkanData(mhs);
    }
}
