/* Method Overloading means:

 ->Same method name
 ->Same class
 ->Different parameters

Overloading depends on:

Number of parameters
Type of parameters
Order of parameters

It does NOT depend on return type.*/
class Calculator{
    int num=10;
    int add(int a,int b){
        return a+b;
    
    }
     int add(int a, int b,int c){
        return a+b+c;
    }
    double add(double a, int b){
        return a+b;
    }
}

public class METHOD_OVERLOADING {
    public static void main(String[] args){
        Calculator calc=new Calculator();

        int r1=calc.add(1, 2);
        System.out.println(r1);

        int r2=calc.add(1, 2, 3);
        System.out.println(r2);

        double r3=calc.add(1.5, 2);
        System.out.println(r3);

        System.out.println(calc.num);


    }
}