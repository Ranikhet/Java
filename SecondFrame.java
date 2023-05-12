/**
 * @author Kireet
 *
// frame container,Event handling,Listeners
 */
import java.awt.*;
import java.awt.event.*;
public class SecondFrame extends Frame implements WindowListener,ActionListener 
{
	Label lb = new Label("Email");
	TextField t = new TextField(20);
	Button bt = new Button("Click me");
	public SecondFrame()
	{
		add(lb);
		add(t);
		add(bt);
		setVisible(true);
		setSize(400,300);
		setLayout(new FlowLayout());
		addWindowListener(this); // object registered
		bt.addActionListener(this);
			}
	public static void main(String[] args) 
	{

		SecondFrame sc= new SecondFrame();
	}
	@Override
	public void windowOpened(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void windowClosing(WindowEvent e) {
		// TODO Auto-generated method stub
		dispose();
		System.out.println("window closed");
	}
	@Override
	public void windowClosed(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void windowIconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void windowDeiconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void windowActivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void windowDeactivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		t.setText("Graphic");
		
	}}
