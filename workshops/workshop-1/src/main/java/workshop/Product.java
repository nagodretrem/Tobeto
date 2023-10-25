package workshop;

public class Product {
    private String productName;
    private double price;
    private Category category;

    public Product(String productName, double price){
        this.productName = productName;
        this.price = price;
    }
    public void setCategory(Category category) {
        this.category = category;
    }
    public Category getCategory(){
        return category;
    }
    public String getProductName() {
        return productName;
    }

    public double getPrice() {
        return price;
    }
}
