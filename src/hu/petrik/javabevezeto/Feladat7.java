package hu.petrik.javabevezeto;

import java.util.Scanner;

public class Feladat7 {
    public static void main(String[] args) {
        System.out.print("Adja meg a hónap számát: ");
        Scanner sc = new Scanner(System.in);
        int month = sc.nextInt();
        if (month == 1 || month == 2 || month == 12) {
            System.out.println("Tél van!");
        } else if (month == 3 || month == 4 || month == 5) {
            System.out.println("Tavasz van!");
        } else if (month == 6 || month == 7 || month == 8) {
            System.out.println("Nyár van!");
        } else if (month == 9 || month == 10 || month == 11) {
            System.out.println("Ősz van!");
        }
    }
}
