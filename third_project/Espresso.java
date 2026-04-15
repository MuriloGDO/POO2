package third_project;

public class Espresso implements CoffeeOptions {
    private float price;

    public Espresso() {
        this.price = 10;
    }

    @Override
    public String getDescription() {
        return "Expresso";
    }

    @Override
    public float getPrice() {
        return this.price;
    }
}
