package org.hslu.a4;

import static org.junit.jupiter.api.Assertions.*;

class SuchautomatTest {

    @org.junit.jupiter.api.Test
    void stateSearch() {
        assertEquals(0, Suchautomat.stateSearch("ANANAS"));
        assertEquals(0, Suchautomat.stateSearch("ANANAS123"));
        assertEquals(3, Suchautomat.stateSearch("123ANANAS"));
        assertEquals(3, Suchautomat.stateSearch("123ANANAS123"));
        assertEquals(-1, Suchautomat.stateSearch("BANANA"));
        assertEquals(-1, Suchautomat.stateSearch("BANANA123"));
        assertEquals(-1, Suchautomat.stateSearch("123BANANA"));
        assertEquals(-1, Suchautomat.stateSearch("123BANANA123"));
    }

}