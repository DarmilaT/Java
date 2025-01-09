package JavaGUI.swing;

import javax.swing.*;
import java.awt.*;
public class gridLayout {
    // A GridLayout object places components in a grid of cells.
    // Each component takes all the available space within its cell, and each cell is exactly the same size.
    public static void main(String[] args){
        JFrame f = new JFrame("Grid Layout");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setSize(500,500);
        f.setLayout(new GridLayout(2,5,20,20));

        f.add(new JButton("0"));
        f.add(new JButton("1"));
        f.add(new JButton("2"));
        f.add(new JButton("3"));
        f.add(new JButton("4"));
        f.add(new JButton("5"));
        f.add(new JButton("6"));
        f.add(new JButton("7"));
        f.add(new JButton("8"));
        f.add(new JButton("9"));

        f.setVisible(true);
    }
}
