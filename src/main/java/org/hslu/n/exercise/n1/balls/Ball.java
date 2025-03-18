package org.hslu.n.exercise.n1.balls;

/**
 * Description of class Ball
 */
public final class Ball implements Runnable {

    private final Circle circle;

    /**
     * Erzeugt einen Ball mit gegebenen Parametern Grösse, Position und Farbe.
     *
     * @param size  Grösse des Balls.
     * @param xPos  X-Position des Balls.
     * @param yPos  Y-Position des Balls.
     * @param color Farbe des Balls.
     */
    public Ball(final int size, final int xPos, final int yPos, String color) {
        circle = new Circle(size, xPos, yPos, color);
        circle.makeVisible();
    }

    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            circle.moveVertical(1);
        }
    }

    public Circle getCircle() {
        return circle;
    }
}
