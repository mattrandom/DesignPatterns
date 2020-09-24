package command.exercise;

import command.exercise.musicplayer.MusicPlayer;
import command.exercise.musicplayer.MusicPlayerRemote;
import command.exercise.musicplayer.command.PlayFirstTrackCommand;
import command.exercise.musicplayer.command.PlayNextTrackCommand;
import command.exercise.musicplayer.command.PlayRandomTrackCommand;

public class Main {
    public static void main(String[] args) {
        MusicPlayer musicPlayer = new MusicPlayer(); // receiver
        MusicPlayerRemote remote = new MusicPlayerRemote(); // invoker

        remote.setMusicPlayerCommand(new PlayFirstTrackCommand(musicPlayer));
        remote.pressButton();

        remote.setMusicPlayerCommand(new PlayNextTrackCommand(musicPlayer));
        remote.pressButton();
        remote.pressButton();
        remote.pressButton();

        remote.setMusicPlayerCommand(new PlayRandomTrackCommand(musicPlayer));
        remote.pressButton();
        remote.pressButton();
    }
}
