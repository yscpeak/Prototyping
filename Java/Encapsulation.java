public class EncapProto {
    // Properties
    // Variables are private. Only can be accessed within the EncapProto class. External programs cannot directly access these variables.
    private String name;
    private int age;

    // Constructor
    // Used to initialize the object's properties.
    public EncapProto(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Getter for name
    // Retrieve獲取 the values of the name.
    public String getName() {
        return name;
    }

    // Setter for name
    // Set設定 the values of the name. 
    public void setName(String name) {
        this.name = name;
    }

    // Getter for age
    public int getAge() {
        return age;
    }

    // Setter for age
    public void setAge(int age) {
        this.age = age;
    }

    //  This method is used to display the object's name and age.
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    // Main function, the program's entry point.
    // Create an EncapProto object, initialize its name and age. Use the displayInfo method to display original info, 
    // then use the setter methods to modify the name and age and call the displayInfo method again to display the updated info.
    public static void main(String[] args) {

        // Person is the variable name used to reference the newly created EncapProto object. Stored that new object in a variable named "person".
        // In order to access and manipulate the object's properties and methods.
        // In summary: "Creates a EncapProto object named person and sets its name to Alice and age to 30." 創建了一個名為person的EncapProto物件。
        EncapProto person = new EncapProto("Alice", 30);
        
        person.displayInfo();

        // Update properties
        person.setName("Bob");
        person.setAge(25);
        person.displayInfo();
    }
}
