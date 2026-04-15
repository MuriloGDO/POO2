package second_project;

public class HomeTheaterFacade {
    private TV tv;
    private Light light;
    private MidiaPlayer midiaPlayer;
    private SoundSystem soundSystem;
    private Receiver receiver;
    private Projector projector;

    public HomeTheaterFacade(TV tv, Light light, MidiaPlayer midiaPlayer, SoundSystem soundSystem,
        Receiver receiver, Projector projector
    ) {
        this.tv = tv;
        this.light = light;
        this.midiaPlayer = midiaPlayer;
        this.soundSystem = soundSystem;
        this.receiver = receiver;
        this.projector = projector;
    }

    public void watchFilm() {
        this.tv.turnOn();
        this.light.turnOn();
        this.soundSystem.turnOn();
        this.receiver.turnOn();
        this.projector.turnOn();
        this.midiaPlayer.turnOn();
        this.midiaPlayer.play();
    }

    public void playMusic() {
        this.light.turnOn();
        this.soundSystem.turnOn();
        this.receiver.turnOn();
    }
}
