package JavaGUI.swing;

import javax.swing.*;

public class optionPane {
    // JOptionPane makes it easy to pop up a standard dialog box
    // that prompts users for a value or informs them of something.
    public static void main(String[] args) {
//        JOptionPane.showMessageDialog(null, "Plain Message", "title", JOptionPane.PLAIN_MESSAGE);
//        JOptionPane.showMessageDialog(null, "Error Message", "title", JOptionPane.ERROR_MESSAGE);
//        JOptionPane.showMessageDialog(null, "Question Message", "title", JOptionPane.QUESTION_MESSAGE);
//        JOptionPane.showMessageDialog(null, "WarningS Message", "title", JOptionPane.WARNING_MESSAGE, );

        //int answer = JOptionPane.showConfirmDialog(null,"Do you even code?", "title", JOptionPane.YES_NO_CANCEL_OPTION);
        // yes - 0
        // no - 1
        // cancel - 2
        // x - -1

        //String name = JOptionPane.showInputDialog("Your name : ");
        //System.out.println(name);

        String[] responses = {"No, You are awesome", "Thank you"};
        JOptionPane.showOptionDialog(null,"You are awesome", "Secret", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE, null, responses, 0);

    }
}
