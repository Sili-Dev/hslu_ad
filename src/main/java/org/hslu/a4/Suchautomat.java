package org.hslu.a4;

import java.util.Map;

public class Suchautomat {
    /**
     * Suchautomat
     * @param a Zeichenkette, die nach dem Pattern ANANAS durchsucht werden soll
     * @return
     */
    public static int stateSearch(final String a) {
        int i = 0;
        String state = "";

        Map<Map<String, Character>, String> stateMap = Map.of(
                Map.of("", 'A'), "A",
                Map.of("A", 'N'), "AN",
                Map.of("AN", 'A'), "ANA",
                Map.of("ANA", 'N'), "ANAN",
                Map.of("ANAN", 'A'), "ANANA",
                Map.of("ANANA", 'S'), "ANANAS"
        );

        do {
            char c = a.charAt(i);
            state = stateMap.getOrDefault(Map.of(state, c), "A");
            i++;
        } while (i < a.length() && !state.equals("ANANAS"));

        if (state.equals("ANANAS")) {
            return i - "ANANAS".length(); // Index of the first character of the pattern
        }
        return -1; // Pattern not found
    }
}
