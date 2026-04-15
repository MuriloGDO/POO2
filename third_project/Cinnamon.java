package third_project;

public class Cinnamon extends CoffeeDecorator {
    private float price;

    public Cinnamon(CoffeeOptions coffeeOptions) {
        super(coffeeOptions);
        this.price = 5;
    }

    @Override
    public String getDescription() {
        // Pega a descrição do que já existe e adiciona "Leite"
        return coffeeOptions.getDescription() + ", Canela";
    }

    @Override
    public float getPrice() {
        return super.getPrice() + this.price;
    }
}
