package at.eim.algodat.test.sort;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import at.eim.algodat.sort.Sorter;

public class SorterTest {
    
    @Test
    public void test() {
        int[] data = {7,4,3,1,2,1};
        int[] sortedData = {1,1,2,3,4,7};
        Assertions.assertArrayEquals(sortedData, Sorter.sort(data));
    }
}
    