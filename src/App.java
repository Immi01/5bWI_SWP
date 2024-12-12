import at.eim.algodat.DataGenerator;

public class App {
    public static void main(String[] args) throws Exception {
        int[] data = DataGenerator.generateDataArray(30);
        DataGenerator.printArray(data);
    }
}
