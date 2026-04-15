package third_project;

public class Tea implements CoffeeOptions {
    private float price;

    public Tea() {
        this.price = 15;
    }

    @Override
    public String getDescription() {
        return "Chá";
    }

    @Override
    public float getPrice() {
        return this.price;
    }
}
