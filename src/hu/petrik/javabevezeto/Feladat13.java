package hu.petrik.javabevezeto;

import java.util.Random;
import java.util.Scanner;

public class Feladat13 {
    public static void main(String[] args) {
        Random rnd = new Random();
        int num = rnd.nextInt(1000) + 1;
        System.out.println("Tippeljen a gondolt számra amíg nem találja el!");
        Scanner sc = new Scanner(System.in);
        int guess = sc.nextInt();
        while (num != guess) {
            if (num > guess) {
                System.out.println("A gondolt szám nagyobb!");
            } else {
                System.out.println("A gondolt szám kissebb!");
            }
            guess = sc.nextInt();
        }
        System.out.println("Sikeresen megtippelte a számot! " + num);
    }
}
