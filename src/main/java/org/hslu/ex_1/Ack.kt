package org.hslu.ex_1

class Ack {

    var counter = 0

    fun ackermann(m: Int, n: Int): Int {
        counter++
        return if (m == 0) {
            n + 1
        } else if (n == 0) {
            ackermann(m - 1, 1)
        } else {
            ackermann(m - 1, ackermann(m, n - 1))
        }
    }

}