package JavaGUI.swing;

import javax.swing.*;
import java.awt.*;
public class MyFrame extends JFrame {
    MyFrame(){
        this.setVisible(true);
        this.setSize(300,300);
        this.setLayout(new FlowLayout());
        this.setTitle("Register form");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // exit out of application
        this.setResizable(true); // prevent frame from being resized
        ImageIcon image = new ImageIcon("logo.jpg"); // create a image icon
        this.setIconImage(image.getImage()); // change the icon of the frame
        this.getContentPane().setBackground(new Color(48,200,99)); // change the color of background
    }
}
