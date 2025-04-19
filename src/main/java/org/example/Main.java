package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // Create a Bird instance
        Bird bird = new Bird();
        bird.makeSound(); // Should print: Bird says: Chirp!
        bird.fly();       // Should print: Bird does: Flying!

        // Polymorphism demo
        Animal myDog = new Dog();
        Animal myCat = new Cat();

        myDog.makeSound(); // Should print: Dog says: Woof!
        myCat.makeSound(); // Should print: Cat says: Meow!
    }
}
