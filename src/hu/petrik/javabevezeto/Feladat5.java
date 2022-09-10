package hu.petrik.javabevezeto;

import java.util.Scanner;

public class Feladat5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Kérem adja meg a téglalap 'a' oldalát: ");
        double a = sc.nextDouble();
        sc.nextLine();
        System.out.print("Kérem adja meg a téglalap 'b' oldalát: ");
        double b = sc.nextDouble();
        sc.nextLine();
        System.out.print("Kérem adja meg hogy mit szeretne kiszámítani (K:kerüéet, T:terület): ");
        String operation = sc.nextLine();
        if (operation.equals("K")) {
            double perimeter = 2 * (a + b);
            System.out.printf("A téglalap kerülete %.2f cm \n", perimeter);
        } else if (operation.equals("T")) {
            double area = a * b;
            System.out.printf("A téglalap területe %.2f cm^2 \n", area);
        } else {
            System.out.println("Hibás műveletett adott meg!");
        }

        if (a == b) {
            System.out.println("A megadott terület egy négyzet!");
        }
    }
}
