package org.hslu.ex_3

import org.hslu.ex_2.Stackmachine
import org.hslu.ex_3.binary_mathematical_tree.BinaryMathematicalTree
import org.hslu.ex_3.binary_mathematical_tree.NumericNode
import org.hslu.ex_3.binary_mathematical_tree.Operation
import org.hslu.ex_3.binary_mathematical_tree.OperationNode
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class BinaryMathematicalTreeTest {
    @Test
    fun testEvaluate() {
        val tree = OperationNode(
            Operation.ADDITION,
            OperationNode(Operation.MULTIPLICATION, NumericNode(2), NumericNode(3)),
            OperationNode(Operation.SUBTRACTION, NumericNode(5), NumericNode(1))
        )
        val binaryMathematicalTree = BinaryMathematicalTree(tree)
        assertEquals(10.0, binaryMathematicalTree.evaluate())
        assertEquals(
            listOf("LOAD 2", "LOAD 3", "MUL", "LOAD 5", "LOAD 1", "SUB", "ADD"),
            binaryMathematicalTree.compile()
        )

        val tree2 = OperationNode(
            Operation.MULTIPLICATION,
            OperationNode(Operation.ADDITION, NumericNode(2), NumericNode(3)),
            NumericNode(4)
        )
        val binaryMathematicalTree2 = BinaryMathematicalTree(tree2)
        assertEquals(20.0, binaryMathematicalTree2.evaluate())
        assertEquals(listOf("LOAD 2", "LOAD 3", "ADD", "LOAD 4", "MUL"), binaryMathematicalTree2.compile())

        val tree3 = OperationNode(
            Operation.DIVISION,
            OperationNode(Operation.ADDITION, NumericNode(2), NumericNode(3)),
            NumericNode(4)
        )
        val binaryMathematicalTree3 = BinaryMathematicalTree(tree3)
        assertEquals(1.25, binaryMathematicalTree3.evaluate())
        assertEquals(listOf("LOAD 2", "LOAD 3", "ADD", "LOAD 4", "DIV"), binaryMathematicalTree3.compile())
    }

    @Test
    fun testFromExercise() {
        val tree = OperationNode(
            Operation.MULTIPLICATION,
            OperationNode(Operation.ADDITION, NumericNode(2), NumericNode(3)),
            NumericNode(4)
        )
        val binaryMathematicalTree = BinaryMathematicalTree(tree)
        assertEquals(20.0, binaryMathematicalTree.evaluate())
        assertEquals("((2+3)*4)", binaryMathematicalTree.toString())

        val program = binaryMathematicalTree.compile()
        assertEquals(listOf("LOAD 2", "LOAD 3", "ADD", "LOAD 4", "MUL"), program)

        val stackmachine = Stackmachine()
        stackmachine.execute(program)
        assertEquals(20, stackmachine.print())
    }
}