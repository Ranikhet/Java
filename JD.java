/**
 Demonstration of jdbc connection
 * @author Kireet
 *
 */
import java.sql.*;
public class JD {
	public static void main(String[] args) {
		try
		{
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/kireet","root","root"); //attempts to establish a connection to the database by using the given database URL
			System.out.println("connection establised successfully");
		}
		    catch(Exception e)
		{
			e.printStackTrace();	
		}
	}

}
