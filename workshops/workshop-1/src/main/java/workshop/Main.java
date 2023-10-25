package workshop;

public class Main {
    public static void main(String[] args) {
        Category electronic = new Category("Electronic");
        Category clothing = new Category("Clothing");

        Product laptop = new Product("Laptop", 250);
        Product tShirt = new Product("T-Shirt", 15);

        electronic.addProduct(laptop);
        clothing.addProduct(tShirt);

        User user1 = new User("user1");

        Order order1 = new Order("order1");
        user1.placeOrder(order1);

        Order order2 = new Order("order2");
        user1.placeOrder(order2);

        System.out.println("User1's orders:");
        for (Order order: user1.getOrders()){
            System.out.println(order.getOrderName());
        }
        System.out.println(" ");
        System.out.println("Product's prices:");
        System.out.println(laptop.getProductName() +": "+ laptop.getPrice() +" USD");
        System.out.println(tShirt.getProductName() +": "+ tShirt.getPrice() +" USD");

        System.out.println(" ");
        System.out.println("Product's Categories:");
        System.out.println(laptop.getCategory().getCategoryName());
        System.out.println(tShirt.getCategory().getCategoryName());
    }
}