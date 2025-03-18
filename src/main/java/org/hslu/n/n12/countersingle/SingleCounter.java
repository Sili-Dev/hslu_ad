package org.hslu.n.n12.countersingle;

/**
 * Ein globaler Zähler, der eineindeutige Werte liefert.
 */
public final class SingleCounter {

    private static int globalCount = 0;

    /**
     * Privater Konstruktor.
     */
    private SingleCounter() {
    }

    /**
     * Erhöht den aktuellen globalen Zählerwert um Eins und gibt diesen zurück.
     *
     * @return Zählerwert.
     */
    public static synchronized int increment() {
        globalCount++;
        return globalCount;
    }
}
