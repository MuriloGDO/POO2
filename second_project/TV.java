package second_project;

public class TV {
    private boolean state;

    public TV() {
        this.state = false;
    }

    public void turnOn() {
        System.out.println("TV ligada.");
        this.state = true;
    }

    public void turnOff() {
        System.out.println("TV desligada.");
        this.state = false;
    }
}
