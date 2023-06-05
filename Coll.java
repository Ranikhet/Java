
import java.util.*;
public class Coll {
public static void main(String[] args)
{
	List v= new ArrayList();
	v.add(10);
	v.add(20);
	v.add(40);
	v.add(2,30);
	System.out.println(v);
	//Collections.sort(v);
	//v.add("hello");
	/*Iterator i=v.iterator();
	while(i.hasNext())
	{
		System.out.println(i.next());
	}*/
	for( Object x: v)
	{
		System.out.println(x);
	}
}
}
