package org.hslu.a4;

import java.util.HashMap;
import java.util.Map;

public class OptimalMismatch {
    public static int optimalMismatch(final String a, final String p) {
        final int n = a.length();
        final int m = p.length();
        final int range = 256; // -> ASCII-Range
        final Map<Integer, Integer> shift = new HashMap<>();
        // Shift-array erzeugen, Grundbelegung
        for (int i = 0; i < range; i++) {
            shift.put(i, i);
        }
        // Shifts aufgrund von Muster eintragen
        for (int i = 0; i < m; i++) {
            shift.put((int) p.charAt(i), m - i);
        }

        // Suche
        int i = 0; // Text-Index
        int j = 0; // Pattern-Index
        do {
            if (a.charAt(i + j) == p.charAt(j)) { // Match?
                j++;
            } else {
                if ((i + m) < n) { // falls a.charAt(i1+m) nicht ausserhalb ist…
                    i += shift.get((int) a.charAt(i + m)); // Sprung

                   // reorganise shift array
                    for (int k = 0; k < j; k++) {
                        shift.put(k + 1, shift.get(k));
                    }
                    shift.put(0, (int) p.charAt(j));

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
