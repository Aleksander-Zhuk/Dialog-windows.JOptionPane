package Simple_Window;

import javax.swing.*;
import java.awt.event.*;

public class SimpleWindow {
    public static void main(String[] args) {
        new Myframe();
    }
}
class Myframe extends JFrame {
    Myframe (){
        setTitle("My frame");
       setSize(600,600);
       setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       addKeyListener(new KeyAdapter() {
           @Override
           public void keyPressed(KeyEvent e) {
               super.keyPressed(e);
               if (e.getKeyCode() == KeyEvent.VK_SPACE)
                   JOptionPane.showMessageDialog(null,"Aleksander-Zhuk","My name",JOptionPane.INFORMATION_MESSAGE);
           }
       });
       setVisible(true);
   }
}