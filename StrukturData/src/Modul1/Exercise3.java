/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modul1;

/**
 *
 * @author DELL
 */
class Account {
    String name;
    String email;
    String password;
    String[] friendlist = new String[3];
}

class Server {
    String port;
    String name;
    String description;
    Account[] population = new Account[6];
}

public class Exercise3 {
    public static void Server(){
        System.out.println("Masukkan nama: ");
        System.out.println("Masukkan deskripsi: ");
        System.out.println("Masukkan port: ");
    }
    public static void main(String[] args) {
        
    }
}
