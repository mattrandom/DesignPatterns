package singleton.lesson.subpackage;

public class GameEngine {
    private int hp = 100;
    private String name;

    private static GameEngine instance;

    private GameEngine() {
    }

    public static GameEngine getInstance() {
        if (instance == null) {
            instance = new GameEngine();
        }
        return instance;
    }

    public void run() {
        while (true) {
            // waiting for the player's reaction with the environment
            // changing the state of the game
            // rendering a graphics
        }
    }
}

