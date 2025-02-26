package org.hslu.ex_2

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class QueueTest {

    @Test
    fun testEnqueueDequeue() {
        val queue = Queue(5)
        queue.enqueue('a')
        assertEquals('a', queue.dequeue())
        queue.enqueue('b')
        queue.enqueue('c')
        queue.enqueue('d')
        queue.enqueue('e')
        assertEquals('b', queue.dequeue())
        assertEquals('c', queue.dequeue())
        assertEquals('d', queue.dequeue())
        assertEquals('e', queue.dequeue())
    }

    @Test
    fun testDequeueEmptyQueue() {
        val queue = Queue(5)
        assertNull(queue.dequeue())
    }

    @Test
    fun testDequeueFullQueue() {
        val queue = Queue(5)
        queue.enqueue('a')
        queue.enqueue('b')
        queue.enqueue('c')
        queue.enqueue('d')
        queue.enqueue('e')
        assertEquals('a', queue.dequeue())
        assertEquals('b', queue.dequeue())
        assertEquals('c', queue.dequeue())
        assertEquals('d', queue.dequeue())
        assertEquals('e', queue.dequeue())
        assertNull(queue.dequeue())
    }

    @Test
    fun testEnqueueFullQueue() {
        val queue = Queue(5)
        queue.enqueue('a')
        queue.enqueue('b')
        queue.enqueue('c')
        queue.enqueue('d')
        queue.enqueue('e')
        assertThrows(IndexOutOfBoundsException::class.java) {
            queue.enqueue('f')
        }
    }

    @Test
    fun testRotation() {
        val queue = Queue(2)
        queue.enqueue('a')
        queue.enqueue('b')
        assertEquals('a', queue.dequeue())
        queue.enqueue('c')
        assertThrows(IndexOutOfBoundsException::class.java) {
            queue.enqueue('d')
        }
        assertEquals('b', queue.dequeue())
    }

    @Test
    fun testToString() {
        val queue = Queue(5)
        queue.enqueue('a')
        queue.enqueue('b')
        queue.enqueue('c')
        queue.dequeue()
        queue.enqueue('d')
        queue.enqueue('e')
        assertEquals("b c d e ", queue.toString())
    }
}