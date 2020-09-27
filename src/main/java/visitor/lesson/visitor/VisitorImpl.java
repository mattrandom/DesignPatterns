package visitor.lesson.visitor;

import visitor.lesson.activity.Squash;
import visitor.lesson.activity.Treadmill;
import visitor.lesson.activity.Weights;

public class VisitorImpl implements Visitor {

    @Override
    public void visit(Treadmill treadmill) {
        System.out.println("Calories burned running on treadmill: " + treadmill.getDistance() * 5);
    }

    @Override
    public void visit(Weights weights) {
        System.out.println("Calories burned lifting weights: " + weights.getWeight() * weights.getReps() * 2);
    }

    @Override
    public void visit(Squash squash) {
        System.out.println("Calories burned playing squash: " + squash.getMinutesPlayed() * 20);
    }
}
