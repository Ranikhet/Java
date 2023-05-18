import java.awt.FlowLayout;
import java.awt.event.*;
import javax.swing.*;
public class Swi2 extends JFrame implements ActionListener
{
	JLabel l1= new JLabel("username");
	JLabel l2= new JLabel("password");
	JButton b1= new JButton("Login");
	JTextField tf1= new JTextField(10);
	JTextField tf2= new JTextField(10);
	JTextField tf3= new JTextField(10);
	public Swi2()
	{
		add(l1);
		add(tf1);
		add(l2);
		add(tf2);
		add(tf3);
		add(b1);
		setVisible(true);
		setSize(400,300);
		setLayout(new FlowLayout(FlowLayout.LEFT,150,10));
		b1.addActionListener(this);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	@Override
	public void actionPerformed(ActionEvent e) 
	{
		// TODO Auto-generated method stub
		String a= tf1.getText();
		String b= tf2.getText();
		if(e.getSource()==b1)
		{
			if(a.equals("admin")&& b.equals("pass"))
			{
				tf3.setText("Success");
			}
			else
			{
				tf3.setText("Try again!!");
		}
	}
		}
	public static void main(String [] args)
	{
		Swi2 o= new Swi2();	
	}
}