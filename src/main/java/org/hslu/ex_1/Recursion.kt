package org.hslu.ex_1

class Recursion {
    fun fiboRec1(n: Int): Int {
        return if (n <= 1) n else fiboRec1(n - 1) + fiboRec1(n - 2)
    }

    private val res = mutableMapOf<Int, Int>()
    fun fiboRec2(n: Int): Int {
        if (n <= 1) {
            return n
        }
        if (res.containsKey(n)) {
            return res[n]!!
        }
        val result = (res[n - 1] ?: fiboRec2(n - 1)) + (res[n - 2] ?: fiboRec2(n - 2))
        res[n] = result
        return result
    }

    fun fiboIter(n: Int): Int {
        if (n <= 1) {
            return n
        }
        var a = 0
        var b = 1
        var c: Int
        for (i in 2..n) {
            c = a + b
            a = b
            b = c
        }
        return b
    }
}