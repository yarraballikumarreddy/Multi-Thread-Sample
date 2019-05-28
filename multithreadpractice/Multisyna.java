package multithreadpractice;
import java.util.ArrayList;
import java.util.List;

public class Multisyna {
public static void main(String[] args) {
List<String> arr=new ArrayList<String>();


kumar u=new kumar(arr);
Dha d=new Dha(arr);
Thread t1=new Thread(u);
Thread t2=new Thread(d);
t1.start();

t2.start();


}

}

class kumar implements Runnable{
List<String> arr;
kumar(List<String> arr){
this.arr=arr;
}

public void run() {
for(int i=10;i<15;i++)
{
synchronized (arr)
{
arr.add("i");
System.out.println("add "+i);
}

}
}
}

class Dha implements Runnable{
List<String> arr;
Dha(List<String> arr){
this.arr=arr;
}
@Override
public void run() {

for(int i=0;i<15;i++)
{
arr.remove("i");
System.out.println("remove "+i);
}


}
}

