package multithreadpractice;


public class VolatileEx implements Runnable 
{
public volatile int x=0;
                  void add()
                  {
  for(int i=0;i<200;i++)
  {
                  x++;                 
  }
                  }
          public void run()
          {
  add();
  System.out.println(x+" "+Thread.currentThread().getName());
          }
          

          public static void main(String []args)
          {
          for(int i=0;i<20;i++)
          {
          VolatileEx v=new VolatileEx();
          Thread t=new Thread(v);
          t.start();
          }
          }
}


