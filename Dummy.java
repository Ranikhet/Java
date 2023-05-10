// synchronized method
class college
{
	synchronized void print(String Faculty)
	{
		for(int i=1;i<=10;i++)
			System.out.println(i+ " class conducted by " +Faculty);
	}
}
class MyThread3 extends Thread
{
	college ci;
	String Faculty;
	public void run()
	{
		ci.print(Faculty);
	}
	MyThread3(college ci,String Faculty)
	{
		this.ci=ci;
		this.Faculty=Faculty;
	}
}
class Dummy {
	public static void main(String[] args) {
		college c1= new college();
		college c2= new college();
		MyThread3 mt1= new MyThread3(c1,"john");
		MyThread3 mt2= new MyThread3(c2,"Alex");
		mt1.start();
		mt2.start();

	}
}
