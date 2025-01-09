package JavaGUI.swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class textField extends JFrame implements ActionListener {
    // JTextField - A GUI textbox component that can be used to add, set, or get text.
    JButton b;
    JTextField txt;
    textField(){
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        b = new JButton("Click me");
        b.addActionListener(this);

        txt = new JTextField();
        txt.setPreferredSize(new Dimension(250,40));
        txt.setFont(new Font("Consolas", Font.PLAIN, 35));
        txt.setForeground(new Color(0x00FF00));
        txt.setBackground(Color.BLACK);
        txt.setCaretColor(Color.WHITE);
        txt.setText("username");

        add(b);
        add(txt);
        pack();
        setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == b){
            System.out.println("welcome " + txt.getText());
            b.setEnabled(false);
            txt.setEditable(false);
        }
    }
    public static void main(String[] args) {
        new textField();
    }
}
