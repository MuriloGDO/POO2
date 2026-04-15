public class GlobalConfig {
    private String aplicationName;
    private String server;
    private int maxTry;
    private static GlobalConfig instance;

    private GlobalConfig() {
        this.aplicationName = "POO2";
        this.server = "Amazon";
        this.maxTry = 10;
    }   

    public static GlobalConfig getInstance() {
        if(instance == null) 
            instance = new GlobalConfig();
        return instance;
    }

    public String getAplicationName() {
        return this.aplicationName;
    }

    public String getServer() {
        return this.server;
    }

    public int getMaxTry() {
        return this.maxTry;
    }
}