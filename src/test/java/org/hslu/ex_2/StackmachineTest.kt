package org.hslu.ex_2

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class StackmachineTest {
    @Test
    fun twoPlusThreeTimesFour() {
        val stackmachine = Stackmachine()
        stackmachine.load(2)
        stackmachine.showStackState()
        stackmachine.load(3)
        stackmachine.showStackState()
        stackmachine.add()
        stackmachine.showStackState()
        stackmachine.load(4)
        stackmachine.showStackState()
        stackmachine.mul()
        stackmachine.showStackState()
        val res = stackmachine.print()
        assertEquals(20, res)
    }

    @Test
    fun fourPlusFiveTimesTwoPlusThree() {
        val stackmachine = Stackmachine()
        stackmachine.load(4)
        stackmachine.load(5)
        stackmachine.add()
        stackmachine.load(2)
        stackmachine.load(3)
        stackmachine.add()
        stackmachine.mul()
        val res = stackmachine.print()
        assertEquals(45, res)
    }

    @Test
    fun fiveTimesSixDividedBySevenMinusFour() {
        val stackmachine = Stackmachine()
        stackmachine.load(5)
        stackmachine.load(6)
        stackmachine.load(7)
        stackmachine.load(4)
        stackmachine.sub()
        stackmachine.div()
        stackmachine.mul()
        val res = stackmachine.print()
        assertEquals(10, res)
    }

    @Test
    fun testExecute() {
        val stackmachine = Stackmachine()
        stackmachine.execute(listOf("LOAD 2", "LOAD 3", "MUL", "LOAD 5", "LOAD 1", "SUB", "ADD"))
        val res = stackmachine.print()
        assertEquals(10, res)
    }
}