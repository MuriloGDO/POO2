package third_project;

public class Chantilly extends CoffeeDecorator {
    private float price;

    public Chantilly(CoffeeOptions coffeeOptions) {
        super(coffeeOptions);
        this.price = 7;
    }

    @Override
    public String getDescription() {
        // Pega a descrição do que já existe e adiciona "Leite"
        return coffeeOptions.getDescription() + ", Chantilly";
    }

    @Override
    public float getPrice() {
        return super.getPrice() + this.price;
    }
}
