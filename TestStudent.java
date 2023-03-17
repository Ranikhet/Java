/**
 * @author Kireet
 *
  demonstration of array of objects*/
import java.util.*;
class Student
{
	private int roll;
	private String name;
	public void getData()
	{

		Scanner sc= new Scanner(System.in);
		System.out.println("enter roll no");
		this.roll=sc.nextInt();
		sc.nextLine();
		System.out.println("enter name");
		this.name=sc.nextLine();

	}

	void displayData()
	{

		System.out.println("\t"+this.roll+"\t"+this.name);
		//System.out.println("name is "+this.name);
	}
}
public class TestStudent {

	public static void main(String[] args) {

		Scanner s= new Scanner(System.in);
		System.out.println("Enter how many students");
		int n= s.nextInt();
		Student st[]= new Student[n];// array of references
		for(int i=0;i<n;i++)
		{
			st[i]=new Student();// object create
			st[i].getData();
		}
		System.out.println("----Details of student----");
		System.out.println("\tRollno\tName");
//		for(int i=0;i<st.length;i++)
//		{
//			st[i].displayData();
//
//		}
	for(Student o:st)// for each loop or enhanced loop
	{
	o.displayData();
	}
	
}}

