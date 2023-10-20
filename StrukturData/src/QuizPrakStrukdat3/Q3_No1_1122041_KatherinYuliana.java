package QuizPrakStrukdat3;

import java.util.LinkedList;
import java.util.Random;
import java.util.Scanner;

public class Q3_No1_1122041_KatherinYuliana {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        LinkedList<String> teks = new LinkedList<String>();
        LinkedList<Integer> score = new LinkedList<Integer>();

        teks.add("why java developer wear glasses, because they can not c#.");
        teks.add("he said 'you are semicolon to my statements.' then she replies 'sorry, but i code in python.'");
        teks.add("programmer: an organism that turns caffeine into a software.");
        teks.add("there are 10 types of programmers in the world: those who understand binary, and those who don’t.");
        teks.add("writing whole project as student: bring it on!; writing 10 lines of codes as salaried: bruh!!");

        Random r = new Random();
        int x = r.nextInt(5);
        
        System.out.println(teks.get(x));
        System.out.println("Ketikan ulang kalimat tersebut: ");
        String ketik = scan.nextLine();
        
        String size = teks.get(x);
        int totalScore  = 0;
        
        for (int i = 0; i < size.length(); i++){
            if (ketik == size){
                totalScore += 1;
                score.add(totalScore);
            }
        }
        System.out.println("Total score: " + totalScore);
        
        int pilih = 0;
        while(pilih != 4){
            System.out.println("1. Ulang test saat ini \n2. Ulang test sebelumnya \n3. Next test \n4. Stop");
            pilih = scan.nextInt();
            
            switch(pilih){
                case 1:
                    System.out.println(teks.get(x));
                    System.out.println("Ketikan ulang kalimat tersebut: ");
                    ketik = scan.nextLine();

                    size = teks.get(x);
                    totalScore  = 0;
        
                    for (int i = 0; i < size.length(); i++){
                        if (ketik == size){
                            totalScore += 1;
                            score.add(totalScore);
                        }
                    }
                    System.out.println("Total score: " + totalScore);
                    System.out.println(score);
                    break;
                case 2:
                    System.out.println(teks.getFirst());
                    break;
                case 3:
                    System.out.println(teks.getLast());
                    break;
                case 4:
                    System.out.println("Selesai");
                    break;
            }
        }
    }
}
