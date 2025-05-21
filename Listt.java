import java.util.*;

public class Listt {
	public static void main(String[] args) {

		List<Integer> list = new ArrayList<>();
		list.add(200);
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(1,400);
		list.add(30);
		Collections.sort(list);
	list.forEach(System.out::println); // lamba expression using stream API
	}}
//		list.remove(Integer.valueOf(30));
//		list.set(2,2000);// replace
//		//  list.add("hello");
//		// System.out.println(list);
//		List<Integer> list1 = new ArrayList<>();
//		list1.add(350);
//		list1.add(1000);
//		list.addAll(list1);
//		System.out.println(list);
//		Collections.sort(list);
//		System.out.println(list);
//		System.out.println(list.get(1));
		//for(int i=0;i<list.size();i++)
		//{
		//System.out.println(list.get(i));
		//}

		//for(Integer k:list) // advance for loop(foreach loop)
		//System.out.println(k);
		//list.forEach(System.out::println); // lambda expression stream API
		//Iterator<Integer>it=list.iterator(); // iterator
		//while(it.hasNext())
		//System.out.println(it.next());
	//}}
