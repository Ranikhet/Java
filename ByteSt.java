import java.io.*;
import java.util.*;
public class ByteSt {

	     public static void main(String[] args) throws IOException  {
		FileInputStream fi=null;
		//FileOutputStream fo=null;
		try {	
int i;
		  //fo=new FileOutputStream("C:\\Users\\Kireet Joshi\\eclipse-workspace\\File\\src\\Target.txt"); 
			fi = new FileInputStream("C:\\Users\\Kireet Joshi\\eclipse-workspace\\File\\src\\Hello.txt");
			 while((i=fi.read())!=-1)
		      System.out.print((char)i);
				
		}
		finally
		{
			if(fi!=null)
			{
			fi.close();
			}
		
}
}}
