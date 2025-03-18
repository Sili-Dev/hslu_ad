package org.hslu.n.n11.stoppable.interrupt;

/**
 * Demostration des Interrupts einer nebenläufigen Aufgabe.
 */
public final class DemoStoppableTask {

    /**
     * Privater Konstruktor.
     */
    private DemoStoppableTask() {
    }

    /**
     * Main-Demo.
     *
     * @param args not used.
     * @throws InterruptedException wenn Warten unterbrochen wird.
     */
    public static void main(String[] args) throws InterruptedException {
        final StoppableTask taskWithInterrupt = new StoppableTask();
        final Thread thread = new Thread(taskWithInterrupt, "taskWithInterrupt");
        thread.start();
        Thread.sleep(200);
        thread.interrupt();
    }
}
