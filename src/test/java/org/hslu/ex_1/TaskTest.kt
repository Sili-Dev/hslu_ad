package org.hslu.ex_1

import org.junit.jupiter.api.Test
import kotlin.system.measureTimeMillis

class TaskTest {

    @Test
    fun testTask() {
        val time = measureTimeMillis {
            val task = Task()
            task.task(99999)
        }
        println("Time: $time ms")
    }
}