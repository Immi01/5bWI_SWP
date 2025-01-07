package at.eim.algodat.sort;

public class SortAlgorithm implements Sorter {

    public int[] sort(int[] data) {
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

    public String getName() {
        return "Sort Algorithm";
    }

}
