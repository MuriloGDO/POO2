package fourth_project;

public class Institution implements Observer {
    private String name;

    public Institution(String name) {
        this.name = name;
    }

    @Override
    public void update(Subject subject) {
        String name = ((DataCollectionPoint) subject).getName();
        float ph = ((DataCollectionPoint) subject).getPh();
        float temp = ((DataCollectionPoint) subject).getTemp();
        float atmosphericPressure = ((DataCollectionPoint) subject).getAtmosphericPressure();
        float relativeHumidity = ((DataCollectionPoint) subject).getRelativeHumidity();

        System.out.println("===Atualização do rio " + name + "===");
        System.out.println("Instituição recebendo a atualização: " + this.name);
        System.out.println("PH: " + ph);
        System.out.println("Temperatura: " + temp);
        System.out.println("Pressão Atm: " + atmosphericPressure);
        System.out.println("Umidade relativa do ar: " + relativeHumidity);
        System.out.println("======");
    }
}
