import java.util.*;
 class Gen<K,V> {
	K ob1;
	V ob2;
	Gen(K ob1, V ob2)
	{
		this.ob1=ob1;
		this.ob2=ob2;
	}

	public void getOb()
	{
		System.out.println(ob1);
		System.out.print(ob2);
	}
	
	void show()
	{
		System.out.println("class name is "+ob1.getClass().getName());
		System.out.println("class name is "+ob2.getClass().getName());
	}
}
 public class Main
 {
	public static void main(String[] args) {
		
		Gen<String,Integer> g1= new Gen<>("Rohan",10);
	//	System.out.println(g1.getOb());
		g1.show();
		g1.getOb();
	}

}
