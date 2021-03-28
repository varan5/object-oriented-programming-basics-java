public class Animal {
    int age;
    String color;
    
    public void setProperties(int age, String color) {
        this.age = age;
        this.color = color;
    }

    public void displayProperties() {
        System.out.println("Age of Buzo is " + this.age);
        System.out.println("Color of Buzo is " + this.color);
    }
    public static void main(String args[]) {
        Animal buzo = new Animal();
        buzo.setProperties(12, "Blue");
        buzo.displayProperties();
    }
}
