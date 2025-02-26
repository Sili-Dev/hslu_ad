package org.hslu.ex_2

class Queue(maxSize: Int) : QueueInterface {
    private val ringBuffer = Array<Char?>(maxSize) { null }
    private var firstElementIndex: Int = 0
    private var lastElementIndex: Int = 0

    override fun enqueue(value: Char) {
        if (lastElementIndex - firstElementIndex >= ringBuffer.size) throw IndexOutOfBoundsException()
        ringBuffer[lastElementIndex % ringBuffer.size] = value
        lastElementIndex++
    }

    override fun dequeue(): Char? {
        if (firstElementIndex == lastElementIndex) return null
        val value = ringBuffer[firstElementIndex % ringBuffer.size]
        firstElementIndex++
        return value
    }

    override fun toString(): String {
        val sb = StringBuilder()
        for (i in firstElementIndex until lastElementIndex) {
            sb.append("${ringBuffer[i % ringBuffer.size]} ")
        }
        return sb.toString()
    }
}