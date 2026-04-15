package third_project;

public class Cappuccino implements CoffeeOptions {
    private float price;

    public Cappuccino() {
        this.price = 20;
    }

    @Override
    public String getDescription() {
        return "Cappuccino";
    }

    @Override
    public float getPrice() {
        return this.price;
    }
}
