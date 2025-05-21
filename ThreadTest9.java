class Alpha extends Thread
{
	int n;
	Alpha(String str, int x)
	{
		setName(str);
		n=x;
	}
	
	public void run()
	{
		for(int i=1;i<=n;i++)
		{
			System.out.println(getName()+" : "+i);
			try
			{
				Thread.sleep(1000);
			}
			catch(Exception e){}
		}
		System.out.println("End of "+getName());
	}
}

class ThreadTest9
{
	public static void main(String args[])throws Exception
	{
		Alpha t1 = new Alpha("one",5);
		t1.start();
		
		Alpha t2 = new Alpha("Two",10);
		t2.start();
		
		//while(t1.isAlive() || t2.isAlive())
		//{
		//}
		
		t1.join();
		System.out.println("50% job done");
		//t2.stop();
		
		t2.join();
		System.out.println("100% job done");
		
		System.out.println("End of Main");
		
	}
}