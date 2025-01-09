package JavaGUI.swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class buttonFrame extends JFrame implements ActionListener {
    JButton button;
    JLabel label;
    buttonFrame(){
        ImageIcon icon1 = new ImageIcon("icon1.jpg");
        icon1 = new ImageIcon(icon1.getImage().getScaledInstance(50,50, Image.SCALE_SMOOTH));

        label = new JLabel();
        label.setBounds(200,250,200,200);
        label.setIcon(icon1);
        label.setVisible(false);

        button = new JButton();
        button.setBounds(150,100,200,100);
        button.addActionListener(this);
        //without implement actionListener we can use this lamda
        //button.addActionListener(e -> System.out.println("Darmi"));
        button.setText("Button");
        button.setFocusable(false);
        button.setIcon(icon1);
        button.setHorizontalTextPosition(JButton.CENTER);
        button.setVerticalTextPosition(JButton.BOTTOM);
        button.setFont(new Font("Comic Sans", Font.BOLD,25));
        button.setIconTextGap(5);
        button.setForeground(Color.black);
        button.setBackground(Color.cyan);
        button.setBorder(BorderFactory.createLineBorder(Color.red));

        this.setVisible(true);
        this.setLayout(null);
        this.setSize(500,500);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.add(button);
        this.add(label);

    }
    @Override
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==button){
            //System.out.println("Darmila");
            //button.setEnabled(false);
            label.setVisible(true);
        }
    }

    public static void main(String[] args){
        new buttonFrame();
    }
}
