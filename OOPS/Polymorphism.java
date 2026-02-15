class Animal {
    public void makeSound() {
        System.out.println("The animal makes a generic sound");
    }
}

class Dog extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Dog barks: Woof Woof");
    }
}

class Cat extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Cat meows: Meow Meow");
    }
}

public class Polymorphism {
    public static void main(String[] args) {
        // Create objects using the parent class reference
        Animal genericAnimal = new Animal();
        Animal myDog = new Dog(); // A Dog object with an Animal reference (upcasting)
        Animal myCat = new Cat(); // A Cat object with an Animal reference

        // Call the makeSound() method on each
        genericAnimal.makeSound(); // Calls the Animal method
        myDog.makeSound(); // Calls the Dog method
        myCat.makeSound(); // Calls the Cat method
    }
}
