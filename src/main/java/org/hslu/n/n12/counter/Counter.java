package org.hslu.n.n12.counter;

/**
 * Ein Zähler, der eineindeutige Werte liefert.
 */
public final class Counter {

    private int count;

    /**
     * Erzeugt einen Zähler.
     */
    public Counter() {
        this.count = 0;
    }

    /**
     * Erhöht den aktuellen Zählerwert um Eins und gibt diesen zurück.
     *
     * @return Zählerwert.
     */
    public synchronized int increment() {
        count++;
        return count;
    }
}
