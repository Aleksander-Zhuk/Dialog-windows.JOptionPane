package Two_windows;

import javax.swing.*;
public class TwoWindows {
    public static void main(String[] args) {
        new Myframe();
    }
}
class Myframe extends JFrame {
    Myframe () {
        setTitle("Two windows");
        setSize(60,60);
        setLocation(500, 350);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        String input = JOptionPane.showInputDialog("Please enter your name: ");
        JOptionPane.showMessageDialog(null, "You entered a name:  " + input);
    }
}