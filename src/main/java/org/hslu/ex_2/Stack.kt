package org.hslu.ex_2

import kotlin.jvm.Throws

class Stack(maxSize: Int) : StackInterface {
    private val stack = Array<String?>(maxSize) { null }
    private var top = -1

    @Throws(StackOverflowError::class)
    override fun push(value: String) {
        if (top >= stack.size - 1) {
            throw StackOverflowError()
        }
        stack[++top] = value
    }

    override fun pop(): String? {
        if (top < 0) {
            return null
        }
        return stack[top--]!!
    }

    override fun peek(): String? {
        return stack[top]
    }

    override fun size(): Int {
        return top + 1
    }

}