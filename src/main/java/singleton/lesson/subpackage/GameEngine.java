package singleton.lesson.subpackage;

public class GameEngine {
    private int hp = 100;
    private String name;

    private static GameEngine instance;
    private static GameEngine instance3 = new GameEngine();

    private GameEngine() {
    }

    public void run() {
        while (true) {
            // waiting for the player's reaction with the environment
            // changing the state of the game
            // rendering a graphics
        }
    }

    public static GameEngine getInstance() {
        if (instance == null) {
            instance = new GameEngine();
        }
        return instance;
    }

    // I. Multi-threaded security - synchronized getInstance method:
    public synchronized static GameEngine getInstance1() {
        if (instance == null) {
            instance = new GameEngine();
        }
        return instance;
    }

    // II. Multi-threaded security - double check with internal synchronized block:
    public synchronized static GameEngine getInstance2() {
        if (instance == null) {
            synchronized (GameEngine.class) {
                if (instance == null) {
                    instance = new GameEngine();
                }
            }
        }
        return instance;
    }

    // III. Multi-threaded security - static initialized field
    public static GameEngine getInstance3() {
        return instance3;
    }
}

