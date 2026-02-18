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