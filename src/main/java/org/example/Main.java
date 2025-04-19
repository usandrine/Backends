package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        try {
            // Create a Bird instance
            Bird bird = new Bird();

            if (bird != null) {
                bird.makeSound(); // Should print: Bird says: Chirp!
                bird.fly();       // Should print: Bird does: Flying!
            } else {
                System.out.println("Error: Bird object is null.");
            }

            // Polymorphism demo
            Animal myDog = new Dog();
            Animal myCat = new Cat();

            if (myDog != null) {
                myDog.makeSound(); // Should print: Dog says: Woof!
            } else {
                System.out.println("Error: Dog object is null.");
            }

            if (myCat != null) {
                myCat.makeSound(); // Should print: Cat says: Meow!
            } else {
                System.out.println("Error: Cat object is null.");
            }

        } catch (Exception e) {
            System.out.println("An unexpected error occurred: " + e.getMessage());
        }
    }
}
