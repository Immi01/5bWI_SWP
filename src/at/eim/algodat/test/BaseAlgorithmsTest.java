package at.eim.algodat.test;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import at.eim.algodat.BaseAlgorithms;

public class BaseAlgorithmsTest {

    @Test
    public void testRevert() {
        int[] data = {1,2,3,4,345};
        int[] revertedData = {345,4,3,2,1};
        Assertions.assertArrayEquals(revertedData, BaseAlgorithms.revert(data));
    }

    @Test
    public void testMax() {
        int[] data = {1,2,433,-3,345};
        int max = 433;
        Assertions.assertEquals(max, BaseAlgorithms.max(data));
    }

    @Test
    public void testMin() {
        int[] data = {1,2,433,-3,345};
        int min = -3;
        Assertions.assertEquals(min, BaseAlgorithms.min(data));
    }

}
