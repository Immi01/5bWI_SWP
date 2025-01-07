package at.eim.algodat.sort;

public class SelectionSort implements Sorter{

    @Override
    public int[] sort(int[] data) {
        for (int i = 0; i < data.length; i++) {
            int smallest = i;
            for (int j = i; j < data.length; j++)
                if (data[j] < data[smallest])
                    smallest = j;
            int tmp = data[i];
            data[i] = data[smallest];
            data[smallest] = tmp;
        }

        return data;
    }

    public String getName() {
        return "Selection Sort";
    }

}
