package org.hslu.n.n11.mytask;

/**
 * Zeichen-Ausgabe auf gemeinsame Ressource Console.
 */
public final class ThreadAlive {

    /**
     * Privater Konstruktor.
     */
    private ThreadAlive() {
    }

    /**
     * Main-Demo.
     *
     * @param args not used.
     * @throws InterruptedException wenn das Warten unterbrochen wird.
     */
    public static void main(final String[] args) throws InterruptedException {
        final MyTask myTask = new MyTask();
        final Thread thread = new Thread(myTask, "MyTask-Thread");
        thread.start();
        while (thread.isAlive()) {
            Thread.sleep(10);
        }
        for (int i = 0; i < 1000; i++) {
            System.out.print("x");
        }
    }
}
