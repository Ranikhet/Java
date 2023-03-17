
class A
{
 void foo()
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


		B ob=new B();
		ob.foo();
		ob.foo1();
	}
}