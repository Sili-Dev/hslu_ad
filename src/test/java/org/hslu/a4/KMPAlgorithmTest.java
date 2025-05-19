package org.hslu.a4;

import static org.junit.jupiter.api.Assertions.*;

class KMPAlgorithmTest {

    @org.junit.jupiter.api.Test
    void randTabelle() {
        assertArrayEquals(new int[]{0, 0, 0, 0, 0, 1, 2, 0}, KMPAlgorithm.randTabelle("EISBEIN"));
        assertArrayEquals(new int[]{0, 0, 0, 0, 1, 2, 3, 4}, KMPAlgorithm.randTabelle("ENTENTE"));
    }

    @org.junit.jupiter.api.Test
    void kmpSearch() {
        assertEquals(0, KMPAlgorithm.kmpSearch("ANANAS", "ANANAS"));
        assertEquals(0, KMPAlgorithm.kmpSearch("ANANAS123", "ANANAS"));
        assertEquals(3, KMPAlgorithm.kmpSearch("123ANANAS", "ANANAS"));
        assertEquals(3, KMPAlgorithm.kmpSearch("123ANANAS123", "ANANAS"));
        assertEquals(-1, KMPAlgorithm.kmpSearch("BANANA", "ANANAS"));
        assertEquals(-1, KMPAlgorithm.kmpSearch("BANANA123", "ANANAS"));
        assertEquals(-1, KMPAlgorithm.kmpSearch("123BANANA", "ANANAS"));
        assertEquals(-1, KMPAlgorithm.kmpSearch("123BANANA123", "ANANAS"));
    }

}