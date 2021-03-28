public class Animal {
    int age;
    String color;
    
    public void displayData() {
        System.out.println("Age of buzo is " + age + " years old");
        System.out.println("Color of buzo is " + color);
    }

    public static void main(String args[]) {
        Animal buzo = new Animal();
        buzo.age = 10;
        buzo.color = "black";
        buzo.displayData();
    }
}
