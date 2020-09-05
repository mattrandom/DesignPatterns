package singleton.lesson.subpackage;

import java.io.Serializable;

public class GameEngineSerializationCase implements Serializable {

    private static final long serialVersionUID = 23232323L;

    private int hp = 100;
    private String name;

    private static GameEngineSerializationCase INSTANCE;

    private GameEngineSerializationCase() {
    }

    public void run() {
        while (true) {
            // waiting for the player's reaction with the environment
            // changing the state of the game
            // rendering a graphics
        }
    }

    public static GameEngineSerializationCase getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new GameEngineSerializationCase();
        }
        return INSTANCE;
    }

    protected Object readResolve() {
        return getInstance();
    }
}



