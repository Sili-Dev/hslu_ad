package org.hslu.ex_4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HashSetTest {

    @Test
    void testAdd() {
        HashSet<Integer> hashSet = new HashSet<>(10);
        hashSet.add(1);
        hashSet.add(2);
        hashSet.add(3);
        hashSet.add(4);
        hashSet.add(5);
        hashSet.add(6);
        hashSet.add(7);
        hashSet.add(8);
        hashSet.add(9);
        hashSet.add(10);
        hashSet.add(11);
        hashSet.add(12);
        hashSet.add(13);

        assertEquals("null 1 2 3 4 5 6 7 8 9 10 11 12 13 null null null null null null ", hashSet.toString());
    }

    @Test
    void testRemove() {
        HashSet<Integer> hashSet = new HashSet<>(10);
        hashSet.add(1);
        hashSet.add(2);
        hashSet.add(3);
        hashSet.add(4);
        hashSet.add(5);
        hashSet.add(6);
        hashSet.add(7);
        hashSet.add(8);
        hashSet.add(9);
        hashSet.add(10);
        hashSet.add(11);
        hashSet.add(12);
        hashSet.add(13);
        hashSet.remove(5);
        hashSet.remove(6);
        hashSet.remove(7);
        hashSet.remove(8);
        hashSet.remove(9);
        hashSet.remove(12);
        hashSet.remove(13);

        assertEquals("null 1 2 3 4 null null null null null 10 11 null null null null null null null null ", hashSet.toString());
    }

}