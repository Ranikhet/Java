// Implementation of  Set Interface via and HashSet ,LinkedHashSet class
import java.util.*;
public class Coll3 {

		public static void main(String[] args)
		{
			// Demonstrating Set using HashSet
			// Declaring object of type String
			//Set st = new HashSet();
			Set<Integer> st = new LinkedHashSet();
			//Set st1 = new HashSet();
//			st1.add("hello");
//			st1.add("graphic");
			// Adding elements to the Set
			// using add() method
			st.add(30);
			st.add(100);
			st.add(100);
			st.add(100);
			st.add(400);
			st.add(20);
			st.add(200);
			//st.add(1);
			st.add(1);
			//st.addAll(st1);
	//	st.removeAll(st);
			//.clear();
            //st.remove(20);
			// Printing elements of HashSet object
			System.out.println(st);
			
			//Iterator<Integer> ite = st.iterator();

//	        System.out.print("LinkedHashSet using Iterator: ");
for(Object x:st)
	System.out.println(x);


	        // Accessing elements
//	        while(ite.hasNext()) {
//	            System.out.print(ite.next());
//	            System.out.print(", ");
//	}
		
			 
	}
		
}

