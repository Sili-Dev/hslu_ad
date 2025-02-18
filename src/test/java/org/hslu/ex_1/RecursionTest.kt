package org.hslu.ex_1

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test
import kotlin.system.measureTimeMillis

class RecursionTest {
    @Test
    fun fiboRec1() {
        val recursion = Recursion()
        val time = measureTimeMillis {
            assertEquals(0, recursion.fiboRec1(0))
            assertEquals(1, recursion.fiboRec1(1))
            assertEquals(1, recursion.fiboRec1(2))
            assertEquals(2, recursion.fiboRec1(3))
            assertEquals(3, recursion.fiboRec1(4))
            assertEquals(5, recursion.fiboRec1(5))
            assertEquals(8, recursion.fiboRec1(6))
            assertEquals(13, recursion.fiboRec1(7))
            assertEquals(21, recursion.fiboRec1(8))
            assertEquals(34, recursion.fiboRec1(9))
            assertEquals(55, recursion.fiboRec1(10))
            assertEquals(89, recursion.fiboRec1(11))
            assertEquals(610, recursion.fiboRec1(15))
            assertEquals(6765, recursion.fiboRec1(20))
            assertEquals(1134903170, recursion.fiboRec1(45))
        }
        println("Time fiboRec1: $time ms")
    }

    @Test
    fun fiboRec2() {
        val recursion = Recursion()
        val time = measureTimeMillis {
            assertEquals(0, recursion.fiboRec2(0))
            assertEquals(1, recursion.fiboRec2(1))
            assertEquals(1, recursion.fiboRec2(2))
            assertEquals(2, recursion.fiboRec2(3))
            assertEquals(3, recursion.fiboRec2(4))
            assertEquals(5, recursion.fiboRec2(5))
            assertEquals(8, recursion.fiboRec2(6))
            assertEquals(13, recursion.fiboRec2(7))
            assertEquals(21, recursion.fiboRec2(8))
            assertEquals(34, recursion.fiboRec2(9))
            assertEquals(55, recursion.fiboRec2(10))
            assertEquals(89, recursion.fiboRec2(11))
            assertEquals(610, recursion.fiboRec2(15))
            assertEquals(6765, recursion.fiboRec2(20))
            assertEquals(1134903170, recursion.fiboRec1(45))
        }
        println("Time fiboRec2: $time ms")
    }

    @Test
    fun fiboIter() {
        val recursion = Recursion()
        val time = measureTimeMillis {
            assertEquals(0, recursion.fiboIter(0))
            assertEquals(1, recursion.fiboIter(1))
            assertEquals(1, recursion.fiboIter(2))
            assertEquals(2, recursion.fiboIter(3))
            assertEquals(3, recursion.fiboIter(4))
            assertEquals(5, recursion.fiboIter(5))
            assertEquals(8, recursion.fiboIter(6))
            assertEquals(13, recursion.fiboIter(7))
            assertEquals(21, recursion.fiboIter(8))
            assertEquals(34, recursion.fiboIter(9))
            assertEquals(55, recursion.fiboIter(10))
            assertEquals(89, recursion.fiboIter(11))
            assertEquals(610, recursion.fiboIter(15))
            assertEquals(6765, recursion.fiboIter(20))
            assertEquals(1134903170, recursion.fiboIter(45))
        }
        println("Time fiboIter: $time ms")
    }
}