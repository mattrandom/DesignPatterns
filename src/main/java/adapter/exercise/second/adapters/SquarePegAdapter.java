package adapter.exercise.second.adapters;

import adapter.exercise.second.round.RoundPeg;
import adapter.exercise.second.square.SquarePeg;

/**
 * Adapter allows fitting square pegs into round holes.
 *
 * It extends the RoundPeg class to let the adapter objects act as round pegs.
 *
 * In reality, the adapter contains an instance of the SquarePeg class.
 */
public class SquarePegAdapter extends RoundPeg {
    private SquarePeg peg;

    public SquarePegAdapter(SquarePeg peg) {
        this.peg = peg;
    }

    // Calculate a minimum circle radius, which can fit this peg
    @Override
    public double getRadius() {
        return Math.sqrt(Math.pow((peg.getSideLenght() / 2), 2) * 2);
    }
}
