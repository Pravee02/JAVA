 import java.util.*;;
 class a extends Thread
{
 public void run()
 {
    for(int i=0;i<=1000;i++)
    {
        System.out.print("hi  ");
    }
 }   
}
class b extends Thread{
     public void run()
 {
    for(int i=0;i<=1000;i++)
    {
        System.out.print("hello  ");
    }
 }   
}
public class Thread1
{
    public static void main(String[] args)
    {
        a obj1 = new a();
        b obj2 = new b();

        
        obj1.start();
        obj2.start();
    }
}
