package course;

import course.inheritance.Animal;
import course.inheritance.Bird;
import course.inheritance.Dog;
import course.inheritance.Fish;

public class Main {
    public static void main(String[] args) {

        // Inheritance
        // Polymorphism
        // Abstraction - Interface

        Bird bird = new Bird();
        Dog dog = new Dog();
        Fish fish = new Fish();

        bird.breathe();
        dog.breathe();
        fish.breathe();

        bird.makeSound();
        dog.makeSound();
        fish.makeSound();

        // Polymorphism
        // Cok cesitlilik

        Animal animal = new Bird();
        Animal animal1 = new Dog();
        Animal animal2 = new Fish();



        //Casting
        //Casting yaparak Bird classina ait metodlari kullanabilirim.
        //Casting yapmadigim surece newlesem bile o bir Animal nesnesi
        ((Bird) animal).fly();
        // Asagidaki ifadeye dikkat runtime exp!
        // ((Bird) animal1).fly();


        //Abstraction
        // Animal animal3 = new Animal();
    }
}