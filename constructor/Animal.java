public class Animal {
    int age;
    String color;

    // This is a constructor, which has 2 parameters, so it is also known as a Parameterised constructor

    public Animal(int age, String color) {
        this.age = age;
        this.color = color;
    }

    public Animal() {
        System.out.println("This is a no-args constructor");
    }

    public void displayData() {
        System.out.println("Age is " + age + " years old");
        System.out.println("Color is " + color);
    }

    public static void main(String args[]) {
        Animal buzo = new Animal();
        Animal tommy = new Animal(15, "Grey");
        buzo.displayData();
        tommy.displayData();
    }
}
