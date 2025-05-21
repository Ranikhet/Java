 import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

class GridLayoutDemo extends JFrame implements ActionListener {
	JLabel one, two, three, four;
	JTextField tname, tsalary, tcode, tdesig;
	JButton buttonSave, buttonExit, buttonReset;

	GridLayoutDemo() {
		setTitle("Employee Entry Form");
		setLayout(new BorderLayout());

		JPanel p1 = new JPanel(new GridLayout(4, 2));
		JPanel p2 = new JPanel(new FlowLayout());
		p1.setBackground(Color.magenta);
		p2.setBackground(Color.green);
		one = new JLabel("NAME");
		tname = new JTextField(20);
		two = new JLabel("CODE");
		tcode = new JTextField(20);
		three = new JLabel("DESIGNATION");
		tdesig = new JTextField(20);
		four = new JLabel("SALARY");
		tsalary = new JTextField(20);

		buttonSave = new JButton("SAVE");
		buttonReset = new JButton("RESET");
		buttonExit = new JButton("EXIT");

		buttonSave.addActionListener(this);
		buttonReset.addActionListener(this);
		buttonExit.addActionListener(this);

		p1.add(one); p1.add(tname);
		p1.add(two); p1.add(tcode);
		p1.add(three); p1.add(tdesig);
		p1.add(four); p1.add(tsalary);

		p2.add(buttonSave);
		p2.add(buttonReset);
		p2.add(buttonExit);

		add(p1, BorderLayout.NORTH);
		add(p2, BorderLayout.SOUTH);

		setSize(400, 200);
		setVisible(true);
	}

	public void actionPerformed(ActionEvent ae)
	{

		String emp_name, emp_desig;
		int emp_code = 0, emp_sal = 0;
		String  str = ae.getActionCommand();

		if (str.equals("RESET"))
		{
			tname.setText("");
			tcode.setText("");
			tdesig.setText("");
			tsalary.setText("");
			return;
		}

		if (str.equals("EXIT"))
		{
			System.exit(0);
		}

		if (str.equals("SAVE"))
		{
			emp_name = tname.getText().trim();
			emp_desig = tdesig.getText().trim();
			String codeText = tcode.getText().trim();
			String salText = tsalary.getText().trim();

			if (emp_name.equals("") || codeText.equals("") || emp_desig.equals("") || salText.equals("")) {
				JOptionPane.showMessageDialog(this, "All fields must be filled.");
				return;
			}

			try {
				emp_code = Integer.parseInt(codeText);
				emp_sal = Integer.parseInt(salText);
			} catch (NumberFormatException e) {
				JOptionPane.showMessageDialog(this, "CODE and SALARY must be numeric.");
				return;
			}

			try {
				PreparedStatement inst;
				Connection conn;

				conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/kireet", "root", "root");
				inst = conn.prepareStatement("INSERT INTO employee VALUES(?,?,?,?)");
				inst.setString(1, emp_name);
				inst.setInt(2, emp_code);
				inst.setString(3, emp_desig);
				inst.setInt(4, emp_sal);
				int n = inst.executeUpdate();
				if (n > 0)
					System.out.println("Record Inserted");
				else
					System.out.println("Record Not Inserted");
				inst.close();
				conn.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

}
public class EmpRecord {
	public static void main(String[] args) {
		new GridLayoutDemo();
	}
}
