public class PolyProto {
    public static void main(String[] args) {
        Animal myAnimal = new Dog(); // 多型
        myAnimal.makeSound();

        myAnimal = new Cat(); // 多型
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
