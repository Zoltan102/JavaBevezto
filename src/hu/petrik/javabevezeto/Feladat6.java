package hu.petrik.javabevezeto;

import java.util.Scanner;

public class Feladat6 {
    public static void main(String[] args) {
        System.out.print("Adja meg a dolgozat eredményét: ");
        Scanner sc = new Scanner(System.in);
        int score = sc.nextInt();
        if (score < 43) {
            System.out.println("Jegy: elégtelen");
        } else if (score > 42 && score < 58) {
            System.out.println("Jegy: elégséges");
        } else if (score > 57 && score < 73) {
            System.out.println("Jegy: közepes");
        } else if (score > 72 && score < 88) {
            System.out.println("Jegy: jő");
        } else if (score > 87) {
            System.out.println("Jegy: jeles");
        }
    }
}
