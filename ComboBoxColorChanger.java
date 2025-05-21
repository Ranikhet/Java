import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ComboBoxColorChanger extends JFrame implements KeyListener {

    JComboBox comboBox;
    JPanel colorPanel;

    public ComboBoxColorChanger() {
        setTitle("Color Changer");
        setSize(400, 250);
        setLayout(new BorderLayout());

        // ComboBox with color names
        String[] colors = { "Red", "Green", "Yellow" };
        comboBox = new JComboBox(colors);
        comboBox.addKeyListener(this);

        // Panel whose background will change
        colorPanel = new JPanel();
        colorPanel.setBackground(Color.WHITE);

        // Add components to frame
        add(comboBox, BorderLayout.NORTH);
        add(colorPanel, BorderLayout.CENTER);

        setVisible(true);
    }

    @Override
    public void keyTyped(KeyEvent e) {
        // Not used
    }

    @Override
    public void keyPressed(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_SPACE) { // Only act when Enter is pressed
                        if (e.getSource()== comboBox) {
                String selectedColor = (String) comboBox.getSelectedItem();

                switch (selectedColor) {
                    case "Red":
                        colorPanel.setBackground(Color.RED);
                        break;
                    case "Green":
                        colorPanel.setBackground(Color.GREEN);
                        break;
                    case "Yellow":
                        colorPanel.setBackground(Color.YELLOW);
                        break;
                    default:
                        colorPanel.setBackground(Color.WHITE);
                }
            }
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
       
    	colorPanel.setBackground(Color.WHITE);
    }

    public static void main(String[] args) {
        new ComboBoxColorChanger();
    }
}