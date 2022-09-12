package hu.petrik.javabevezeto;

import java.util.Scanner;

public class Feladat12 {
    public static void main(String[] args) {
        System.out.print("Adjon meg egy összeget 1 és 1000 ft között: ");
        Scanner sc = new Scanner(System.in);
        int value = sc.nextInt();
        while (value - 200 >= 0) {
            System.out.print("200; ");
            value -= 200;
        }
        while (value - 100 >= 0) {
            System.out.print("100; ");
            value -= 100;
        }
        while (value - 50 >= 0) {
            System.out.print("50; ");
            value -= 50;
        }
        while (value - 20 >= 0) {
            System.out.print("20; ");
            value -= 20;
        }
        while (value - 10 > -4) {
            System.out.print("10; ");
            value -= 10;
        }
        while (value - 5 > -4) {
            System.out.print("5; ");
            value -= 5;
        }
    }
}
