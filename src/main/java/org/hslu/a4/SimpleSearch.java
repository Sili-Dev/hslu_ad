package org.hslu.a4;

public class SimpleSearch {
    /**
     * Durchsucht eine Zeichenkette mittels «einfacher Suche».
     * @param a Zeichenkette, die durchsucht wird.
     * @param p Pattern, nach dem gesucht wird.
     * @return Index der Fundstelle oder -1, falls p in a nicht gefunden wurde.
     */
    public static int simpleSearch(final String a, final String p) {
        final int maxIndex = a.length() - p.length();
        final int notFound = -1;
        for (int index = 0; index <= maxIndex; index++) {
            boolean success = true;
            for (int j = 0; j < p.length(); j++) {
                if (a.charAt(index + j) != p.charAt(j)) {
                    success = false;
                    break;
                }
            }
            if (success) {
                return index;
            }
        }
        return notFound;
    }
}
