package multithreadpractice;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Executorcatchpool {

	public static void main(String[] args) {

		ExecutorService service = Executors.newCachedThreadPool();

		for (int i = 0; i <= 10; i++)
		{

			service.execute(new CatchDemo("task no: " + i));

			System.out.println(i);
		}

	}

}

class CatchDemo implements Runnable {

	String task;

	public CatchDemo(String t) {
		task = t;
	}

	public void run() {

		System.out.println(task + "     " + Thread.currentThread().getName());

	}

}
