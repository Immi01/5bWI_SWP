package at.eim.algodat.sort;

public class BubbleSort implements Sorter{

    @Override
    public int[] sort(int[] data) {

        boolean changed = true;

        while (changed) {
            changed = false;
            for (int i = 1; i < data.length; i++) {
                if (data[i-1] > data[i]) {
                    int tmp = data[i];
                    data[i] = data[i-1];
                    data[i-1] = tmp;
                    changed = true;
                }
            }
        }

        return data;
    }

    @Override
    public String getName() {
        return "Bubble Sort";
    }

}
