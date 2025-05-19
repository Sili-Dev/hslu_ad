package org.hslu.a4;

public class KMPAlgorithm {
    public static int[] randTabelle(String pattern) {
        int[] tabelle = new int[pattern.length() + 1];
        tabelle[0] = 0; // eigentlich uninteressant, da wir nie auf tabelle[0] zugreifen
        int j = 0; // j ist der Index im Pattern
        for (int i = 1; i < pattern.length(); i++) {
            // Falls aktuelles Präfix nicht verlängert werden kann,
            // gehe zu einem kürzeren Präfix zurück
            while (j > 0 && pattern.charAt(i) != pattern.charAt(j)) {
                j = tabelle[j];
            }
            // Wenn das aktuelle Zeichen mit dem Zeichen an der Position j übereinstimmt,
            // dann verlängere das Präfix
            if (pattern.charAt(i) == pattern.charAt(j)) {
                j++;
            }
            // Setze den Wert in der Randtabelle für die aktuelle Position i
            tabelle[i + 1] = j;
        }
        return tabelle;
    }

    public static int kmpSearch(String text, String pattern) {
        int[] tabelle = randTabelle(pattern); // Rand-Tabelle erstellen
        int j = 0; // Index im Pattern = Zustand des Automaten
        for (int i=0; i < text.length(); i++) {
            // Fall 2 (kann mehrfach auftreten, daher Schleife)
            while (j > 0 && text.charAt(i) != pattern.charAt(j)) {
                j = tabelle[j]; // Automat gemäss Randtabelle zurücksetzen
            }
            // Fall 1 (Fall 3 ist implizit in der for-Schleife enthalten)
            if (text.charAt(i) == pattern.charAt(j)) {
                j++; // Match, nächstes Zeichen im Pattern
            }
            // Pattern gefunden? Startposition zurückliefern
            if (j == pattern.length()) return i - j + 1;
        }
        return -1; // Pattern nicht gefunden
    }
}
