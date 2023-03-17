
/**
 * @author Kireet
 *
 array of objects using constructor*/
import java.util.*;
class Student1
{
	int roll;
	String name;
	Student1(int roll,String name)
	{
		this.roll=roll;
		this.name=name;
	}
	public void display()
	{
		System.out.println("\t"+roll+"\t"+name);
	}
}
public class Cons2 {
	public static void main(String[] args) 
	{
		int n,i;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number of Students");
		n=sc.nextInt();
		Student1[] st= new Student1[n];	
		for(i=0;i<st.length;i++)
		{
			Scanner  s= new Scanner(System.in);
			System.out.println("enter the student roll no");
			int r=s.nextInt();
			s.nextLine();
			System.out.println("enter the student name");
			String nam= s.nextLine();
			st[i]=new Student1(r,nam);
		}
		System.out.println("\t ---Details are---");
		System.out.println("\trollno\tname");
		//		for(i=0;i<st.length;i++)
		//		{
		//		st[i].display();
		//		}
		for(Student1 o:st)
		{ 
			o.display();
		}
	}
}

