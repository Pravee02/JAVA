/* Method Overriding
     * A child class provides its own implementation of a method that already exists in the parent class. 

    * Same method name + same parameters
    but different implementation in child class.   

    * Inheritance must be there
     Return type must be same (or compatible)  

    * Overriding gives Runtime Polymorphism.
    -Decision is made at runtime.

    * Overloading gives CompileTime Polymorphism.

    Dog d = new Dog();    =  not a polimorphism 
    Animal a = new Dog(); =  polimorphism*/

//compile Time Polimorphism (overloading)

   /* class Math {
    int add(int a, int b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }
} */

//Run Time Polimorphism(overriding)

class Animal {
    void sound() {
        System.out.println("Animal sound");
    }
}

class Dog extends Animal {
    void sound() {
        System.out.println("Dog barks");
    }
}
public class Polymorphism{
    public static void main(String args[]){
        Animal a=new Dog();
        a.sound();
        Animal b=new Animal();
        b.sound();
    }
}






