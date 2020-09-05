package singleton.lesson.subpackage;

public enum GameEngineReflectionCase {
    INSTANCE("Random"); // then enum field must be initialized

    private int hp = 100;
    private String name;

    GameEngineReflectionCase(String name) { // if we pass arguments to the constructor
        this.name = name;
    }

    public void run() {
        while (true) {
            // waiting for the player's reaction with the environment
            // changing the state of the game
            // rendering a graphics
        }
    }
}
