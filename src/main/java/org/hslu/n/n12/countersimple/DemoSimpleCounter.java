package org.hslu.n.n12.countersimple;

/**
 * Eine Demo für einen einfachen Zähler mit mehreren Threads.
 */
public class DemoSimpleCounter {

    /**
     * Privater Konstruktor.
     */
    private DemoSimpleCounter() {
    }

    /**
     * Main-Demo.
     *
     * @param args not used.
     */
    public static void main(final String[] args) {
        final int nThreads = 3;
        final SimpleCounter counter = new SimpleCounter();
        for (int i = 0; i < nThreads; i++) {
            final SimpleCounterTask task = new SimpleCounterTask(counter);
            final Thread thread = new Thread(task, "T" + i + " : ");
            thread.start();
        }
    }
}
