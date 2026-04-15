package second_project;

public class SoundSystem {
    private boolean state;

    public SoundSystem() {
        this.state = false;
    }

    public void turnOn() {
        System.out.println("Sistema de som ligado.");
        this.state = true;
    }

    public void turnOff() {
        System.out.println("Sistema de som desligado.");
        this.state = false;
    }
}
