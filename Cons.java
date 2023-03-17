/**
 * @author Kireet
 *demonstration of constructor
 */

class Coons {
	int x; // instance variable
 Coons()
	{  
	//this();
	 System.out.println("hello");
		
		//this(10);
	}
	Coons(int x)
	{ 
		//this(10);
		this.x=x;
		System.out.println(this.x);
	}
}
class Cons
{
	public static void main(String[] args) {
		Coons con= new Coons(10);
		//Coons con1= new Coons();
	}
}


