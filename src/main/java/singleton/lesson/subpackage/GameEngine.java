package singleton.lesson.subpackage;

public class GameEngine {
    private int hp = 100;
    private String name;

    private static GameEngine INSTANCE;
    private static final GameEngine INSTANCE3 = new GameEngine();

    private GameEngine() {
    }

    public void run() {
        while (true) {
            // waiting for the player's reaction with the environment
            // changing the state of the game
            // rendering a graphics
        }
    }

    public static GameEngine getInstance() { // Lazy loading SINGLETON
        if (INSTANCE == null) {
            INSTANCE = new GameEngine();
        }
        return INSTANCE;
    }

    // I. Multi-threaded security - synchronized getInstance method:
    public synchronized static GameEngine getInstance1() {
        if (INSTANCE == null) {
            INSTANCE = new GameEngine();
        }
        return INSTANCE;
    }

    // II. Multi-threaded security - double check with internal synchronized block:
    public synchronized static GameEngine getInstance2() {
        if (INSTANCE == null) {
            synchronized (GameEngine.class) {
                if (INSTANCE == null) {
                    INSTANCE = new GameEngine();
                }
            }
        }
        return INSTANCE;
    }

    // III. Multi-threaded security - static initialized field & static factory method
    public static GameEngine getInstance3() {
        return INSTANCE3;
    }
}

