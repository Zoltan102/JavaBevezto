package hu.petrik.javabevezeto;

import java.util.Scanner;

public class Feladat14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Kérem adjon meg egy szöveget: ");
        String text = sc.nextLine();
        String menu = "";
        while (menu != "f") {
            System.out.println("Mit szeretne tenni a szöveggel?");
            System.out.println("a) nagy betűssé alakítani");
            System.out.println("b) kisbetűssé alakítani");
            System.out.println("c) lekérdezni a hosszát");
            System.out.println("d) összehasonlítani egy másik szöveggel");
            System.out.println("e) egy részét kiiratni a stringnek");
            System.out.println("f) kilépés");
            menu = sc.nextLine().toLowerCase();
            switch (menu) {
                case "a":
                    System.out.println(text.toUpperCase());
                    break;
                case "b":
                    System.out.println(text.toLowerCase());
                    break;
                case "c":
                    System.out.printf("A szöveg hossz: %d db \n", text.length());
                    break;
                case "d":
                    System.out.print("Adja meg a második szöveget: ");
                    String text2 = sc.nextLine();
                    int compare = text.compareTo(text2);
                    if (compare < 0) {
                        System.out.println("Az első szöveg van előrébb az ABC-ben!");
                    } else if (compare > 0) {
                        System.out.println("Az második szöveg van előrébb az ABC-ben!");
                    } else if (compare == 0) {
                        System.out.println("A két szöveg ugyan az!");
                    }
                    break;
                case "e":
                    System.out.print("Kérem adja meg a kezdő karakter sorszámát amit ki szeretne írni:");
                    int a = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Kérem adja meg az utolsó karaktert amit ki szeretne írni:");
                    int b = sc.nextInt();
                    sc.nextLine();
                    System.out.println(text.substring(a - 1, b));
                    break;
                case "f":
                    System.out.println("Viszlát!");
                    menu = "f";
                    break;
                default:
                    System.out.println("Rossz bemeneti adat, kérem adja meg újra!");
                    break;
            }
        }
    }
}
