package org.hslu.ex_2

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class ListTest {
    @Test
    fun testAdd() {
        val list = List<Int>()
        list.add(1)
        assertEquals(1, list.size())
        list.add(2)
        assertEquals(2, list.size())
    }

    @Test
    fun testSize() {
        val list = List<Int>()
        assertEquals(0, list.size())
        list.add(1)
        assertEquals(1, list.size())
        list.add(2)
        assertEquals(2, list.size())
    }

    @Test
    fun testContains() {
        val list = List<Int>()
        list.add(1)
        list.add(10)
        list.add(2)

        assertTrue(list.contains(10))
        assertFalse(list.contains(12))
    }

    @Test
    fun testPop() {
        val list = List<Int>()
        list.add(1)
        list.add(10)
        list.add(2)

        assertEquals(2, list.pop())
        assertEquals(10, list.pop())
        assertEquals(1, list.pop())
        assertNull(list.pop())
    }

    @Test
    fun testRemove() {
        val list = List<Int>()
        list.add(1)
        list.add(10)
        list.add(2)

        assertEquals(10, list.remove(10))
        assertEquals(2, list.remove(2))
        assertEquals(1, list.remove(1))
        assertNull(list.remove(1))
        assertEquals(0, list.size())
    }

    @Test
    fun testRemoveHead() {
        val list = List<Int>()
        list.add(1)
        list.add(10)
        list.add(2)

        assertEquals(1, list.remove(1))
        assertEquals(2, list.remove(2))
        assertEquals(10, list.remove(10))
        assertNull(list.remove(1))
        assertEquals(0, list.size())
    }

    @Test
    fun testRemoveMiddle() {
        val list = List<Int>()
        list.add(1)
        list.add(10)
        list.add(2)

        assertEquals(10, list.remove(10))
        assertEquals(1, list.remove(1))
        assertEquals(2, list.remove(2))
        assertNull(list.remove(1))
        assertEquals(0, list.size())
    }

    @Test
    fun testRemoveTail() {
        val list = List<Int>()
        list.add(1)
        list.add(10)
        list.add(2)

        assertEquals(2, list.remove(2))
        assertEquals(1, list.remove(1))
        assertEquals(10, list.remove(10))
        assertNull(list.remove(1))
        assertEquals(0, list.size())
    }

    @Test
    fun testRemoveNotExisting() {
        val list = List<Int>()
        list.add(1)
        list.add(10)
        list.add(2)

        assertNull(list.remove(3))
        assertEquals(3, list.size())
    }

    @Test
    fun testRemoveEmpty() {
        val list = List<Int>()

        assertNull(list.remove(3))
        assertEquals(0, list.size())
    }
}