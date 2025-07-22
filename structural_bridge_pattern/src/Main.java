public class Main {
    public static void main(String[] args) {
        AudioOutput headphones = new Headphons();
        AudioOutput speakers = new Speakers();

        AudioFile mp3WithHeadphones = new MP3(headphones);
        AudioFile flacWithSpeakers = new FLAC(speakers);
        //
        AudioFile mp3WithSpeakers = new MP3(speakers);


        mp3WithHeadphones.playAudio("song.mp3"); // Plays MP3 file through headphones
        flacWithSpeakers.playAudio("track.flac");
        mp3WithSpeakers.playAudio("majd.mp3");
    }
}