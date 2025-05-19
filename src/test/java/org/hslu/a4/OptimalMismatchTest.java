package org.hslu.a4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OptimalMismatchTest {
    @Test
    void testOptimalMismatch() {
        assertEquals(0, OptimalMismatch.optimalMismatch("ANANAS", "ANANAS"));
        assertEquals(0, OptimalMismatch.optimalMismatch("ANANAS123", "ANANAS"));
        assertEquals(3, OptimalMismatch.optimalMismatch("123ANANAS", "ANANAS"));
        assertEquals(3, OptimalMismatch.optimalMismatch("123ANANAS123", "ANANAS"));
        assertEquals(-1, OptimalMismatch.optimalMismatch("BANANA", "ANANAS"));
        assertEquals(-1, OptimalMismatch.optimalMismatch("BANANA123", "ANANAS"));
        assertEquals(-1, OptimalMismatch.optimalMismatch("123BANANA", "ANANAS"));
        assertEquals(-1, OptimalMismatch.optimalMismatch("123BANANA123", "ANANAS"));
    }

}