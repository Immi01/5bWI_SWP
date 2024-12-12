package at.eim.algodat.sort;

public class Sorter {

    public static int[] sort(int[] data) {
        boolean changed = true;

        while (changed) {
            changed = false;
            for (int i = 0; i < data.length-1; i++) {
                if (data[i] > data[i+1]) {
                    int tmp = data [i];
                    data[i] = data[i+1];
                    data[i+1] = tmp;
                    changed = true;
                }
            }
        }

        return data;
    }

}
