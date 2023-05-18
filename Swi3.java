/**
 * @author Kireet
 *
 */

	import java.awt.FlowLayout;
import java.awt.event.*;
	import javax.swing.*;
	public class Swi3 extends JFrame implements ActionListener
	{
		JLabel l1= new JLabel("username");
		JLabel l2= new JLabel("password");
		JButton b1= new JButton("Login");
		JTextField tf1= new JTextField(10);
		JPasswordField tf2= new JPasswordField(10);
		public Swi3()
		{
			add(l1);
			add(tf1);
			add(l2);
			add(tf2);
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
					tf1.setText("");
					tf2.setText("");
				JOptionPane.showMessageDialog(this,"Successful");
				
				}
				else
				{
					tf1.setText("");
					tf2.setText("");
					JOptionPane.showMessageDialog(this,"Try again!!");
			}
				
		}
			}
		
		public static void main(String [] args)
		{
			Swi3 o= new Swi3();	
		}
		
	}

