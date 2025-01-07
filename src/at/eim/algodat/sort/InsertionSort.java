package at.eim.algodat.sort;

public class InsertionSort implements Sorter{

    @Override
    public int[] sort(int[] data) {
        
        for (int i = 1; i < data.length; i++) {
            for (int j = i; j != 0; j--) {
                if (data[j-1] > data[j]) {
                    int tmp = data[j];
                    data[j] = data[j-1];
                    data[j-1] = tmp;
                }
            }
        }

        return data;
    }

    public String getName() {
        return "Insertion Sort";
    }

}
