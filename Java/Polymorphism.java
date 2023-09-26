public class PolyProto {
    public static void main(String[] args) { // Program entry point
        
        // (Polymorphism) Create an instance of Dog. Assign it to an Animal type of a variable.  
        Animal myAnimal = new Dog(); 
        
        myAnimal.makeSound();

        myAnimal = new Cat(); // (Polymorphism) Points myAnimal to a new instance of Cat. 
        myAnimal.makeSound(); // Since myAnimal points to Cat, calling makeSound() will print Meow!.
    }
}

public class Animal { // Parent class = Base class
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
