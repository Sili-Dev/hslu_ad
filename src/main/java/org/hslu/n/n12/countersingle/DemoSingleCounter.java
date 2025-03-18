package org.hslu.n.n12.countersingle;

/**
 * Eine Demo für einen globalen Zähler mit mehreren Threads.
 */
public class DemoSingleCounter {

    /**
     * Privater Konstruktor.
     */
    private DemoSingleCounter() {
    }

    /**
     * Main-Demo.
     *
     * @param args not used.
     */
    public static void main(final String[] args) {
        final int nThreads = 3;
        for (int i = 0; i < nThreads; i++) {
            final SingleCounterTask task = new SingleCounterTask();
            final Thread thread = new Thread(task, "T" + i + " : ");
            thread.start();
        }
    }
}
