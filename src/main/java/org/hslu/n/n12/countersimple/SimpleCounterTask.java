package org.hslu.n.n12.countersimple;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.HashSet;
import java.util.Set;

/**
 * Ein Task für einen einfachen Zähler.
 */
public class SimpleCounterTask implements Runnable {

    private static final Logger LOG = LoggerFactory.getLogger(SimpleCounterTask.class);
    private final SimpleCounter counter;
    private static final Set<Integer> set = new HashSet<>();

    /**
     * Erzeugt einen SimpleCounter Task für die SimpleCounter Demo.
     *
     * @param counter SimpleCounter.
     */
    public SimpleCounterTask(final SimpleCounter counter) {
        this.counter = counter;
    }

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            int value = counter.increment();
            if (SimpleCounterTask.set.add(value)) {
                LOG.info("{}{}", Thread.currentThread().getName(), value);
            } else {
                LOG.info("{}{} exists!!!", Thread.currentThread().getName(), value);
            }
        }
    }
}
