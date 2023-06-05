import java.util.*;
public class CollList {
public static void main(String[] args)
{
	List v= new ArrayList();
	v.add(10); // add the elemnts in the list
	v.add(200);
	v.add(40);
	v.add(50);
	v.add(600);
	v.add(600);
v.add(400);
v.add("hello");
	System.out.println(v);
	List newlist = new ArrayList();
	newlist.add(800);
newlist.add(340);
System.out.println(newlist);
		v.addAll(newlist);
//System.out.println(v);
//System.out.println(v.get(2));
//v.remove(3);
////System.out.println(v);
//		v.remove(Integer.valueOf(600));
//	v.add(2,300);
	//v.set(2, 220);
		System.out.println(v);
	//v.set(2,1000);
	//System.out.println(v.contains(220));
v.clear();
System.out.println(v);
//	
//Collections.sort(v);
//System.out.println(v.size());
//v.add("hello");
//System.out.println(v);
	//System.out.println(v);
//	for(int i=0;i<v.size();i++)
//	System.out.println("simple traversal "+v.get(i));
//	Iterator<Integer> i=v.iterator();
//	while(i.hasNext())
//	{
//		System.out.println(i.next());
//	}
	for(Object x: v)
{
		System.out.println("via for each loop "+x);
	}
}
}
