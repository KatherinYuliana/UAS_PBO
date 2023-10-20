package StrukdatMinggu12;

import java.util.Scanner;

public class PBT {
    static class Node {
        int key;
        Node left, right;
    }

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt();
        Node root = tree(n);
        printTree(root, 0);
    }

    public static Node tree(int n) {
        if (n == 0) {
            return null;
        }
        int nl = n / 2;
        int nr = n - nl - 1;
        int x = sc.nextInt();
        Node newnode = new Node();
        newnode.key = x;
        newnode.left = tree(nl);
        newnode.right = tree(nr);
        return newnode;
    }

    public static void printTree(Node t, int h) {
        if (t != null) {
            printTree(t.left, h + 1);
            for (int i = 1; i <= h; i++) {
                System.out.print(" ");
            }
            System.out.println(t.key);
            printTree(t.right, h + 1);
        }
    }
}
