package workshop;

import java.util.ArrayList;
import java.util.List;

public class User {
    private String username;
    private List<Order> orders;

    public User(String username){
        this.username = username;
        this.orders = new ArrayList<>();
    }

    public void placeOrder(Order order){
        orders.add(order);
        order.setUser(this);
    }


    public List<Order> getOrders() {
        return orders;
    }
}
