package course;

import course.module.*;


public class Main {
    public static void main(String[] args) {
        // Primitive ve Reference Types
        // OOP Giris

        // Stack - Heap
        // Primitive => Stack => a = 10
        // Reference => @abc123 => heap @abc123={"Halit","Engin"}

        int a = 5;
        int b = a;
        b+=1;

        System.out.println(a);
        System.out.println(b);

        String[] names = {"Halit","Engin","Ahmet","Irem"};

        // Clone
        String[] names2 = names.clone();
        //String[] names2 = Arrays.copyOf(names, names.length);

        System.out.println(names);
        System.out.println(names2);


        names2[0] = "Enes";

        System.out.println(names[0]);
        System.out.println(names2[0]);

        //Iterasyon
        //Index
        for (int i=0; i< names2.length; i++){
            System.out.println(names2[i]);
        }
        // names2 icindeki her bir elemani iterasyona ugrat
        // her elemana name takma adini ver
        for(String name:names2){
            System.out.println(name);
        }

        //OOP
        //Product => unitPrice, name, discount(),sell()

        //Instance => ornek

        Product product = new Product();
        product.setName("Laptop");
        product.setPrice(50);
        product.discount(10.0);

        //constructor => yapici metot
        Product product1 = new Product("Mouse",10);
        product1.discount(5);

        System.out.println(product.getPrice());
        System.out.println(product1.getPrice());

        Category category = new Category();
        Order order = new Order();


    }
}