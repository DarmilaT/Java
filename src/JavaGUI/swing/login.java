package JavaGUI.swing;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class login {
    private JPanel panelLogin;
    private JLabel LabelUserName;
    private JTextField txtUserName;
    private JLabel labelPassword;
    private JTextField txtPassword;
    private JButton buttonSubmit;
    private JButton buttonReset;

    public login() {
        txtPassword.setToolTipText("password");
        buttonSubmit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String userName = txtUserName.getText();
                // To show dialog box
                JOptionPane.showMessageDialog(buttonSubmit,"Hello "+userName+"!");
            }
        });

        buttonReset.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtUserName.setText("");
                txtPassword.setText("");
            }
        });
    }
    public static void main(String[] args){
        JFrame f = new JFrame();
        f.setTitle("log in");
        f.setContentPane(new login().panelLogin);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
        f.setSize(300,300);
        f.setResizable(false);
    }
}
