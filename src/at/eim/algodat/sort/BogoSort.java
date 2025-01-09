package at.eim.algodat.sort;

import java.util.Random;

public class BogoSort implements Sorter{

    @Override
    public int[] sort(int[] data) {
        Random random = new Random();
        boolean unsorted = true;
        int[] dataSorted = new int[data.length];
        while (unsorted) {
            unsorted = false;
            boolean[] usedIndexes = new boolean[data.length];
            int i = 0;
            while (i<data.length) {
                int rnd = random.nextInt(data.length);
                if (!usedIndexes[rnd]) {
                    dataSorted[i] = data[rnd];
                    usedIndexes[rnd] = true;
                    i++;
                }
            }
            for (int j = 1; j < data.length; j++) {
                if (dataSorted[j-1]>dataSorted[j]) {
                    unsorted = true;
                    break;
                }
            }
        }
        return dataSorted;
    }

    @Override
    public String getName() {
        return "Bogo Sort";
    }

}
