import java.awt.*;

class ButtonFrame1 extends Frame
{
	Button b1,b2,b3,b4,b5;
	
	ButtonFrame1()
	{
		setTitle("Button Frame1");

		setLayout(new FlowLayout(FlowLayout.LEFT));
		
		
		b1 = new Button("Button : 1");
		b2 = new Button("Button : 2");
		b3 = new Button("Button : 3");
		b4 = new Button("Button : 4");
		b5 = new Button("Button : 5");
		add(b1);add(b2);add(b3);add(b4);add(b5);
		
		setSize(400,400);
		//pack();
		//setResizable(false);
		setLocation(100,200);
		setVisible(true);
	}
	public static void main(String args[])
	{
		new ButtonFrame1();
	}
}