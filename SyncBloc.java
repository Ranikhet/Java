// synchronized block
class college1
{
	 void print(String Faculty)
	{

		 synchronized(college1.class)
	{
		 for(int i=1;i<=10;i++)
			System.out.println(i+ " class conducted by " +Faculty);
	}
}
}
class MyThread4 extends Thread
{
	college1 ci;
	String Faculty;
	public void run()
	{
ci.print(Faculty);
	}
	MyThread4(college1 ci,String Faculty)
	{
  this.ci=ci;
  this.Faculty=Faculty;
	}
}
class SyncBloc {
	public static void main(String[] args) {
		college1 c1= new college1();
		college1 c2= new college1();
		MyThread4 mt1= new MyThread4(c1,"john");
		MyThread4 mt2= new MyThread4(c2,"Alex");
		mt1.start();
		mt2.start();

	}
}