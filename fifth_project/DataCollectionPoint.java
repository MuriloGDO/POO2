package fourth_project;

public class DataCollectionPoint extends Subject {
    private String name;
    private float temp;
    private float ph;
    private float atmosphericPressure;
    private float relativeHumidity;

    public DataCollectionPoint(String name, float temp, float ph, float atmosphericPressure, float relativeHumidity) {
        this.temp = temp;
        this.ph = ph;
        this.atmosphericPressure = atmosphericPressure;
        this.relativeHumidity = relativeHumidity;
    }

    public void setTemp(float temp) {
        this.temp = temp;
        notifyObservers();
    }

    public void setPh(float ph) {
        this.ph = ph;
        notifyObservers();
    }

    public void setAtmosphericPressure(float ap) {
        this.atmosphericPressure = ap;
        notifyObservers();
    }

    public void setRelativeHumidity(float rh) {
        this.relativeHumidity = rh;
        notifyObservers();
    }

    public String getName() {
        return this.name;
    }

    public float getTemp() {
        return this.temp;
    }

    public float getPh() {
        return this.ph;
    }

    public float getAtmosphericPressure() {
        return this.atmosphericPressure;
    }

    public float getRelativeHumidity() {
        return this.relativeHumidity;
    }
}