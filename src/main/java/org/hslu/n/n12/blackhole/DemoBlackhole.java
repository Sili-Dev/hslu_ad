package org.hslu.n.n12.blackhole;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Der Versuch einer Demonstration eines schwarzen Loches
 */
public final class DemoBlackhole {

    private static final Logger LOG = LoggerFactory.getLogger(DemoBlackhole.class);

    /**
     * Privater Konstruktor.
     */
    private DemoBlackhole() {
    }

    /**
     * Main-Demo.
     *
     * @param args not used.
     */
    public static void main(String[] args) {
        final BlackHole blackhole = new BlackHole();
        LOG.info("Threads starts...");
        new Thread(() -> {
            try {
                LOG.info(blackhole.get());
            } catch (InterruptedException ex) {
                LOG.debug(ex.getMessage());
            }
        }, "Blackhole 'getter' thread").start();
        new Thread(() -> {
            blackhole.put("Sonne, Licht, irgendetwas...");
        }, "Blackhole 'putter' thread").start();
    }
}
