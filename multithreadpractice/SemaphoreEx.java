package multithreadpractice;

import java.util.concurrent.Semaphore;

public class SemaphoreEx implements Runnable {

	static Semaphore sem = new Semaphore(2);

	public void run() 
	{
		try {
			sem.acquire();
			for (int i = 0; i < 20; i++)
			{
				System.out.println(Thread.currentThread().getName() + "----------" + i);
			}

		} catch (InterruptedException e) {
// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			sem.release();
		}

	}

	public static void main(String[] args) {
		for (int i = 0; i < 20; i++) {
			SemaphoreEx s = new SemaphoreEx();
			Thread t = new Thread(s);
			t.start();
		}
	}
}
