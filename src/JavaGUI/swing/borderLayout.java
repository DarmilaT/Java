package JavaGUI.swing;

import javax.swing.*;
import java.awt.*;

public class borderLayout {
    //A border layout lays out a container, arranging and resizing
    //its components to fit in five regions: north, south, east, west, and center.
    public static void main(String[] args){
        JFrame frame = new JFrame("Border Layout");
        frame.setLayout(new BorderLayout(10,10)); // margins for every panel 10 pixel of width & height
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500,500);

        JPanel panel1 = new JPanel();
        JPanel panel2 = new JPanel();
        JPanel panel3 = new JPanel();
        JPanel panel4 = new JPanel();
        JPanel panel5 = new JPanel();

        panel1.setBackground(Color.red);
        panel2.setBackground(Color.black);
        panel3.setBackground(Color.blue);
        panel4.setBackground(Color.green);
        panel5.setBackground(Color.yellow);

        panel1.setPreferredSize(new Dimension(100,100));
        panel2.setPreferredSize(new Dimension(100,100));
        panel3.setPreferredSize(new Dimension(100,100));
        panel4.setPreferredSize(new Dimension(100,100));
        panel5.setPreferredSize(new Dimension(100,100));

        // sub panels
        JPanel panel6 = new JPanel();
        JPanel panel7 = new JPanel();
        JPanel panel8 = new JPanel();
        JPanel panel9 = new JPanel();
        JPanel panel10 = new JPanel();

        panel6.setBackground(Color.red);
        panel7.setBackground(Color.black);
        panel8.setBackground(Color.blue);
        panel9.setBackground(Color.green);
        panel10.setBackground(Color.yellow);

        panel5.setLayout(new BorderLayout(5,5));

        panel6.setPreferredSize(new Dimension(50,50));
        panel7.setPreferredSize(new Dimension(50,50));
        panel8.setPreferredSize(new Dimension(50,50));
        panel9.setPreferredSize(new Dimension(50,50));
        panel10.setPreferredSize(new Dimension(50,50));

        panel5.add(panel6,BorderLayout.NORTH);
        panel5.add(panel7,BorderLayout.SOUTH);
        panel5.add(panel8,BorderLayout.WEST);
        panel5.add(panel9,BorderLayout.EAST);
        panel5.add(panel10,BorderLayout.CENTER);

        frame.add(panel1,BorderLayout.NORTH);
        frame.add(panel2,BorderLayout.SOUTH);
        frame.add(panel3,BorderLayout.WEST);
        frame.add(panel4,BorderLayout.EAST);
        frame.add(panel5,BorderLayout.CENTER);
    }
}
