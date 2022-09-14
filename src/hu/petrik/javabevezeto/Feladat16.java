package hu.petrik.javabevezeto;

import java.util.Scanner;

public class Feladat16 {
    public static void main(String[] args) {
        int[] array = new int[5];
        System.out.print("Adja meg a számokat, minden szám külön sorba: ");
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
        }
        System.out.println();
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "; ");
        }
        System.out.println();
        for (int i = array.length; i > 0; i--) {
            System.out.print(array[i - 1] + "; ");
        }
        System.out.println();
        for (int i = 0; i < array.length; i += 2) {
            System.out.print(array[i] + "; ");
        }
        System.out.print("\nAdjon meg egy számot 1 és 5 között: ");
        int input = sc.nextInt();
        System.out.printf("A tömb %d. tagja: %d", input, array[input - 1]);
    }
}
