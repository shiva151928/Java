class Animal {

    String name = "Animal";

    Animal() {
        System.out.println("Animal constructor");
    }

    void eat() {
        System.out.println("Animal is eating");
    }
}

// Single Inheritance
class Dog extends Animal {

    String name = "Dog";

    Dog() {
        super(); // Calls parent constructor
        System.out.println("Dog constructor");
    }

    void bark() {
        System.out.println("Dog is barking");
    }

    // Method Overriding
    @Override
    void eat() {
        System.out.println("Dog is eating");
    }

    void showNames() {
        System.out.println("Child name: " + name);
        System.out.println("Parent name: " + super.name);
    }
}

// Multilevel Inheritance
class Puppy extends Dog {

    Puppy() {
        System.out.println("Puppy constructor");
    }

    void play() {
        System.out.println("Puppy is playing");
    }
}

// Hierarchical Inheritance
class Cat extends Animal {

    void meow() {
        System.out.println("Cat is meowing");
    }

    @Override
    void eat() {
        System.out.println("Cat is eating");
    }
}

public class Main {

    public static void main(String[] args) {

        // Multilevel: Animal → Dog → Puppy
        Puppy p = new Puppy();

        p.eat();
        p.bark();
        p.play();

        System.out.println();

        // Hierarchical: Animal → Cat
        Cat c = new Cat();

        c.eat();
        c.meow();

        System.out.println();

        // super keyword
        p.showNames();
    }
}
