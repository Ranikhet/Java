
class MyThread2  implements Runnable
{
	public void run()
	{
		for(int i=0;i<10;i++)
		{
			System.out.println("my thread");
		}
	}
}
public class Test {
public static void main(String[] args) {
	MyThread2 ot= new MyThread2();
    Thread t= new Thread(ot);   
	t.start();
	for(int i=0;i<10;i++)
	{
		System.out.println("main thread");
	}
}
}
