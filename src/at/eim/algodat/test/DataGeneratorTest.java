package at.eim.algodat.test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import at.eim.algodat.DataGenerator;

public class DataGeneratorTest {
    @Test
    void testGenerateDataArray() {
        int[] data = DataGenerator.generateDataArray(5);
        Assertions.assertEquals(data.length, 5);
    }
}
