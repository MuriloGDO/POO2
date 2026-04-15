package third_project;

public class Chocolate extends CoffeeDecorator {
    private float price;

    public Chocolate(CoffeeOptions coffeeOptions) {
        super(coffeeOptions);
        this.price = 3;
    }

    @Override
    public String getDescription() {
        // Pega a descrição do que já existe e adiciona "Leite"
        return coffeeOptions.getDescription() + ", Chocolate";
    }

    @Override
    public float getPrice() {
        return super.getPrice() + this.price;
    }
}
