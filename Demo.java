
class Gen1<P>
{
	P ob;
	Gen1(P ob)
	{
		this.ob=ob;
	}
	public P get()
	{
		return ob;
	}
	public void display()
	{
		
System.out.println("name of class "+ob.getClass().getName());		
	}
}

public class Demo {
public static void main(String[] args) {
	Gen1<Boolean> g= new Gen1<>(false);
	g.display();
System.out.println(g.get());
	
}
}
