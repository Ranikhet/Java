import java.util.*;
public class CollStack {
	public static void main(String[] args) {
		Queue<Integer> qu= new LinkedList();
		qu.offer(100); // add the elements in the Queue
		qu.offer(300);
		qu.offer(20);
		qu.offer(500);
		System.out.println(qu);
		qu.poll();
		System.out.println(qu);
		System.out.println(qu.peek());
		System.out.println(qu.size());
//st.push("ram");
//st.push("arun");
//System.out.println(st);
////System.out.println(st.peek());
//System.out.println(st.pop());
//System.out.println(st);
//System.out.println(st.isEmpty());
}
}