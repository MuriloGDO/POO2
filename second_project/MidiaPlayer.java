package second_project;

public class MidiaPlayer {
    private boolean state;
    private boolean isPlaying;

    public MidiaPlayer() {
        this.state = false;
        this.isPlaying = false;
    }

    public void turnOn() {
        System.out.println("MidiaPlayer ligado.");
        this.state = true;
    }

    public void turnOff() {
        System.out.println("MidiaPlayer desligado.");
        this.state = false;
    }

    public void play() {
        System.out.println("MidiaPlayer rodando.");
        this.isPlaying = true;
    }

    public void pause() {
        System.out.println("MidiaPlayer pausado.");
        this.isPlaying = false;
    }
}
