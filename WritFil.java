import java.io.*;
import java.util.*;
public class WritFil {

	     public static void main(String[] args) throws FileNotFoundException,IOException {
		FileReader fi=null;
		FileWriter fo=null;
	
		try {	

		  fo=new FileWriter("C:\\Users\\Kireet Joshi\\eclipse-workspace\\File\\src\\Target.txt",true); 
			fi = new FileReader("C:\\Users\\Kireet Joshi\\eclipse-workspace\\File\\src\\Hello.txt");
			 int i;
		
			 while((i=fi.read())!=-1)
	
				 fo.write((char)i);
			 	             
			 
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