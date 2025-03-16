package org.hslu.ex_4;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class TestDataGeneratorTest {

    @Test
    void generateDummy() {
        TestDataGenerator.generateDummy(100000);
        TestDataGenerator.generateDummy(100000);
        TestDataGenerator.generateDummy(100000);
        var startTime = System.nanoTime();
        List<Dummy> list = TestDataGenerator.generateDummy(100000);
        long elapsedNanos = System. nanoTime() - startTime;
        System.out.println("Elapsed time: " + elapsedNanos + " ns");
        assertEquals(100000, list.size());
    }

}