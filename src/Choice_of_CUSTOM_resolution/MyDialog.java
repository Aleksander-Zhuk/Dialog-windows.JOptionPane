package Choice_of_CUSTOM_resolution;

import javax.swing.*;
import java.awt.*;

public class MyDialog {
    public static void main(String[] args) {
        new MyDialogWindows();
        JFrame frame = new JFrame();
        frame.setSize(MyDialogWindows.sizeX, MyDialogWindows.sizeY);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
class MyDialogWindows extends JOptionPane {
    public static int sizeX, sizeY;
        MyDialogWindows () {
        JRadioButton rb1 = new JRadioButton("200x150");
        JRadioButton rb2 = new JRadioButton("400x300");
        JRadioButton rb3 = new JRadioButton("800x600");
        JRadioButton rb4 = new JRadioButton("1024x768");
        JRadioButton rb5 = new JRadioButton("1280x1024");
        JRadioButton rb6 = new JRadioButton("1600x1024");

        ButtonGroup group = new ButtonGroup();
        group.add(rb1);
        group.add(rb2);
        group.add(rb3);
        group.add(rb4);
        group.add(rb5);
        group.add(rb6);

        JPanel panel = new JPanel(new GridLayout(0, 1));
        panel.add(rb1);
        panel.add(rb2);
        panel.add(rb3);
        panel.add(rb4);
        panel.add(rb5);
        panel.add(rb6);

        ImageIcon iconInfo = new ImageIcon("src/Choice_of_CUSTOM_resolution/info.png");

        int result = JOptionPane.showOptionDialog(
                null,
                panel,
                "Выберите опцию",
                JOptionPane.OK_CANCEL_OPTION,
                JOptionPane.PLAIN_MESSAGE,
                iconInfo,
                new Object[]{"Ok", "Отмена"},
                "ОК");
        if (result == JOptionPane.OK_OPTION) {
            if (rb1.isSelected()) {
                sizeX = 200;
                sizeY = 150;
            }
            else
                if (rb2.isSelected()) {
                    sizeX = 400;
                    sizeY = 300;
                }
                else
                    if (rb3.isSelected()) {
                        sizeX = 800;
                        sizeY = 600;
                    }
                    else
                        if (rb4.isSelected()) {
                            sizeX = 1024;
                            sizeY = 768;
                        }
                        else
                            if (rb5.isSelected()) {
                                sizeX = 1280;
                                sizeY = 1024;
                            }
                            else
                                if (rb6.isSelected()) {
                                    sizeX = 1600;
                                    sizeY = 1024;
                                }
        }
        else System.exit(0);
    }
}
