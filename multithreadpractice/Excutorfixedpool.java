package multithreadpractice;


import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;


public class Excutorfixedpool {

public static void main(String[] args) {

ExecutorService service   = Executors.newFixedThreadPool(5);


for(int i=0;i<24;i++) {

service.execute(new Fixedpool());

System.out.println(i);
}



}

}
class Fixedpool implements Runnable {


public void run() {

System.out.println(Thread.currentThread().getName());


}
}

