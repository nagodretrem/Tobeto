package oopWithNLayeredApp.business;

import oopWithNLayeredApp.core.logging.Logger;
import oopWithNLayeredApp.dataAccess.JdbcProductDao;
import oopWithNLayeredApp.dataAccess.ProductDao;
import oopWithNLayeredApp.entities.Product;

import java.util.List;

public class ProductManager {
    private ProductDao productDao;
    private List<Logger> loggers;

    public ProductManager(ProductDao productDao, List<Logger> loggers) {
        this.productDao = productDao;
        this.loggers = loggers;
    }

    public void add(Product product) throws Exception {
        if(product.getUnitPrice() < 10){
            throw new Exception("urun fiyati 10dan kucuk olamaz");
        }

        productDao.add(product);

        for (Logger logger: loggers){
            logger.log(product.getName());
        }
    }
}
