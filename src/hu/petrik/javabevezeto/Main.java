package hu.petrik.javabevezeto;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        firstQuest();
    }

    public static void firstQuest(){
        System.out.print("Adja meg a medence átmérőjét (m): ");
        int diameter = readIn();
        System.out.print("Adja meg a medence mélyslgét (m): ");
        int depth = readIn();
        System.out.println("A medence térfogata:" + Math.PI * Math.pow(diameter / 2, 2) * depth + "m^3");
    }

    public static int readIn(){
        Scanner sc =new Scanner(System.in);
        String tmp = sc.nextLine();
        int input = Integer.parseInt(tmp);
        return input;
    }
}
