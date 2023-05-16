/**
 * @author Kireet
 *
 */
import java.awt.FlowLayout;
import java.awt.event.*;
import javax.swing.*;
public class Swi extends JFrame implements ActionListener
{
JLabel l1= new JLabel("Enter number 1");
JLabel l2= new JLabel("Enter number 2");
JLabel l3= new JLabel("Sum ");
JButton b= new JButton("ADD");
JTextField tf1= new JTextField(10);
JTextField tf2= new JTextField(10);
JTextField tf3= new JTextField(10);
public Swi()
{
	add(l1);
	add(tf1);
	add(l2);
	add(tf2);
	add(l3);
	add(tf3);
	add(b);
	setVisible(true);
	setSize(400,300);
    setLayout(new FlowLayout(FlowLayout.LEFT,150,10));
	b.addActionListener(this);
	setDefaultCloseOperation(EXIT_ON_CLOSE);
}

@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	int a= Integer.parseInt(tf1.getText());
	int b= Integer.parseInt(tf2.getText());
	int c=a+b;
	tf3.setText(String.valueOf(c));
}
public static void main(String[] args) {
	Swi ob= new Swi();
}
}
 
