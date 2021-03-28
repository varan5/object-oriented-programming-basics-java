public class Animal {
    int age;
    String color;
    String petName;
    // 'this' is the reference variable for the object of the current class
    // 'this' is used to refer to the object on which it is called inside the class
    // 'this' is not used outside of the class, as we have the origin object itself to refer outside the class, so no need of 'this' outside the class
    // 'this' resolves the conflict with the local variable, if both the instance variable and the local variable have the same name  
    // Note: 'this' refers to the current object of a class
    public Animal(int age, String color, String petName) {
        this.age = age;
        this.color = color;
        this.petName = petName;
    }

    public void displayDetails() {
        System.out.println("Age is " + this.age + " years old");
        System.out.println("Color is " + this.color);
        System.out.println("Pet name is " + this.petName);
    }

    public static void main(String args[]) {
        Animal buzo = new Animal(18, "Brown", "Buzzy");
        buzo.displayDetails();
    }
}
