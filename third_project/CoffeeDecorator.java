package third_project;

public class CoffeeDecorator implements CoffeeOptions {
    protected CoffeeOptions coffeeOptions;

    public CoffeeDecorator(CoffeeOptions coffeeOption) {
        this.coffeeOptions = coffeeOption;
    }

    @Override
    public String getDescription() {
        return this.coffeeOptions.getDescription();
    }

    @Override
    public float getPrice() {
        return this.coffeeOptions.getPrice();
    }
}
