/**
 * @author Kireet
 *
 */
import java.awt.*;
import java.awt.event.*;
public class WinEvent extends Frame implements WindowListener 
{
	Label l= new Label("name");
	Button b= new Button("click me");
	TextField tf= new TextField(15);
	WinEvent()
	{
	add(l);
	add(tf);
	add(b);
	setLayout(new FlowLayout());
    setSize(250,100);
    setVisible(true);
    addWindowListener(this);
 
	}
	
	
	@Override
	public void windowOpened(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void windowClosing(WindowEvent e) {
		// TODO Auto-generated method stub
		dispose();
	
		
	}


	@Override
	public void windowClosed(WindowEvent e) {
		System.out.println("closed");
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


	public static void main(String[] args) {
		WinEvent we= new WinEvent();
	}
	
}