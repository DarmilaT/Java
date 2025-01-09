package JavaGUI.swing;

import javax.swing.*;
import java.awt.*;

public class layeredPane {
    public static void main(String[] args){
        JLabel l1 = new JLabel();
        l1.setOpaque(true);
        l1.setBackground(Color.BLACK);
        l1.setBounds(50,50,200,200);

        JLabel l2 = new JLabel();
        l2.setOpaque(true);
        l2.setBackground(Color.GREEN);
        l2.setBounds(100,100,200,200);

        JLabel l3 = new JLabel();
        l3.setOpaque(true);
        l3.setBackground(Color.BLUE);
        l3.setBounds(150,150,200,200);

        JLayeredPane lp = new JLayeredPane();
        lp.setBounds(0,0,500,500);

//        lp.add(l1, JLayeredPane.DEFAULT_LAYER);
//        lp.add(l2, JLayeredPane.DRAG_LAYER);
//        lp.add(l3, JLayeredPane.POPUP_LAYER);

        lp.add(l1, Integer.valueOf(0));
        lp.add(l2, Integer.valueOf(2));
        lp.add(l3, Integer.valueOf(1));

        JFrame f = new JFrame("JLayered Pane");
        f.add(lp);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setSize(500,500);
        f.setVisible(true);
    }
}
