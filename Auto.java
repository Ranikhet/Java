public class Auto {
public static void main(String[] args) {
	int x=10;
	//System.out.println("before converting to its corresponding object "+x);
    //Integer i= Integer.valueOf(x);// explicit conversion of primitive to wrapper 
  // System.out.println("Explicit conversion of primitive to wrapper object "+i);
   Integer k= x; // compiler automatically converts since Java 5 onwards
   System.out.println("implicit conversion of primitive to wrapper object "+k); 
}
}