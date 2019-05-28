package multithreadpractice;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class LockEx extends Thread
{
          static Lock l=new ReentrantLock();
          public void run()
          {                 
          lockdemo();
          }
          void lockdemo()
          {
          l.lock();
          for(int i=0;i<20;i++)
          {
          System.out.println(Thread.currentThread().getName()+"----------"+i);
          }
          l.unlock();
          }
         

          public static void main(String []args)
          {
          LockEx l=new LockEx();
          l.start();
          LockEx l1=new LockEx();
          l1.start();
          for(int i=0;i<10;i++)
          {
                  LockEx l2=new LockEx();
                  l2.start();
          }
          }
}
