package org.hslu.a4;

public class Quicksearch {
    /**
     * Durchsucht eine Zeichenkette mittels quickSearch.
     *
     * @param a Zeichenkette, die durchsucht wird.
     * @return Index der Fundstelle oder -1, falls Pattern in a nicht gefunden wurde.
     */
    public static int quickSearch(final String a, final String p) {
        final int n = a.length();
        final int m = p.length();
        final int range = 256; // -> ASCII-Range
        final int[] shift = new int[range];
        // Shift-array erzeugen, Grundbelegung
        for (int i = 0; i < range; i++) {
            shift[i] = m + 1;
        }
        // Sjhifts aufgrund von Muster eintragen
        for (int i = 0; i < m; i++) {
            shift[p.charAt(i)] = m - i;
        }

        // Suche
        int i = 0; // Text-Index
        int j = 0; // Pattern-Index
        do {
            if (a.charAt(i + j) == p.charAt(j)) { // Match?
                j++;
            } else {
                if ((i + m) < n) { // falls a.charAt(i1+m) nicht ausserhalb ist…
                    i += shift[a.charAt(i + m)]; // Sprung
                    j = 0;
                } else {
                    break; // sonst Ende
                }
            }
        } while ((j < m) && ((i + m) <= n));
        if (j == m) {
            return i; // Pattern gefunden
        }
        return -1; // nicht gefunden
    }
}
