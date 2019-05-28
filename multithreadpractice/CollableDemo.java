package multithreadpractice;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;


public class CollableDemo implements Callable {

int a,b,c;

CollableDemo(int a,int b){

this.a=a;
this.b=b;

}


public Object call() throws Exception {

c= a+b;

return c;
}






public static class CollableDemoAppTest {

public static void main(String[] args) throws InterruptedException, ExecutionException {


CollableDemo c = new CollableDemo(15,20); 

  ExecutorService   er = Executors.newSingleThreadExecutor();
  
          Future<Integer> ff= er.submit(c);
          
          System.out.println("Adddtion value is "+ff.get());



              }



}



}






