package multithreadpractice;
import java.util.ArrayList;
import java.util.List;

public class InterThreadingCommunicationApp {

public static void main(String[] args) {

List<Integer> arr = new ArrayList<Integer>();

Producer p = new Producer(arr);
Consumer c = new Consumer(arr);

p.start();
c.start();
}

}

class Producer extends Thread {

List<Integer> add;

Producer(List<Integer> arr) {

this.add = arr;
}

public void run() {

synchronized (add) {

for (int i = 0; i <= 50; i++) {

if (add.size() == 3) {

try {
add.wait();
} catch (InterruptedException e) {

e.printStackTrace();
}

} else {

add.add(i);
add.notify();

}

}
}
}

}

class Consumer extends Thread {

List<Integer> Remove;

Consumer(List<Integer> arr) {

this.Remove = arr;
}

public void run() {

synchronized (Remove) {

while (true) {
if (Remove.size() == 0) {

try {
Remove.wait();
} catch (InterruptedException e) {

e.printStackTrace();
}

} else {

int x = Remove.remove(0);
System.out.println(x);
Remove.notify();
}

}
}
}

}
