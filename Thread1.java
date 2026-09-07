 import java.util.*;;
 class a extends Thread
{
 public void run()
 {
    for(int i=0;i<=100;i++)
    {
        System.out.print("hi  ");
         try {
            Thread.sleep(10);
        } catch (InterruptedException e) { e.printStackTrace();
        }
    }
 }   
}
class b extends Thread{
     public void run()
 {
    for(int i=0;i<=100;i++)
    {
        System.out.print("hello  ");
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) { e.printStackTrace();
        }
       
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
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) { e.printStackTrace();
        }
        obj2.start();
    }
}
