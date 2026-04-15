package second_project;

public class Receiver {
    private boolean state;

    public Receiver() {
        this.state = false;
    }

    public void turnOn() {
        System.out.println("Receiver ligado.");
        this.state = true;
    }

    public void turnOff() {
        System.out.println("Receiver desligado.");
        this.state = false;
    }
}
