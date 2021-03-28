class Animal {
    int age = 10;
}

public class Dog extends Animal {
    int age = 20;

    public void setAge(int age) {
        System.out.println("Local variable age is " + age);    // 30
        System.out.println("Dog class instance variable is " + this.age);    // 20
        System.out.println("Animal class instance variable is " + super.age);    // 10
        // 'super' is a reference variable, which access the instance variables of the Parent class
    }
    public static void main(String args[]) {
        Dog tommy = new Dog();
        tommy.setAge(30);
    }
}
