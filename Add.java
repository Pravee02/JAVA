 class Calculator{
    int n1=10;
    int n2=10;
    int n3=30;
    public int add(int n1,int n2){
        int r=n1+n2;
        return r; 
    }
    public int add(int n1,int n2,int n3){
        int r1=n1+n2+n3;
        return r1;   
    }
}
public class Add
{
    public static void main(String[] args)
    {
       
        Calculator calc=new Calculator();
        int result=calc.add(calc.n1,calc.n2);
        System.out.println("result is: "+result);
        int result1=calc.add(calc.n1,calc.n2,calc.n3);
        System.out.println("result is: "+result1);
        System.out.println(calc.n1);
    }
}