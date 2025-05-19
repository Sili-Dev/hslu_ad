package org.hslu.a4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class QuicksearchTest {

    @Test
    void quickSearch() {
        assertEquals(0, Quicksearch.quickSearch("ANANAS", "ANANAS"));
        assertEquals(0, Quicksearch.quickSearch("ANANAS123", "ANANAS"));
        assertEquals(3, Quicksearch.quickSearch("123ANANAS", "ANANAS"));
        assertEquals(3, Quicksearch.quickSearch("123ANANAS123", "ANANAS"));
        assertEquals(-1, Quicksearch.quickSearch("BANANA", "ANANAS"));
        assertEquals(-1, Quicksearch.quickSearch("BANANA123", "ANANAS"));
        assertEquals(-1, Quicksearch.quickSearch("123BANANA", "ANANAS"));
        assertEquals(-1, Quicksearch.quickSearch("123BANANA123", "ANANAS"));
    }

}