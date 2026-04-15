package second_project;

public class Main {
    public static void main(String[] args) {
        TV tv = new TV();
        Light light = new Light();
        MidiaPlayer player = new MidiaPlayer();
        SoundSystem sound = new SoundSystem();
        Receiver receiver = new Receiver();
        Projector projector = new Projector();

        HomeTheaterFacade homeTheater = new HomeTheaterFacade(
            tv, light, player, sound, receiver, projector
        );

        System.out.println("=== TESTANDO PADRÃO FACADE ===");
        
        System.out.println("\n--- Preparando para assistir filme ---");
        homeTheater.watchFilm();

        System.out.println("\n--- Alternando para modo música ---");
        homeTheater.playMusic();

        System.out.println("\n=== TESTE FINALIZADO COM SUCESSO ===");
    }
}