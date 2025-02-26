package org.hslu.ex_2

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class StackTest {
    @Test
    fun testPush() {
        val stack = Stack<String>(10)
        assertEquals(0, stack.size())
    }

    @Test
    fun testPop() {
        val stack = Stack<String>(10)
        stack.push("A")
        stack.push("B")
        stack.push("C")
        assertEquals("C", stack.pop())
        assertEquals("B", stack.pop())
        assertEquals("A", stack.pop())
        assertEquals(0, stack.size())
    }

    @Test
    fun testSize() {
        val stack = Stack<String>(10)
        stack.push("A")
        stack.push("B")
        stack.push("C")
        assertEquals(3, stack.size())
    }

    @Test
    fun testPushPop() {
        val stack = Stack<String>(10)
        stack.push("A")
        stack.push("B")
        stack.push("C")
        assertEquals("C", stack.pop())
        stack.push("D")
        assertEquals("D", stack.pop())
        assertEquals("B", stack.pop())
        assertEquals("A", stack.pop())
        assertEquals(0, stack.size())
    }

    @Test
    fun testPushOverflow() {
        val stack = Stack<String>(2)
        stack.push("A")
        stack.push("B")
        org.junit.jupiter.api.assertThrows<StackOverflowError> { stack.push("C") }
        assertEquals(2, stack.size())
    }

    @Test
    fun testPeek() {
        val stack = Stack<String>(10)
        stack.push("A")
        stack.push("B")
        stack.push("C")
        assertEquals("C", stack.peek())
        assertEquals(3, stack.size())
    }

    @Test
    fun testIsEmpty() {
        val stack = Stack<String>(10)
        assertTrue(stack.isEmpty())
        stack.push("A")
        assertFalse(stack.isEmpty())
        stack.pop()
        assertTrue(stack.isEmpty())
    }
}