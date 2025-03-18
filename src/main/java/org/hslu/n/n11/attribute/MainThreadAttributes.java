package org.hslu.n.n11.attribute;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Anzeige der Attribute des Main-Threads.
 */
public final class MainThreadAttributes {

    private static final Logger LOG = LoggerFactory.getLogger(MainThreadAttributes.class);

    /**
     * Privater Konstruktor.
     */
    private MainThreadAttributes() {
    }

    /**
     * Main-Demo.
     *
     * @param args not used.
     */
    public static void main(final String[] args) {
        // Anzahl der Prozessoren abfragen
        final int nr = Runtime.getRuntime().availableProcessors();
        LOG.info("Available processors " + nr);
        // Eigenschaften des main-Threads
        final Thread self = Thread.currentThread();
        LOG.info("Name     : " + self.getName());
        LOG.info("Priority : " + self.getPriority());
        LOG.info("ID       : " + self.threadId());
        LOG.info("Deamon?  : " + self.isDaemon());
    }
}
