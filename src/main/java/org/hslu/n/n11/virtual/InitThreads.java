package org.hslu.n.n11.virtual;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Demonstration der Instanziierung von virtuellen und konventionellen Threads.
 */
public final class InitThreads {

    private static final Logger LOGGER = LoggerFactory.getLogger(InitThreads.class);

    /**
     * Privater Konstruktor.
     */
    private InitThreads() {
    }

    private static long initThreads(final Runnable task, final boolean vThreads) {
        long start = System.currentTimeMillis();
        for (int i = 0; i < 50_000; i++) {
            if (vThreads) {
                Thread.startVirtualThread(task);
            } else {
                Thread t = new Thread(task);
                t.start();
            }
        }
        long finish = System.currentTimeMillis();
        return finish - start;
    }

    /**
     * Main-Demo.
     *
     * @param args not used.
     */
    public static void main(final String[] args) {
        Runnable runnable = () -> {
            // do something...
        };
        LOGGER.info("Time virtual threads: {} msec", initThreads(runnable, true));
        LOGGER.info("Time conven. threads: {} msec", initThreads(runnable, false));
    }
}
