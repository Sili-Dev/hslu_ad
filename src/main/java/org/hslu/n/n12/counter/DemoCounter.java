package org.hslu.n.n12.counter;

/**
 * Eine Demo für einen Zähler mit mehreren Threads.
 */
public final class DemoCounter {

    /**
     * Privater Konstruktor.
     */
    private DemoCounter() {
    }

    /**
     * Main-Demo.
     *
     * @param args not used.
     */
    public static void main(final String[] args) {
        final int nThreads = 3;
        final Counter counter = new Counter();
        for (int i = 1; i <= nThreads; i++) {
            final CounterTask task = new CounterTask(counter);
            final Thread thread = new Thread(task, "T" + i + " : ");
            thread.start();
        }
    }
}
