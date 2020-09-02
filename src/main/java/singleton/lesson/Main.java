package singleton.lesson;

import singleton.lesson.subpackage.GameEngine;

public class Main {
    public static void main(String[] args) {
        GameEngine instance = GameEngine.getInstance();
        System.out.println(instance);

        GameEngine instance2 = GameEngine.getInstance();
        System.out.println(instance2);

        System.out.println(instance == instance2);
    }
}
