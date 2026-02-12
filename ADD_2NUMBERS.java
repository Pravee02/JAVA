class Calculator {
    int n1=10;
    int n2=10;
    public int add(int n1,int n2){
        int r=n1+n2;
        return r;   
    }
}
public class ADD_2NUMBERS
{
    public static void main(String[] args)
    {
       
        Calculator calc=new Calculator();
        int result=calc.add(calc.n1,calc.n2);
        System.out.println("result is: "+result);

    }
}