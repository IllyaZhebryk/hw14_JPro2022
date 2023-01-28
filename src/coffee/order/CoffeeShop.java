package coffee.order;

public class CoffeeShop {
    public static void main(String[] args) {

        NameGenerator nameGenerator = new NameGenerator();

        CoffeeOrderBoard coffeeOrderBoard = new CoffeeOrderBoard();

        for (int i = 0; i < 10; i++) {
            coffeeOrderBoard.addOrder(new Order(nameGenerator.randomIdentifier()));
        }
        coffeeOrderBoard.draw();

        coffeeOrderBoard.deliver();

        coffeeOrderBoard.draw();

        coffeeOrderBoard.deliver(5);

        coffeeOrderBoard.draw();

    }
}
