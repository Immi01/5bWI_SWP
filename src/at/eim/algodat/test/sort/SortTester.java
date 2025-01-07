package at.eim.algodat.test.sort;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import at.eim.algodat.DataGenerator;
import at.eim.algodat.sort.*;

public class SortTester {
    
    @Test
    public void testSorters() {
        int[] data = {7,4,3,1,2,1};
        int[] sortedData = {1,1,2,3,4,7};
        SortAlgorithm sorter = new SortAlgorithm();
        List<Sorter> sorters = new ArrayList<>();
        sorters.add(new SortAlgorithm());
        sorters.add(new InsertionSort());
        sorters.add(new BubbleSort());
        sorters.add(new SelectionSort());
        int[] rndData = DataGenerator.generateDataArray(5);
        int[] sortedRndData = sorter.sort(rndData.clone());
        for (Sorter s : sorters) {
            Assertions.assertArrayEquals(sortedData, s.sort(data.clone()), "SORTER: " + s.getName() + s.sort(data.clone())[0]);
            //Random Tests:
            Assertions.assertArrayEquals(sortedRndData, s.sort(rndData.clone()), "SORTER: " + s.getName());
        }
    }
}