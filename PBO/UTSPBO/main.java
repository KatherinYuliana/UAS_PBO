package UTSPBO;

import java.util.Scanner;
import UTSPBO.post;

public class main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        post post = new post(null, null, null, null);
        int menu = 0;
        while(menu != 5){
            System.out.println("Pilih menu: \n1. Show User Post \n2. Show Post \n3. Change Post State \n4. Show User Best Post \n5. Keluar");
            menu =  scan.nextInt();

            switch(menu){
                case 1:
                    post.showUserPosts();
                    break;
                case 2:
                    post.showPost();
                    break;
                case 3:
                    post.changePostState(null, post);
                    break;
                case 4:
                
                    break;
                case 5:
                    System.out.println("Selesai");
                    break;
            }
        }
    }
}
