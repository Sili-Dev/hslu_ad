package org.hslu.ex_1

class Ack {

    var counter = 0

    fun ackermann(m: Int, n: Int): Int {
        counter++
        if (m == 0) {
            return n + 1
        } else if (n == 0) {
            return ackermann(m - 1, 1)
        } else {
            return ackermann(m - 1, ackermann(m, n - 1))
        }
    }

}