package singleton.exercise;

import java.io.Serializable;
import java.util.Random;
import java.util.Scanner;

public class GuessGame implements Serializable {

    private static final GuessGame INSTANCE = new GuessGame(); // Securing SINGLETON in a multi-threaded environment

    private int score = 0;
    private Random random = new Random();
    private Scanner scanner = new Scanner(System.in);

    private GuessGame() {
    }

    public static GuessGame getInstance() { // Static factory method SINGLETON
        return INSTANCE;
    }

    protected Object readResolve() { // Securing SINGLETON during deserialization
        return INSTANCE;
    }

    public int getScore() {
        return score;
    }

    public void play() {
        for (int i = 0; i <= 10; i++) {
            int number = random.nextInt(9);
            System.out.println("Let's guess the drawn number! Provide a proposal between 0 and 9: ");
            int guess = scanner.nextInt();

            if (guess == number) {
                System.out.println("Great choice! :-)");
                score++;
            } else {
                System.out.println("Sorry, the correct number in this case is " + number);
            }
        }

        System.out.println(String.format("You scored %s points in the game!", score));
    }
}


