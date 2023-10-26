package oopWithNLayeredApp;

import oopWithNLayeredApp.business.ProductManager;
import oopWithNLayeredApp.core.logging.*;
import oopWithNLayeredApp.dataAccess.*;
import oopWithNLayeredApp.entities.Product;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws Exception {

        Product product1 = new Product(1,"IPhone Xr",9999);

        List<Logger> loggers = new ArrayList<Logger>();
        loggers.add(new FileLogger());
        loggers.add(new DatabaseLogger());
        loggers.add(new MailLogger());



        ProductManager productManager = new ProductManager(new JdbcProductDao(), loggers);
        productManager.add(product1);
    }
}