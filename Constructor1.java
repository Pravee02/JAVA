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


class Constructor1{
    public static void main(String args[]) {
        Car c1 = new Car();
            c1.display();
         Car c2 = new Car("Blue");
         c2.display();
    }
}
// also example for overloading 

/* A constructor is a special method used to initialize objects and is executed automatically when an object is created*/

/* A constructor is a special method that

1 Has the same name as the class
2 Has no return type
3 Runs automatically when an object is created
4 Is used to initialize (give values to) variables
5 Can be overloaded

Types of Constructor
1.Default Constructor (no parameters)
2.Parameterized Constructor (with parameters) */