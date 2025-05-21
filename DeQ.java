import java.util.*;
public class DeQ 
{
	public static void main(String[] args) {
		Deque<Integer> st= new ArrayDeque<>();
		st.add(100);
		st.offer(1000);
		st.addFirst(20);
		st.offerFirst(1);
		st.add(10);
		st.offerLast(5);
	    // st.poll();
		//System.out.println(st);
		st.push(10);
		st.poll();
		System.out.println(st);
    Iterator<Integer> it=st.iterator();
while(it.hasNext())
	System.out.println(it.next());
	}
}
