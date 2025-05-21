import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

class DialogFrame3 extends JFrame implements ActionListener 
{
	JButton b1;
	Container c;
	
	DialogFrame3()
	{
		setTitle("DialogFrame3");
		c = getContentPane();
		c.setLayout(new FlowLayout());
		
		b1 = new JButton("Show");
		c.add(b1);
		b1.addActionListener(this);
		
		setSize(400,400);
		setLocation(100,100);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public void actionPerformed(ActionEvent ae)
	{
		int x = JOptionPane.showConfirmDialog(this,"Are You Sure","Confirm",JOptionPane.OK_CANCEL_OPTION);
		
		if(x== JOptionPane.YES_OPTION)
		{
			setTitle("YES");
		}
		if(x== JOptionPane.NO_OPTION)
		{
			setTitle("NO");
		}
		if(x== JOptionPane.CANCEL_OPTION)
		{
			setTitle("CANCEL");
		}
		
		
	}

	public static void main(String args[])
	{
		new DialogFrame3();
	}

}
