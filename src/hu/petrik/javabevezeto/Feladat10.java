package hu.petrik.javabevezeto;

import java.util.Scanner;

public class Feladat10 {
    public static void main(String[] args) {
        int amount = 0;
        int even = 0;
        int odd = 0;
        Scanner sc = new Scanner(System.in);
        while (amount <= 100) {
            System.out.print("Adjon meg egy számot: ");
            int num = sc.nextInt();
            amount += num;
            if (num % 2 == 0) {
                even++;
            } else {
                odd++;
            }
        }
        System.out.printf("Páratlan számok: %d, Páros számok: %d", odd, even);
    }
}
