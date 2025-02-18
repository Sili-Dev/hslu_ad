package org.hslu.ex_1

import org.slf4j.LoggerFactory

class Task {

    private val LOG = LoggerFactory.getLogger(Task::class.java)
    var counter = 0

    fun task(n: Int) {
        for (i in 1..n) {
            for (j in 1..n) {
                task1()
                task2()
                task3()
            }
        }
        LOG.info("Tasks executed $counter")
    }

    fun task1() {counter++}
    fun task2() {counter++}
    fun task3() {counter++}
}