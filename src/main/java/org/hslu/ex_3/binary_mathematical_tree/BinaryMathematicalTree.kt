package org.hslu.ex_3.binary_mathematical_tree

class BinaryMathematicalTree<T : Number>(private val rootNode: OperationNode<T>) : IBinaryMathematicalTree {
    override fun evaluate(): Double {
        return evaluateNode(rootNode)
    }

    override fun compile(): List<String> {
        return compileNode(rootNode)
    }

    override fun toString(): String {
        return traverseInOrder(rootNode)
    }

    private fun traverseInOrder(node: OperationNode<T>): String {
        return "(" + when {
            node.leftNumber != null -> node.leftNumber!!.value.toString()
            node.leftOperator != null -> traverseInOrder(node.leftOperator!!)
            else -> throw IllegalArgumentException("Invalid node")
        } + node.value.operator + when {
            node.rightNumber != null -> node.rightNumber!!.value.toString()
            node.rightOperator != null -> traverseInOrder(node.rightOperator!!)
            else -> throw IllegalArgumentException("Invalid node")
        } + ")"
    }

    private fun evaluateNode(node: OperationNode<T>): Double {
        val leftNumber = if (node.leftNumber != null) node.leftNumber!!.value else evaluateNode(node.leftOperator!!)
        val rightNumber = if (node.rightNumber != null) node.rightNumber!!.value else evaluateNode(node.rightOperator!!)
        return when (node.value) {
            Operation.ADDITION -> leftNumber.toDouble() + rightNumber.toDouble()
            Operation.SUBTRACTION -> leftNumber.toDouble() - rightNumber.toDouble()
            Operation.MULTIPLICATION -> leftNumber.toDouble() * rightNumber.toDouble()
            Operation.DIVISION -> leftNumber.toDouble() / rightNumber.toDouble()
        }
    }

    private fun compileNode(node: OperationNode<T>): List<String> {
        val left = if (node.leftNumber != null) mutableListOf("LOAD ${node.leftNumber!!.value}") else ArrayList(
            compileNode(node.leftOperator!!)
        )
        val right =
            if (node.rightNumber != null) listOf("LOAD ${node.rightNumber!!.value}") else compileNode(node.rightOperator!!)
        left.addAll(right)
        left.add(node.value.compiler)
        return left
    }
}