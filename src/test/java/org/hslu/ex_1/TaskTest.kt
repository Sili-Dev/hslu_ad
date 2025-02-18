package org.hslu.ex_1

import org.junit.jupiter.api.Test
import kotlin.system.measureTimeMillis

class TaskTest {

    @Test
    fun testTask() {
        val n = 40
        val time = measureTimeMillis {
            val task = Task()
            task.task(n)
        }
        println("Time (n=$n): $time ms")
    }
}