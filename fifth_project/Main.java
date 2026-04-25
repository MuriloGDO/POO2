package fourth_project;

public class Main {
    public static void main(String[] args) {
        DataCollectionPoint rioAmazonas = new DataCollectionPoint("Amazonas", 28.5f, 6.5f, 1012f, 85f);
        DataCollectionPoint rioTapajos = new DataCollectionPoint("Tapajós", 30.0f, 7.2f, 1010f, 70f);
        DataCollectionPoint rioNegro = new DataCollectionPoint("Negro", 27.0f, 4.5f, 1011f, 90f);
        DataCollectionPoint rioXingu = new DataCollectionPoint("Xingu", 29.2f, 7.0f, 1009f, 75f);

        Institution ufpa = new Institution("UFPA");
        Institution inpa = new Institution("INPA");
        Institution usp = new Institution("USP");
        Institution unifesp = new Institution("UNIFESP");
        Institution uea = new Institution("UEA");
        Institution mcti = new Institution("MCTI");

        rioAmazonas.addObserver(mcti);
        rioTapajos.addObserver(mcti);
        rioNegro.addObserver(mcti);
        rioXingu.addObserver(mcti);
        rioNegro.addObserver(unifesp);
        rioAmazonas.addObserver(uea);
        rioNegro.addObserver(uea);
        rioXingu.addObserver(ufpa);
        rioXingu.addObserver(inpa);

        System.out.println("=== RELATÓRIO DE EVENTOS CRÍTICOS ===\n");

        System.out.println(">>> EVENTO: Frente fria atípica atinge a bacia do Rio Negro!");
        rioNegro.setTemp(24.5f); 

        System.out.println("\n--------------------------------------------\n");

        System.out.println(">>> EVENTO: Queda de pressão atmosférica e umidade no Xingu!");
        rioXingu.setAtmosphericPressure(1005f);
        rioXingu.setRelativeHumidity(40f);

        System.out.println("\n--------------------------------------------\n");

        System.out.println(">>> EVENTO: Alteração química detectada no Rio Amazonas!");
        rioAmazonas.setPh(5.5f);
    }
}