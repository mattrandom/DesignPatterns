package command.exercise.musicplayer.command;

import command.exercise.musicplayer.MusicPlayer;

public class PlayNextTrackCommand implements MusicPlayerCommand {
    private MusicPlayer musicPlayer;

    public PlayNextTrackCommand(MusicPlayer musicPlayer) {
        this.musicPlayer = musicPlayer;
    }

    @Override
    public void play() {
        musicPlayer.playNextTrack();
    }
}
