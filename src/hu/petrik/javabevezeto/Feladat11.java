package hu.petrik.javabevezeto;

import java.util.Scanner;

public class Feladat11 {
    public static void main(String[] args) {
        System.out.print("Adjon meg egy pozitív egész számot: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int sum = 0;
        for (int i = 0; i < num; i++) {
            if (i % 2 == 0) {
                sum += i;
            }
        }
        System.out.println("A számok összege: " + sum);
    }
}
