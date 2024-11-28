package at.eim.algodat;

import java.util.Random;

public class DataGenerator {
    public static int[] generateDataArray(int size) {
        Random rnd = new Random();
        int[] data = new int[size];
        for(int i : data) {
            data[i] = rnd.nextInt();
        }
        return data;
    }
}