/**
 * @author Kireet
 *
// frame container
 */
import java.awt.*;
public class FirstFrame {

	public static void main(String[] args) {
	Frame f= new Frame("First Frame");
	Label l= new Label("Name");
	Button b = new Button("Click me");
	TextField ta= new TextField(10);
	f.add(l);
	f.add(ta);
	f.add(b);
    f.setSize(300,400);
    f.setLayout(new FlowLayout());
    f.setVisible(true);
	}
}
