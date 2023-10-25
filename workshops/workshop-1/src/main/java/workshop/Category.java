package workshop;

import java.util.ArrayList;
import java.util.List;

public class Category {
    private String categoryName;
    private List<Product> products;

    public Category(String categoryName){
        this.categoryName = categoryName;
        this.products = new ArrayList<>();
    }


    public void addProduct(Product product){
        products.add(product);
        product.setCategory(this);
    }

    public String getCategoryName(){
        return categoryName;
    }
}
