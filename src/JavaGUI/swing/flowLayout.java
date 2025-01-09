package JavaGUI.swing;

import javax.swing.*;
import java.awt.*;

public class flowLayout {
    public static void main(String[] args){
        JFrame f = new JFrame("Flow Layout");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setSize(500,500);
        f.setLayout(new FlowLayout(FlowLayout.CENTER));

        JPanel p = new JPanel();
        p.setPreferredSize(new Dimension(200,250));
        p.setBackground(Color.BLACK);
       // p.setLayout(new FlowLayout(FlowLayout.CENTER,10,10));

        p.add(new JButton("0"));
        p.add(new JButton("1"));
        p.add(new JButton("2"));
        p.add(new JButton("3"));
        p.add(new JButton("4"));
        p.add(new JButton("5"));
        p.add(new JButton("6"));
        p.add(new JButton("7"));
        p.add(new JButton("8"));
        p.add(new JButton("9"));

        f.add(p);
        f.setVisible(true);
    }
}
