
import java.sql.*;
public class EmpRetrieve {
	public static void main(String[] args) throws SQLException {
		Connection conn;
		Statement stmt;
		ResultSet rs=null;

		try {
			//  Connect to the database
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/kireet", "root", "root");

			//  Create a statement
			stmt = conn.createStatement();

			// Execute query
			//String sql = "SELECT * FROM employee";
			rs = stmt.executeQuery("SELECT * FROM employee");

			// Print the records
			System.out.println("Employee Records:");
			System.out.println("-----------------------------------------------------------------");
			System.out.printf("%-20s %-6s %-25s %-7s\n", "Name", "Code", "Designation", "Salary");
			System.out.println("-----------------------------------------------------------------");

			while (rs.next()) {
				String name = rs.getString("emp_name");
				int code = rs.getInt("emp_code");
				String desig = rs.getString(3);
				int salary = rs.getInt(4);

				System.out.printf("%-20s %-6d %-25s %-7d\n", name, code, desig, salary);
			}
		} 
		catch (SQLException e)
		{
			System.out.println("Database Error: " + e.getMessage());
			e.printStackTrace();
		} 
		finally 
		{
			//Clean up operation

			rs.close();

		}
	}}
