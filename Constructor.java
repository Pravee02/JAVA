class Car {
    String color;
    Car() {   // Default constructor
        System.out.println("Car created");
    }


// Parameterized constructor 
    
    Car(String c) {   
        color = c;
    }

     void display() {
        System.out.println("Car color is " + color);
    }
}


class Constructor {
    public static void main(String args[]) {
        Car c1 = new Car();

         Car c2 = new Car("Blue");
         c2.display();
    }
}
// also example for overloading 

/* “A constructor is a special method used to initialize objects and is executed automatically when an object is created.”

A constructor is a special method that:

* Has the same name as the class
* Has no return type
* Runs automatically when an object is created
* Is used to initialize (give values to) variables
* Can be overloaded

Types of Constructor---
1️. Default Constructor (no parameters)
2️. Parameterized Constructor (with parameters)