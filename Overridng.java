class Animal {
    // Overridden method
    void move() {
        System.out.println("Animals can move");
    }
}

class Dog extends Animal {
    // Overriding method
    @Override
    void move() {
        System.out.println("Dogs can walk and run");
    }
}

public class Overridng{
    public static void main(String[] args) {
        Animal myAnimal = new Animal();
        Animal myDog = new Dog(); // Subclass object

        myAnimal.move(); // Outputs: Animals can move
        myDog.move();    // Outputs: Dogs can walk and run
    }
}
