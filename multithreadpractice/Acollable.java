/*package multithreadpractice;

public class Acollable {

}



package multithreadpractice;

import java.util.concurrent.Callable;

public class Callabletest implements Callable {
int a,b,c;
Callabletest(int a,int b){
this.a=a;
this.b=b;
}
@Override
public Object call() throws Exception {
c=a+b;
System.out.println(Thread.currentThread().getName());
return c;

}

}

                                            package com.reg.multithreading;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Callabletestmain {

public static void main(String[] args) throws InterruptedException, ExecutionException {
Callabletest c=new Callabletest(10, 20);
Callabletest c1=new Callabletest(30, 40);
Callabletest c2=new Callabletest(100, 600);
ExecutorService p=Executors.newFixedThreadPool(10);
Future<Integer>f1=p.submit(c);
System.out.println(f1.get());
Future<Integer>f2=p.submit(c1);
System.out.println(f2.get());
Future<Integer>f3=p.submit(c2);
System.out.println(f3.get());



}

}

 

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExcecuterServicetest {
public static void main(String[] args) {

ExecutorService service = Executors.newFixedThreadPool(9);

for (int i = 0; i <= 10; i++) {

service.execute(new CatchDemo("task- " + i));

}

}

}

class ExcecuterServicetest1 implements Runnable {

String task;

public ExcecuterServicetest1(String t) {
task = t;
}

public void run() {

System.out.println(task + "                 " + Thread.currentThread().getName());

}

}
*/


