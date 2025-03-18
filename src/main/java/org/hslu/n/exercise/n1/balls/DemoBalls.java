package org.hslu.n.exercise.n1.balls;

import java.util.concurrent.ThreadLocalRandom;

/**
 * Demonstration von Bällen.
 */
public final class DemoBalls {

    /**
     * Privater Konstruktor.
     */
    private DemoBalls() {
    }

    /**
     * Main-Demo.
     *
     * @param args not used.
     */
    public static void main(final String[] args) {
        final String[] color = {"red", "black", "blue", "yellow", "green", "magenta"};
        for (int i = 0; i < 10000; i++) {
            var randomColorIndex = ThreadLocalRandom.current().nextInt(color.length);
            var randomxPos = ThreadLocalRandom.current().nextInt(600);
            new Thread(new Ball(21, randomxPos, 10, color[randomColorIndex])).start();
        }
    }
}
