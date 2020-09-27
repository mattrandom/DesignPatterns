package visitor.lesson.activity;

import visitor.lesson.visitor.Visitor;

public interface Activity {

    void accept(Visitor visitor);
}
