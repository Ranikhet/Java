import java.awt.*;

class FrameTest1
{
	public static void main(String args[])
	{
		Frame f = new Frame();
		f.setTitle("Window Application");
		
		Toolkit tk = Toolkit.getDefaultToolkit();
		
		Dimension d = tk.getScreenSize();
		
		//f.setSize(d);
		
		//f.setSize(Toolkit.getDefaultToolkit().getScreenSize());
		
		
		f.setSize(400,400);
		
		int x = (d.width-400)/2;
		int y = (d.height-400)/2;
		
		f.setLocation(x,y);
		
		f.setVisible(true);
	}
}