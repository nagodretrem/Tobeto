package course.inheritance;

public class Fish extends  Animal{
    public void swim(){

    }

    @Override
    public void makeSound() {
        System.out.println("Fish sound");
    }

    @Override //
    public void breathe() {
        System.out.println("Fish cant breathe");
        //super => kalitim aldigim classi ifade eder ve oradaki metodu cagirir
        //super.breathe();
    }
}
