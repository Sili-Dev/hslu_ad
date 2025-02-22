package org.hslu.ex_1

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class AckTest {

    @Test
    fun ackermann() {
        val ack = Ack()
        assertEquals(7, ack.ackermann(2, 2))
        assertEquals(27, ack.counter)
    }
}