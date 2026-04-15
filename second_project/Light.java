package second_project;

public class Light {
    private boolean state;

    public Light() { 
        this.state = false;
    }

    public void turnOn() {
        System.out.println("Luz ligada.");
        this.state = true;
    }

    public void turnOff() {
        System.out.println("Luz desligada.");
        this.state = false;
    }
}
