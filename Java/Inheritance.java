// The entry point of the program.
public class InheritProto {
  
    // Create an object of the Car class in the main method 
    // and then call the displayInfo method of that object. 呼叫該物件的displayInfo方法
    public static void main(String[] args) {
        Car myCar = new Car("Toyota", "Camry");
        myCar.displayInfo();
    }
}

// Parent class (Base class). Represent a vehicle. 
public class Vehicle {

    // Instance variable. Represent a brand of the vehicle.
    String brand;

    // A constructor.
    public Vehicle(String brand) {

        // "this.brand" is the class's attribute (member variable成員變數). Represent the brand attribute in the Vehicle class. 代表Vehicle類別中的品牌屬性。
        // "brand" is a parameter參數 of the constructor (local variable局部變數) used to temporarily store the value passed into the constructor. 暫存傳入建構子(函式)的值。
        this.brand = brand;
    }

    // Used to display the vehicle's brand.
    public void displayInfo() {
        System.out.println("Brand: " + brand);
    }
}

// Subclass (Derived class). Inherits from the Vehicle class.
public class Car extends Vehicle {

    // The Car subclass has an additional instance variable "model" representing the model of the vehicle. 
    String model;

    // A constructor used to initialize the brand and model. 
    public Car(String brand, String model) {

        // Super is a keyword used to call the constructor of the parent class. 呼叫父類別的建構子(函式)
        super(brand);

        // this.XX 是 Car類別的屬性 = 成員變數; XX 是 建構(構造)函式的參數 = 局部變數
        this.model = model;
    }

    // Overrides the displayInfo method of the parent class Vehicle to display both the brand and model of the vehicle.
    @Override
    public void displayInfo() {

        // Called the displayInfo method in the parent clas. 呼叫父類別中的displayInfo方法，以顯示品牌。
        super.displayInfo(); 

        // 印出型號
        System.out.println("Model: " + model);
    }
}
