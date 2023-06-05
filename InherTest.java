
class A
{
 protected void foo()
	{
		System.out.println("superclass");
	}

}
class B extends A
{ 
	void foo1()
	
	{
		foo();
		System.out.println("childclass");
	
	}
	
}
public class InherTest {
	public static void main(String[] args) {


		A ob=new A();
		ob.foo();//A
	//	ob.foo1();//B
	}
}