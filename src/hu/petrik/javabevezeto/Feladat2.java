package hu.petrik.javabevezeto;

import java.util.Scanner;

public class Feladat2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Adja meg a terület szélességét (m): ");
        double width = sc.nextDouble() * 100;
        System.out.print("Adja meg a terület magasságát (m): ");
        double height = sc.nextDouble() * 100;
        double wallArea = width * height;
        double tileArea = 20 * 20;
        double numOfPieces = (width / tileArea) * 1;
        System.out.println(numOfPieces + " darab csempe kell!");
    }
}
