package org.hslu.ex_2

import kotlin.jvm.Throws

class Stack<T>(maxSize: Int) : StackInterface<T> {
    private val stack = Array<Any?>(maxSize) { null }
    private var top = -1

    @Throws(StackOverflowError::class)
    override fun push(value: T) {
        if (top >= stack.size - 1) {
            throw StackOverflowError()
        }
        stack[++top] = value
    }

    override fun pop(): T? {
        if (top < 0) {
            return null
        }
        return stack[top--]!! as T
    }

    override fun peek(): T? {
        return stack[top] as T?
    }

    override fun size(): Int {
        return top + 1
    }

    fun showStackState() {
        for (i in 0..top) {
            println(stack[i])
        }
        println("--------")
    }
}