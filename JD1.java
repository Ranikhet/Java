
/**
 * @author Kireet
 *
 */
import java.sql.*;
public class JD1{
	public static void main(String[] args) 
	{
		try
		{
			//Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/secd","root","root"); //attempts to establish a connection to the database by using the given database URL
			System.out.println("connection establised successfully");
			Statement st= con.createStatement();// Creates a Statement object for sending SQL statements to the database.
			ResultSet rs=st.executeQuery("select * from java");
			while(rs.next()) // processing the next record
			{
				System.out.println(rs.setString(1)+" "+rs.setInt(2));

			} 
			con.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();	
		}


	}

}
