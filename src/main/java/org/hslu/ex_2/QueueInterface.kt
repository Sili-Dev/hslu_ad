package org.hslu.ex_2

interface QueueInterface {
    fun enqueue(value: Char)
    fun dequeue(): Char?
    override fun toString(): String
}