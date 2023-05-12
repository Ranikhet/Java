/**
 * @author Kireet
 *
// using runnable interface
 */

class Mythread5 implements Runnable
{
	public void run()
	{
		for(int i=1;i<=100;i++)
		{
			System.out.println("this is child thread");
		}
		
	}
	
}
public class Dim {
public static void main(String[] args) {
	Mythread5 mt5= new Mythread5();
	Thread tt1=new Thread(mt5);
	tt1.start();
	for(int i=1;i<=50;i++)
	{
		System.out.println("this is main thread");
	}
}
}
