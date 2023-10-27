package course.inheritance;

// somut islemlerde barindirabilen
// soyutlama yapilan yapilardir
public abstract class Animal {
    public abstract void makeSound();
    public void eat (){
        System.out.println("Animal eating");
    }

    public void breathe(){
        System.out.println("Animal breathing");
    }
}
