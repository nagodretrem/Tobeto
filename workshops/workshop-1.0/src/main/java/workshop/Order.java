package workshop;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private String orderName;
    private User user;
    private List<Product> products;

    public Order(String orderName) {
        this.orderName = orderName;
        this.products = new ArrayList<>();
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getOrderName() {
        return orderName;
    }
}
