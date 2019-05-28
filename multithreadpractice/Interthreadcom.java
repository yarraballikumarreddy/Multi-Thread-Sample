package multithreadpractice;

import java.util.ArrayList;
import java.util.List;

class producer implements Runnable {
	List<Integer> arr;

	producer(List<Integer> arr) {
		this.arr = arr;
	}

	public void run() {

		synchronized (arr) {

			for (int i = 0; i < 200; i++) {

				if (arr.size() == 5) {
					try {
						arr.wait();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				} else {
					arr.add(i);
					arr.notify();
				}
			}
		}
	}

}

public class Interthreadcom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> arr = new ArrayList<Integer>();
		
		Thread p = new Thread(new producer(arr));
		Thread c = new Thread(new consumer(arr));
		p.start();
		c.start();

	}

}

class consumer implements Runnable {

	List<Integer> arr;

	consumer(List<Integer> arr) {
		this.arr = arr;
	}

	public void run() {
		synchronized (arr) {

			while (true) {
				if (arr.size() == 0) {
					try {
						arr.wait();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				} else {
					int x = arr.remove(5);
					System.out.println("Consumer consumed-" + x);
					arr.notify();

				}

			}
		}
	}

}
