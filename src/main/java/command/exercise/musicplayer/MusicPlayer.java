package command.exercise.musicplayer;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class MusicPlayer {
    private List<String> tracks = Arrays.asList("Track 1", "Track 2", "Track 3");
    private int currentTrackNumber = 0;

    public void playFirstTrack() {
        System.out.println(String.format("You are listening to the first track: %s", tracks.get(currentTrackNumber)));
    }

    public void playNextTrack() {
        currentTrackNumber++;
        if (currentTrackNumber > 2) {
            currentTrackNumber = 0;
        }
        System.out.println(String.format("You are listening to the next track: %s", tracks.get(currentTrackNumber)));
    }

    public void playRandomTrack() {
        Random random = new Random();
        int randomTrack = random.nextInt(3);
        System.out.println(String.format("You are listening to the random track: %s", tracks.get(randomTrack)));
    }
}
