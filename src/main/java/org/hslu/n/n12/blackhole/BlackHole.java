package org.hslu.n.n12.blackhole;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingDeque;

/**
 * Schwarzes Loch zur Demonstration eines typischen Deadlock.
 */
public final class BlackHole {

    private final BlockingQueue<String> queue;

    /**
     * Erzeugt ein Schwarzes Loch mit einer Blocking-Double-Endet-Queue.
     */
    public BlackHole() {
        queue = new LinkedBlockingDeque<>();
    }

    /**
     * Wirft etwas ins Schawrze Loch hinein.
     *
     * @param thing kann alles sein, solange es ein String ist
     */
    public void put(final String thing) {
        synchronized (queue) {
            queue.add(thing);
        }
    }

    /**
     * Holt etwas aus dem Schawrzen Loch.
     *
     * @return irgend etwas, solange es ein String ist
     * @throws InterruptedException Interrupted.
     */
    public String get() throws InterruptedException {
        synchronized (queue) {
            return queue.take();
        }
    }
}
