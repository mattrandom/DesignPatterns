package adapter.exercise.second.square;

/**
 * SquarePegs are not compatible with RoundHoles (we assume they were implemented by
 * previous development team). But we have to integrate them into our program.
 */
public class SquarePeg {
    private double sideLength;

    public SquarePeg(double sideLength) {
        this.sideLength = sideLength;
    }

    public double getSideLenght() {
        return sideLength;
    }

    public double getSquare() {
        return Math.pow(this.sideLength, 2);
    }
}
