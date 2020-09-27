package visitor.lesson;

import visitor.lesson.activity.Activity;
import visitor.lesson.activity.Squash;
import visitor.lesson.activity.Treadmill;
import visitor.lesson.activity.Weights;
import visitor.lesson.visitor.Visitor;
import visitor.lesson.visitor.VisitorImpl;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Activity treadmill = new Treadmill(400);
        Activity squash = new Squash(45);
        Activity weights = new Weights(50, 10);

        Visitor visitor = new VisitorImpl();

        treadmill.accept(visitor);
        squash.accept(visitor);
        weights.accept(visitor);

        System.out.println("------------------");

        List<Activity> activityList = Arrays.asList(treadmill, squash, weights);
        activityList.forEach(activity -> activity.accept(visitor));
    }
}
