package at.eim.algodat;

import java.util.Random;

public class DataGenerator {
    public static int[] generateDataArray(int size) {
        Random rnd = new Random();
        int[] data = new int[size];
        for(int i = 0; i < size; i++) {
            data[i] = rnd.nextInt();
        }
        return data;
    }

    public static int[] generateDataArray(int size, int min, int max) {
        Random rnd = new Random();
        int[] data = new int[size];
        for(int i = 0; i < size; i++) {
            data[i] = rnd.nextInt(min,max + 1);
        }
        return data;
    }

    public static void printArray(int[] data) {
        for (int i : data) {
            System.out.print(i + " ");
        }
    }

}