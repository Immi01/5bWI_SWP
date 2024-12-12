package at.eim.algodat.test;

import java.util.Random;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import at.eim.algodat.DataGenerator;

public class DataGeneratorTest {
    @Test
    void testGenerateDataArraySizeOnly() {
        Random rnd = new Random();
        for (int i = 0; i < 10; i++) {
            int size = rnd.nextInt(0, 20);
            int[] data = DataGenerator.generateDataArray(size);

            Assertions.assertEquals(data.length, size);

            // checks if the array just contains zeros instead of random numbers
            int emptyNumbers = 0;
            for (int rndNum : data) {
                if (rndNum == 0)
                    emptyNumbers++;
            }
            Assertions.assertTrue(emptyNumbers < 5, "empty Numbers: " + emptyNumbers);
        }
    }

    @Test
    void testGenerateDataArraySizeMinMax() {
        Random rnd = new Random();
        for (int i = 0; i < 10; i++) {
            int size = rnd.nextInt(0, 20);
            int min = rnd.nextInt();
            int max = rnd.nextInt(min,Integer.MAX_VALUE);
            int[] data = DataGenerator.generateDataArray(size, min, max);

            Assertions.assertEquals(data.length, size);

            //checks if the random Number is inside specified bounds
            for (int rndNum : data) {
                Assertions.assertTrue(min <= rndNum && rndNum <= max, "rndNum: " + rndNum + " max: " + max + " min: " + min);
            }
        }
    }

}
