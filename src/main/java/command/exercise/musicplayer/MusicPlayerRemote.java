package command.exercise.musicplayer;

import command.exercise.musicplayer.command.MusicPlayerCommand;

public class MusicPlayerRemote {
    private MusicPlayerCommand musicPlayerCommand;

    public void setMusicPlayerCommand(MusicPlayerCommand musicPlayerCommand) {
        this.musicPlayerCommand = musicPlayerCommand;
    }

    public void pressButton() {
        musicPlayerCommand.play();
    }
}
