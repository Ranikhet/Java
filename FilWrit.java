import java.io.*;
import java.util.*;
public class FilWrit {

	     public static void main(String[] args) throws FileNotFoundException,IOException {
		FileReader fi=null;
		FileWriter fo=null;
	
		try {	

		  fo=new FileWriter("C:\\Users\\Kireet Joshi\\eclipse-workspace\\File\\src\\Target.txt",true); 
			fi = new FileReader("C:\\Users\\Kireet Joshi\\eclipse-workspace\\File\\src\\Hello.txt");
			 int i;
			 String s="";
			 while((i=fi.read())!=-1)
			s= s+Character.toString((char)i);
				 fo.write(s);
				// String s = Integer.toString(i);
				// fo.write(Character.toString((char)i));
			// String s=Character.toString(i)
				 	             
			 
		}
		
		finally
		{
			if(fi!=null)
			{
			fi.close();
			}
			if(fo!=null)
			{	fo.close();}
}
}
}