package JavaGUI.swing.openNewWindow;

import javax.swing.*;

public class NewWindow {
    JFrame f1 = new JFrame("New window");
    JLabel l = new JLabel();
    NewWindow(){
        l.setBounds(0,0,200,200);
        l.setText("Hi!");
        f1.add(l);
        f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f1.setSize(420,420);
        f1.setLayout(null);
        f1.setVisible(true);
    }

}
