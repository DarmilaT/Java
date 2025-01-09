package JavaGUI.swing;

import javax.swing.*;
import java.awt.*;
import static java.awt.Image.SCALE_SMOOTH;

public class panel {
    public static void main(String[] args){
        // JPanel - It is a container that can store a group of components.
        ImageIcon im = new ImageIcon("lv.jpg");
        // Resize the imageIcon
        Image image = im.getImage(); // transform it
        Image newImg = image.getScaledInstance(50, 50, SCALE_SMOOTH); // scale it the smooth way
        im = new ImageIcon(newImg);  // transform it back
        JLabel label = new JLabel("Hello");
        label.setIcon(im);
        //for setLayout
        //label.setHorizontalAlignment(JLabel.LEFT);
        //label.setVerticalAlignment(JLabel.BOTTOM);
        label.setBounds(0,10,50,50);

        JPanel redPanel = new JPanel();
        redPanel.setBackground(Color.red);
        redPanel.setBounds(0,0,250,250);
        redPanel.setLayout(null); // to adjust the label in the panel

        JPanel bluePanel = new JPanel();
        bluePanel.setBackground(Color.blue);
        bluePanel.setBounds(250,0,500,250);
        bluePanel.setLayout(new BorderLayout());

        JPanel greenPanel = new JPanel();
        greenPanel.setBackground(Color.green);
        greenPanel.setBounds(0,250,750,750);

        JFrame frame = new JFrame();
        frame.setSize(750,750);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        redPanel.add(label);
        frame.add(redPanel);
        frame.add(bluePanel);
        frame.add(greenPanel);
    }
}
