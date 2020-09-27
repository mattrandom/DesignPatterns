package visitor.lesson.visitor;

import visitor.lesson.activity.Squash;
import visitor.lesson.activity.Treadmill;
import visitor.lesson.activity.Weights;

public interface Visitor {

    void visit(Treadmill treadmill);

    void visit(Weights weights);

    void visit(Squash squash);
}
