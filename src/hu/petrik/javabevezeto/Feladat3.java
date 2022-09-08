package hu.petrik.javabevezeto;

import java.util.Scanner;

public class Feladat3 {
    public static void main(String[] args) {
        System.out.print("Adjon meg egy számot: ");
        Scanner sc = new Scanner(System.in);
        double num = sc.nextDouble();
        double closestWhole = Math.round(num);
        double fractionalPart = num % 1;
        double lower = num - fractionalPart;
        double upper = lower + 1;
        System.out.printf("A megadott szám a %.0f és a %.0f egész számok között van, és ezek közül a %.0f számhoz van közelebb. \n", lower, upper, closestWhole);
        System.out.printf("A szám egész része: %.2f\n", lower);
        System.out.printf("A szám tört része: %.2f", fractionalPart);
    }
}
