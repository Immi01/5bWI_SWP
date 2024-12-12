package at.eim.algodat;

public class BaseAlgorithms {

    public static int[] revert(int[] data) {
        int[] reverted = new int[data.length];
        int e = 0;
        for (int i = data.length - 1; i >= 0; i--) {
            reverted[i] = data[e];
            e++;
        }
        return reverted;
    }

    public static int max(int[] data) {
        int max = data[0];
        for (int i : data) {
            if (i > max)
                max = i;
        }
        return max;
    }

    public static int min(int[] data) {
        int min = data[0];
        for (int i : data) {
            if (i < min)
                min = i;
        }
        return min;
    }

}
