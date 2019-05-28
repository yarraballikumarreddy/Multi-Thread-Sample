package multithreadpractice;



class counter  extends Thread {
	private volatile boolean counting = true;
	//private int counter =1;
	
	public void run () {
		//while (counting )
		
			for(int i=1;i<=10;i++)
			
		{
			System.out.println( i);
			i ++ ;
		}
	}
	
//	public void  stopcounting() {
	//	counting =false ;
		
		
		
		
	//}
	
}


public class Volatile {
	
	public static void main(String arg []) {
		counter c = new counter ();
		c.start();
		
		
		//Scanner stopCount = new Scanner(System.in);
		//stopCount.nextLine();
		//c.stopcounting();
		 
	}
	

}
