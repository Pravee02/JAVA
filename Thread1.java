 import java.util.*;


 class a implements Runnable
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
class b implements Runnable{
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
        Runnable obj1 = new a(); //it is a runnable object 
        b obj2 = new b();        0//it is a runnable object

        Thread t1 = new Thread(obj1); //thread constructor can take runnable object 
         Thread t2 = new Thread(obj2);
        
        //obj1.start(); // implemnts runnable not have start method
        //obj2.start();// implemnts runnable not have start method
        //start method only in threads


        t1.start();
        t2.start();
    }
}
