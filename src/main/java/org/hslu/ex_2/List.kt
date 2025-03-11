package org.hslu.ex_2

import java.util.Objects

class List <T> {
    private var head: Node<T>? = null

    fun add(value: T) {
        head = Node(value, head)
    }

    fun pop(): T? {
        val value = head?.value
        head = head?.next
        return value
    }

    fun remove(value: T): T? {
        var current = head
        var previous = head
        if (Objects.equals(head?.value, value)) {
            val headValue = head?.value
            head = head?.next
            return headValue
        }
        while (current != null) {
            if (Objects.equals(value, current.value) && previous != null) {
                val currentValue = current.value
                previous.next = current.next
                return currentValue
            }
            previous = current
            current = current.next
        }
        return null
    }

    fun contains(value: T): Boolean {
        var current = head
        while (current != null) {
            if (Objects.equals(value, current.value)) return true
            current = current.next
        }
        return false
    }

    fun size(): Int {
        var size = 0
        var current = head
        while (current != null) {
            size++
            current = current.next
        }
        return size
    }
}