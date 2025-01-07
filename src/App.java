import at.eim.algodat.BaseAlgorithms;
import at.eim.algodat.DataGenerator;
import at.eim.algodat.sort.SortAlgorithm;

public class App {
    public static void main(String[] args) throws Exception {
        int[] data = DataGenerator.generateDataArray(30);
        DataGenerator.printArray(data);
        data = BaseAlgorithms.revert(data);
        System.out.println();
        DataGenerator.printArray(data);
        
        System.out.println();

        int[] toSort = {7,4,3,1,2,1};
        SortAlgorithm sorter = new SortAlgorithm();
        DataGenerator.printArray(sorter.sort(toSort));

    }
}
