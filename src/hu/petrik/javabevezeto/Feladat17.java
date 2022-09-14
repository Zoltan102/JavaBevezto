package hu.petrik.javabevezeto;

import java.util.Random;

public class Feladat17 {
    public static void main(String[] args) {
        int[] array0 = new int[10];
        int[] array1 = new int[10];
        int[] array2 = new int[10];
        Random rnd = new Random();
        for (int i = 0; i < array0.length; i++) {
            array0[i] = rnd.nextInt(101);
            System.out.print(array0[i] + "; ");
        }
        System.out.println();
        for (int i = 0; i < array1.length; i++) {
            array1[i] = rnd.nextInt(101);
            System.out.print(array1[i] + "; ");
        }
        System.out.println();
        for (int i = 0; i < array2.length; i++) {
            array2[i] = array0[i] + array1[i];
            System.out.print(array2[i] + "; ");
        }
    }
}
