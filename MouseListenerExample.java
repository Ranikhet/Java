import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
public class MouseListenerExample extends JFrame implements MouseListener {

    JButton button;

    public MouseListenerExample() {
        // Create frame
        setTitle("MouseListener Example");
        setSize(300, 200);
       // setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        // Create button
        button = new JButton("Click Me");
        button.setBounds(80, 60, 140, 40);
        button.addMouseListener(this); // Register mouse listener
        add(button);

        setVisible(true);
    }

    // MouseListener methods
    public void mouseClicked(MouseEvent e) {
        System.out.println("Mouse Clicked");
    }

    public void mousePressed(MouseEvent e) {
        System.out.println("Mouse Pressed");
    }

    public void mouseReleased(MouseEvent e) {
        System.out.println("Mouse Released");
    }

    public void mouseEntered(MouseEvent e) {
        System.out.println("Mouse Entered");
    }

    public void mouseExited(MouseEvent e) {
        System.out.println("Mouse Exited");
    }

    public static void main(String[] args) {
        new MouseListenerExample();
    }
}