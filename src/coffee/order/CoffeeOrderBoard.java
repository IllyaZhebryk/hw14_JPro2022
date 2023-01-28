package coffee.order;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

public class CoffeeOrderBoard {

    private final List<Order> orders = new ArrayList<>();

    public void addOrder(Order order){
        orders.add(order);
    }

    public Order deliver(){
        long earliestOrder = orders.stream()
                .mapToLong(Order::getOrderId)
                .min()
                .getAsLong();

        Order order = orders.stream().filter(o -> o.getOrderId() == earliestOrder).findFirst().get();

        orders.remove(order);

        return order;
    }


    public Order deliver(long orderId){
        Order order = orders.stream()
                .filter(o -> o.getOrderId() == orderId)
                .findFirst()
                .orElseThrow(NoSuchElementException::new);

        orders.remove(order);

        return order;
    }

    public void draw(){
        StringBuilder builder = new StringBuilder();

        builder.append("================").append("\n");
        builder.append("Name | OrderId").append("\n");
        orders.forEach(order -> builder.append(order.getName()).append(" | ").append(order.getOrderId()).append("\n"));
        builder.append("================");

        System.out.println(builder.toString());
    }

}
