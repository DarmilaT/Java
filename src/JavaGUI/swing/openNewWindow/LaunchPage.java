package JavaGUI.swing.openNewWindow;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LaunchPage implements ActionListener {
    JFrame f = new JFrame("Launch Page");
    JButton b = new JButton("click me");

    LaunchPage(){
        b.setBounds(150,150,100,50);
        b.addActionListener(this);
        f.add(b);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setSize(420,420);
        f.setLayout(null);
        f.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == b){
            f.dispose();
            new NewWindow();
        }
    }
}
