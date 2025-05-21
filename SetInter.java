import java.util.*;
public class SetInter {
	public static void main(String[] args) {
		Set<Integer> st= new TreeSet<>();
		st.add(20);
		st.add(210);
		st.add(2);
		st.add(20);
		st.add(120);
		st.add(20);
		//st.remove(20);
		System.out.println(st);
		st.forEach(System.out::println); // lamda expression
//		for(Integer i : st)
//			System.out.println(i);
//		Iterator<Integer> it=st.iterator();
//		while(it.hasNext())
//			System.out.println(it.next());
	}

}
