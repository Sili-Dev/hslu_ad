package org.hslu.ex_2

class Stackmachine {
    private val stack = Stack<Int>(10)

    fun load(value: Int) {
        stack.push(value)
    }

    fun add() {
        val a = stack.pop() ?: throw IllegalStateException("Stack is empty")
        val b = stack.pop() ?: throw IllegalStateException("Stack is empty")
        stack.push(a + b)
    }

    fun sub() {
        val b = stack.pop() ?: throw IllegalStateException("Stack is empty")
        val a = stack.pop() ?: throw IllegalStateException("Stack is empty")
        stack.push(a - b)
    }

    fun mul() {
        val a = stack.pop() ?: throw IllegalStateException("Stack is empty")
        val b = stack.pop() ?: throw IllegalStateException("Stack is empty")
        stack.push(a * b)
    }

    fun div() {
        val b = stack.pop() ?: throw IllegalStateException("Stack is empty")
        val a = stack.pop() ?: throw IllegalStateException("Stack is empty")
        stack.push(a / b)
    }

    fun print(): Int {
        val value = stack.peek() ?: throw IllegalStateException("Stack is empty")
        println(value)
        return value
    }

    fun showStackState() {
        stack.showStackState()
    }
}