
public class MP3 extends AudioFile {
    public MP3(AudioOutput audioOutput) {
        super(audioOutput);
    }
    public void playAudio(String filename) {
        audioOutput.play("MP3 file: "+filename);
    }
}
