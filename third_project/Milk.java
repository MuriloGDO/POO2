package third_project;

public class Milk extends CoffeeDecorator {
    private float price;

    public Milk(CoffeeOptions coffeeOptions) {
        super(coffeeOptions);
        this.price = 5;
    }

    @Override
    public String getDescription() {
        return coffeeOptions.getDescription() + ", Leite";
    }

    @Override
    public float getPrice() {
        return super.getPrice() + this.price;
    }
}
