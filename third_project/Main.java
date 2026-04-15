package third_project;

public class Main {
    public static void main(String[] args) {
        CoffeeOptions meuCafe = new Espresso();
        
        meuCafe = new Milk(meuCafe);
        
        meuCafe = new CoffeeDecorator(meuCafe);

        System.out.println("Pedido: " + meuCafe.getDescription());
        System.out.println("Custo Total: R$ " + meuCafe.getPrice());
    }
}