package org.hslu.n.n12.countersingle;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.HashSet;
import java.util.Set;

/**
 * Ein Task für einen globalen Zähler.
 */
public final class SingleCounterTask implements Runnable {

    private static final Logger LOG = LoggerFactory.getLogger(SingleCounterTask.class);
    private static final Set<Integer> set = new HashSet<>();

    /**
     * Erzeugt einen Task für einen globalen Zähler .
     */
    public SingleCounterTask() {
    }

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            int value = SingleCounter.increment();
            if (SingleCounterTask.set.add(value)) {
                LOG.info("{}{}", Thread.currentThread().getName(), value);
            } else {
                LOG.info("{}{} exists!!!", Thread.currentThread().getName(), value);
            }
        }
    }
}
