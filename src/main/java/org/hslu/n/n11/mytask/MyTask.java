package org.hslu.n.n11.mytask;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Zeichen-Ausgabe auf gemeinsame Ressource Console.
 */
public final class MyTask implements Runnable {

    private static final Logger LOG = LoggerFactory.getLogger(MyTask.class);

    /**
     * Erzeugt einen Task.
     */
    public MyTask() {
    }

    @Override
    public final void run() {
        // ...Anweisungen - nebenläufig ausführen
        for (int i = 0; i < 1000; i++) {
            System.out.print("y");
        }
        Thread self = Thread.currentThread();
        LOG.info(" finished {}", self.getName());
    }

    /**
     * Main-Demo.
     *
     * @param args not used.
     */
    public static void main(final String[] args) {
        final MyTask myTask = new MyTask();
        final Thread thread = new Thread(myTask, "MyTask-Thread");
        thread.start();
        for (int i = 0; i < 1000; i++) {
            System.out.print("x");
        }
        final Thread self = Thread.currentThread();
        LOG.info(" finished {}", self.getName());
    }
}
