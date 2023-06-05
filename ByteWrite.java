import java.io.*;
import java.util.*;
public class ByteWrite {

	     public static void main(String[] args) throws FileNotFoundException,IOException {
		FileInputStream fi=null;
		FileOutputStream fo=null;
	
		try {	

		  fo=new FileOutputStream("C:\\Users\\Kireet Joshi\\eclipse-workspace\\File\\src\\Target.txt",true); 
			fi = new FileInputStream("C:\\Users\\Kireet Joshi\\eclipse-workspace\\File\\src\\Hello.txt");
			 int i;
			 //fo.write(System.lineSeparator());
			 while((i=fi.read())!=-1)
				
				 fo.write(+(char)i);
			 
			 
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