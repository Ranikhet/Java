
/**
 * @author Kireet
 *
 */
import java.sql.*;
import java.util.*;
public class JD2{
	public static void main(String[] args) 
	{
		try
		{
			Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/Kireet","root","root"); //attempts to establish a connection to the database by using the given database URL
			System.out.println("connection establised successfully");
			//Statement st= con.createStatement();// Creates a Statement object for sending SQL statements to the database.
			PreparedStatement st1= conn.prepareStatement("insert into data values(?,?)");
			//ResultSet rs=st.executeQuery("select * from java");
			Scanner sc= new Scanner(System.in);
			while(true) // processing the next record
			{
				System.out.println("enter name");
				String name=sc.next();
				System.out.println("enter id");
				int id=sc.nextInt();			
				st1.setString(1,name);
				st1.setInt(2,id);
				int y=st1.executeUpdate();
				System.out.println(y+ "Records updated Successfully");
		System.out.println("want to enter more...?");
		String ch= sc.next();
				if(ch.equalsIgnoreCase("no"))
					break;
			}
conn.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();	
		}
		
	}
}
