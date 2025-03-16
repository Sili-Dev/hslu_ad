package org.hslu.ex_4;

import org.hslu.ex_2.Stack;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TimeTest {

    @BeforeEach
    void warmUp() {
        for (int i = 0; i < 10000; i++) {
            TestDataGenerator.generateDummy(100000);
        }
    }

    @Test
    void testMyStack() {
        var items = TestDataGenerator.generateDummy(100000);
        var stack = new Stack<Dummy>(100000);
        var startTime = System.nanoTime();
        for (var item : items) {
            stack.push(item);
        }
        long elapsedNanos = System.nanoTime() - startTime;
        System.out.println("My Stack Elapsed time: " + elapsedNanos + " ns");
        assertEquals(100000, stack.size());
    }

    @Test
    void testJavaStack() {
        var items = TestDataGenerator.generateDummy(100000);
        var javaStack = new java.util.Stack<Dummy>();
        var startTime = System.nanoTime();
        for (var item : items) {
            javaStack.push(item);
        }
        long elapsedNanos = System.nanoTime() - startTime;
        System.out.println("Java Stack Elapsed time: " + elapsedNanos + " ns");
        assertEquals(100000, javaStack.size());
    }

    @Test
    void testDeque() {
        var items = TestDataGenerator.generateDummy(100000);
        var deque = new java.util.ArrayDeque<Dummy>();
        var startTime = System.nanoTime();
        deque.addAll(items);
        long elapsedNanos = System.nanoTime() - startTime;
        System.out.println("Deque Elapsed time: " + elapsedNanos + " ns");
        assertEquals(100000, deque.size());
    }

    @Test
    void testHashSet() {
        var items = TestDataGenerator.generateDummy(100000);
        var hashSet = new HashSet<Dummy>(200000);
        var startTime = System.nanoTime();
        for (var item : items) {
            hashSet.add(item);
        }
        long elapsedNanos = System.nanoTime() - startTime;
        System.out.println("HashSet Elapsed time: " + elapsedNanos + " ns");
        assertEquals(100000, hashSet.getSize());
    }
}
