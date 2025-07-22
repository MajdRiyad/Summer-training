import javax.sound.sampled.AudioFormat;

public class FLAC extends AudioFile{
    public FLAC(AudioOutput audioOutput){
        super(audioOutput);
    }
    public void playAudio(String filename){
        System.out.println("Playing  FLAC file: " + filename);
    }
}
