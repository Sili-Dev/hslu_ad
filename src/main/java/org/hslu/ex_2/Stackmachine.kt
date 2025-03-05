package org.hslu.ex_2

import kotlin.collections.List

class Stackmachine {
    private val stack = Stack<Int>(10)

    fun execute(program: List<String>) {
        for (instruction in program) {
            val parts = instruction.split(" ")
            when (parts[0]) {
                "LOAD" -> load(parts[1].toInt())
                "ADD" -> add()
                "SUB" -> sub()
                "MUL" -> mul()
                "DIV" -> div()
                "PRINT" -> print()
                "SHOW" -> showStackState()
                else -> throw IllegalArgumentException("Unknown instruction: $instruction")
            }
        }
    }

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