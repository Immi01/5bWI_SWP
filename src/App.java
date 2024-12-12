import at.eim.algodat.BaseAlgorithms;
import at.eim.algodat.DataGenerator;

public class App {
    public static void main(String[] args) throws Exception {
        int[] data = DataGenerator.generateDataArray(30);
        DataGenerator.printArray(data);
        data = BaseAlgorithms.revert(data);
        System.out.println();
        DataGenerator.printArray(data);
    }
}
