public abstract class AudioFile {

    protected AudioOutput audioOutput;

    public AudioFile(AudioOutput audioOutput) {
        this.audioOutput = audioOutput;
    }
    abstract void playAudio(String audioFile);
}
