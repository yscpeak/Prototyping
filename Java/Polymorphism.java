public class PolyProto {
    public static void main(String[] args) { // program entry point
        Animal myAnimal = new Dog(); // Polymorphism
        myAnimal.makeSound();

        myAnimal = new Cat(); // Polymorphism
        myAnimal.makeSound();
    }
}

public class Animal {
    void makeSound() {
        System.out.println("Some sound");
    }
}

public class Dog extends Animal {
    @Override
    void makeSound() {
        System.out.println("Woof!");
    }
}

public class Cat extends Animal {
    @Override
    void makeSound() {
        System.out.println("Meow!");
    }
}
