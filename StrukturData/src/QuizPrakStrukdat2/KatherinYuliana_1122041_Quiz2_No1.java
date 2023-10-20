package QuizPrakStrukdat2;

import java.util.Scanner;

class Account {
    String name;
    String email;
    String password;
    String friendlist[] = new String[3];

    public Account(String name, String email, String password, String friendlist[]) {
        this.name = name;
        this.email = email;
        this.password = password;
        this.friendlist[0] = "";
        this.friendlist[1] = "";
        this.friendlist[2] = "";
    }
}

class Server {
    String port;
    String name;
    String description;
    Account population[] = new Account[6];

    public Server(String port, String name, String description) {
        this.port = port;
        this.name = name;
        this.description = description;
    }
}

public class KatherinYuliana_1122041_Quiz2_No1 {
    public static void buatServer() {
        Scanner scan = new Scanner(System.in);
        Server server[] = new Server[6];

        for (int i = 0; i < 1; i++) {
            System.out.println("Masukkan nama: ");
            server[i].name = scan.nextLine();
            System.out.println("Masukkan deskripsi: ");
            server[i].description = scan.nextLine();
            System.out.println("Masukkan port: ");
            server[i].port = scan.nextLine();
        }
    }

    public static void buatAccount() {
        Scanner scan = new Scanner(System.in);
        Account akun[] = new Account[3];

        for (int i = 0; i < 1; i++) {
            System.out.println("Masukkan nama: ");
            akun[i].name = scan.nextLine();
            System.out.println("Masukkan email: ");
            akun[i].email = scan.nextLine();
            System.out.println("Masukkan passwaord: ");
            akun[i].password = scan.nextLine();
        }
    }

    public static void populasi() {
        Server server[] = new Server[3];
        Account akun[] = new Account[3];

        for (int i = 0; i < 1; i++) {
            for (int j = 0; j < 1; j++) {
                server[i].population[j] = akun[i];
            }
        }
    }

    public static void printPopulasi() {
        Server server[] = new Server[3];

        for (int i = 0; i < 1; i++) {
            for (int j = 0; j < 1; j++) {
                System.out.println(server[i].population[j]);
            }
        }
    }

    public static void printFriendList() {
        Account akun[] = new Account[3];
        for (int i = 0; i < 3; i++) {
            System.out.println(akun[i].friendlist[i]);
        }
    }

    public static void main(String[] args) {
        buatServer();
        buatAccount();
        populasi();
        printPopulasi();
        printFriendList();
    }
}