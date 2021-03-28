class Bird {
    public void fly() {
        System.out.println("I am flying");
    }
}

class Animal {
    public void eat() {
        System.out.println("I am eating food !");
    }
    public static void main(String[] args) {
        System.out.println("Hello everyone");
        Animal buzo = new Animal();
        buzo.eat();
        buzo.run();
        Bird sparrow = new Bird();
        sparrow.fly();
    }

    public void run() {
        System.out.println("I am running !");
    }
}