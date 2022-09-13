package hu.petrik.javabevezeto;

public class Feladat15 {
    public static void main(String[] args) {
        double[] array = new double[25];
        for (int i = 0; i < array.length; i++) {
            array[i] = Math.random() * 200 - 100;
        }
        for (int i = 0; i < array.length; i += 2) {
            System.out.print(Math.pow(array[i], 2) + "; ");
        }
    }
}
