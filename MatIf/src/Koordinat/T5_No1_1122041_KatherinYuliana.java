/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Koordinat;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class T5_No1_1122041_KatherinYuliana {

    public static void koordinatPolar() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Masukkan x: ");
        double x = scan.nextDouble();
        System.out.println("Masukkan y: ");
        double y = scan.nextDouble();

        double rho = Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
        double teta = Math.toDegrees(Math.atan(y / x));

        System.out.println("rho: " + rho);
        System.out.println("teta: " + teta);
        System.out.println("Polar coordinates: (" + rho + ", " + teta + ")");
    }

    public static void sphericalPolar() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Masukkan x: ");
        double x = scan.nextDouble();
        System.out.println("Masukkan y: ");
        double y = scan.nextDouble();
        System.out.println("Masukkan z: ");
        double z = scan.nextDouble();

        double rho = Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2) + Math.pow(z, 2));
        double phi = Math.toDegrees(Math.acos(z / rho));
        double teta = Math.toDegrees(Math.atan(y / x));

        System.out.println("rho: " + rho);
        System.out.println("phi: " + phi);
        System.out.println("teta: " + teta);
        System.out.println("Cylindrical coordinates: (" + rho + ", " + phi + ", " + teta + ")");
    }

    public static void cylindrical() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Masukkan x: ");
        double x = scan.nextDouble();
        System.out.println("Masukkan y: ");
        double y = scan.nextDouble();
        System.out.println("Masukkan z: ");
        double z = scan.nextDouble();

        double rho = Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
        double teta = Math.toDegrees(Math.atan(y / x));

        System.out.println("rho: " + rho);
        System.out.println("teta: " + teta);
        System.out.println("z: " + z);
        System.out.println("Cylindrical coordinates: (" + rho + ", " + teta + ", " + z + ")");
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("1. Koordinat Polar \n2. Spherical Polar \n3. Cylindrical");
        System.out.println("Pilih no: ");
        int input = scan.nextInt();

        if (input == 1) {
            koordinatPolar();
        } else if (input == 2) {
            sphericalPolar();
        } else {
            cylindrical();
        }
    }
}
