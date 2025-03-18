package org.hslu.n.n12.counter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.HashSet;
import java.util.Set;

/**
 * Ein Task für den Zähler.
 */
public final class CounterTask implements Runnable {

    private static final Logger LOG = LoggerFactory.getLogger(CounterTask.class);
    private final Counter counter;
    private static final Set<Integer> set = new HashSet<>();

    /**
     * Erzeugt einen Counter Task für Counter Demo.
     *
     * @param counter Counter.
     */
    public CounterTask(final Counter counter) {
        this.counter = counter;
    }

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            int value = counter.increment();
            if (CounterTask.set.add(value)) {
                LOG.info("{}{}", Thread.currentThread().getName(), value);
            } else {
                LOG.info("{}{} exists!!!", Thread.currentThread().getName(), value);
            }
        }
    }
}
