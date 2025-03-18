package org.hslu.n.n12.countersimple;

/**
 * Ein einfacher Zähler, der eineindeutige Werte liefert.
 */
public class SimpleCounter {

    private int count;

    /**
     * Erzeugt einen Zähler.
     */
    public SimpleCounter() {
        this.count = 0;
    }

    /**
     * Erhöht den aktuellen Zählerwert um Eins und gibt diesen zurück.
     *
     * @return Zählerwert.
     */
    public int increment() {
        count++;
        Thread.yield();
        return count;
    }
}
