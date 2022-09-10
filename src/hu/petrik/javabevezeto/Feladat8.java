package hu.petrik.javabevezeto;

import java.util.Random;
import java.util.Scanner;

public class Feladat8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rnd = new Random();
        while(true){
            System.out.print("Adja meg a tippjét (0: fej, 1: írás): ");
            int guess = sc.nextInt();
            int result = rnd.nextInt(2);
            System.out.println("Dobás eredménye: " + result);
            if (result == guess){
                System.out.println("Gratulálok, nyertél!!!");
            }else {
                System.out.println("Most nem nyertél. Próbálkozz újra, Sok szerencsét!");
            }
        }
    }
}
