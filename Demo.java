
//Thread creation using Thread class to run our task

class MyThread extends Thread 
{
	public void run()
	{
		for(int i=0;i<10;i++)
		{
			System.out.println("im a child thread");

		}
	}
}
public class Demo
{
	public static void main(String[] args) 
	{
		MyThread ob= new MyThread();
		ob.start();
		for(int i=0;i<=5;i++)
		{
			System.out.println("Im main thread");

		}
	}
}
