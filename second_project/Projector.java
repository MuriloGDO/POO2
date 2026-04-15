package second_project;

public class Projector {
    private boolean state;

    public Projector() {
        this.state = false;
    }

    public void turnOn() {
        System.out.println("Projetor ligado.");
        this.state = true;
    }

    public void turnOff() {
        System.out.println("Projetor desligado.");
        this.state = false;
    }
}
