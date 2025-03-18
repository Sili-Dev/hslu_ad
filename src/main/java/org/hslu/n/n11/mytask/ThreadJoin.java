package org.hslu.n.n11.mytask;

/**
 * Zeichen-Ausgabe auf gemeinsame Ressource Console.
 */
public class ThreadJoin {

    /**
     * Privater Konstruktor.
     */
    private ThreadJoin() {
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
        thread.join();
        for (int i = 0; i < 1000; i++) {
            System.out.print("x");
        }
    }
}
