import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ItemListenerExample extends JFrame implements ItemListener {

    JCheckBox checkBox;
    JLabel label;

    public ItemListenerExample() {
        // Set up the JFrame
        setTitle("ItemListener Example");
        setSize(550, 350);
               setLayout(new FlowLayout());

        // Create a checkbox and label
        checkBox = new JCheckBox("Show Message");
        label = new JLabel("Checkbox is unchecked");

        // Add item listener to checkbox
        checkBox.addItemListener(this); // component is registered

        // Add components to frame
        add(checkBox);
        add(label);

        // Make the frame visible
        setVisible(true);
    }

    // Override itemStateChanged method
    public void itemStateChanged(ItemEvent e) {
       if(e.getSource()==checkBox)
       {
    	if (checkBox.isSelected()) {
            label.setText("Checkbox is checked");
        } else {
            label.setText("Checkbox is unchecked");
        }
    }}
    

    // Main method
    public static void main(String[] args) {
        new ItemListenerExample();
    }
}
