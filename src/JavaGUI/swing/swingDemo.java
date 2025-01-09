package JavaGUI.swing;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
public class swingDemo {
    public static void main(String[]args){
        // JFrame - a GUI window to add components to
        /*
        JFrame frame1 = new JFrame("User form"); // create frame
        // default - swing set invisible
        frame1.setVisible(true);
        frame1.setSize(800,400);
        frame1.setLayout(new FlowLayout());
        frame1.setTitle("Register form");
        frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // exit out of application
        frame1.setResizable(true); // prevent frame from being resized
        ImageIcon image = new ImageIcon("logo.jpg"); // create a image icon
        frame1.setIconImage(image.getImage()); // change the icon of the frame
        frame1.getContentPane().setBackground(new Color(48,200,99)); // change the color of background
        frame1.getContentPane().setBackground(new Color(0x488A99));
        frame1.getContentPane().setBackground(Color.CYAN);
        */
        MyFrame frame1 = new MyFrame();
        // username
        JLabel l1 = new JLabel("User name : ");
        frame1.add(l1);
        JTextField t1 = new JTextField(20);
        frame1.add(t1);
        // password
        JLabel l2 = new JLabel();
        l2.setText("Password : ");
        frame1.add(l2);
        JTextField t2 = new JTextField(20);
        frame1.add(t2);
        // submit button
        JButton b1 = new JButton("Submit");
        frame1.add(b1);

        ImageIcon im = new ImageIcon("logo.jpg");
        Border border = BorderFactory.createLineBorder(Color.BLUE);


        l1.setIcon(im);
        l1.setHorizontalTextPosition(JLabel.RIGHT); // set text LEFT,CENTER,RIGHT of imageIcon
        l1.setVerticalTextPosition(JLabel.CENTER); // set text  TOP,CENTER,BOTTOM of imageIcon
        l1.setIconTextGap(25); // set gap of text to icon
        l1.setBorder(border);
        l1.setVerticalAlignment(JLabel.LEFT);
        l1.setHorizontalAlignment(JLabel.CENTER);
        //l1.setBounds(0,0,250,250); // set x,y position in frame and it's dimensions

        l2.setForeground(new Color(48,100,99)); // set color of text
        l2.setFont(new Font("MV Boli", Font.PLAIN, 20)); // set font of text
        l2.setBackground(Color.BLACK); // set background color
        l2.setOpaque(true); // display background color
        frame1.pack();

    }
}
