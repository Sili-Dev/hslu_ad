package org.hslu.n.n11.stoppable.interrupt;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.math.BigInteger;

/**
 * Nebenläufige Aufgabe, die unterbrochen werden kann.
 */
public final class StoppableTask implements Runnable {

    private static final Logger LOG = LoggerFactory.getLogger(StoppableTask.class);
    private volatile Thread runThread;

    /**
     * Erzeugt einen Task, der per Interrupt gestoppt werden kann.
     */
    public StoppableTask() {
    }

    @Override
    public void run() {
        runThread = Thread.currentThread();
        final int max = 10000;
        int n = 0;
        while (n < max && !Thread.currentThread().isInterrupted()) {
            BigInteger bigInteger = new BigInteger(Integer.toString(n));
            if (bigInteger.isProbablePrime(Integer.MAX_VALUE)) {
                System.out.print(".");
            }
            n++;
        }
        System.out.println();
        if (max == n) {
            LOG.info("finished: " + runThread.getName());
        } else {
            LOG.info("stopped: " + runThread.getName());
        }
    }
}
