package multithreadpractice;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class Blockingqueexam {

	public static void main(String[] arg) {
		BlockingQueue<Integer> bq = new ArrayBlockingQueue<Integer>(10);
		Thread t1 = new Thread(new producer1 (bq));
		Thread t2 = new Thread(new consumer1(bq));
		t1.start();
		t2.start();

	}
}

 class producer1 implements Runnable
{

	BlockingQueue<Integer> bq = null;
	private int i =0 ;
	public producer1 (BlockingQueue<Integer> bq) {
		this.bq=bq;
		for(int i=0;i<10;i++) {
			System.out.println(i);
		}

	}

	@Override
	public void run() {
		 while (true){
			 try {
				producer(i++);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			 
			 
		 }
		
	}

	
	private void producer(int j) throws InterruptedException {
		System.out.println("producer produce product ==="+i);
		bq.put(i);
		
	}
	
}


 
 class consumer1 implements Runnable
 {

 	BlockingQueue<Integer> bq = null;
 	private int i =0 ;
 	
 	public consumer1 (BlockingQueue<Integer> bq) {
 		this.bq=bq;
 		
 	}

 	@Override
 	public void run() {
 		 while (true){
 			 try {
 				consumer();
 			} catch (InterruptedException e) {
 				// TODO Auto-generated catch block
 				e.printStackTrace();
 			}
 			 
 			 
 		 }
 		
 	}

 	
 	private void consumer () throws InterruptedException {
 		
 		System.out.println( "consume thread" +bq.take());
 		Thread.sleep(1000);
 		
 	}
 	
 }



