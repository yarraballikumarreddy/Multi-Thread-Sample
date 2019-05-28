package multithreadpractice;


import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Executorsinglepool {

public static void main(String[] args) {



ExecutorService service1   = Executors.newSingleThreadExecutor();

    
      for(int i=0;i<10;i++) {

service1.execute(new Single());
System.out.println(i);

}

} 
} 




class Single implements Runnable{

public void run() {

System.out.println(Thread.currentThread().getName());

}

}

