package course;

//Her class default olarak bos bir constructor ile baslar
public class Product {

    public Product(){
        System.out.println("Bos ctor calistirildi.");
    }
    public Product(String name, double price){
        this.name = name;
        this.price = price;
        System.out.println("parametreli ctor calistirildi.");
    }
    //encapsulation
    //private => class disinda hic kimse kullanamaz
    //getter-setter
    //okuma-yazma public func
    //sadece getter varsa => read only
    //sadece setter varsa => write only
    private String name;
    private double price;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }




    // erisim_belirteci donus_tipi method_ismi(){}
    public void discount(double discount)
    {
        price = price - discount;
    }

    // method overloading => aybu usunde farkli imzada n kadar methoda sahip olmak
    public void discount(int percent){
        price = price - (price * percent)/100;
    }
}
