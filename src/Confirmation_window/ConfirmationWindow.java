package Confirmation_window;

import javax.swing.*;

public class ConfirmationWindow {
    public static void main(String[] args) {
        new Myframe();
    }
}
class Myframe extends JFrame {
    ImageIcon icon = new ImageIcon("src/Confirmation_window/java.png");
    ImageIcon icon2 = new ImageIcon("src/Confirmation_window/paithon.png");
    Myframe (){
        setTitle("Ответь на вопросы");
        setSize(60,60);
        setLocation(420,220);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        Object[] options = {"Ответ ДА",
                "Ответ НЕТ"};
        int n = JOptionPane.showOptionDialog(null,"Нравится вам язык программирования \"Java\"","Два ответа",
                JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE,
                icon,options,options[0]);
        int m = JOptionPane.showConfirmDialog(null,"Возможно вам нравится язык программирования \"Python\"","Два ответа",
                JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE,icon2);
        if(n == JOptionPane.YES_OPTION){
            JOptionPane.showMessageDialog(null,"Это коуто, изучайте его дальше.","Ответ на вопрос про \"Java\"",
                    JOptionPane.INFORMATION_MESSAGE,icon);
        }
        else {
            JOptionPane.showMessageDialog(null,"Очень жаль.","Ответ на вопрос про \"Java\"",
                    JOptionPane.INFORMATION_MESSAGE,icon);
        }
        if (m == JOptionPane.YES_OPTION){
            JOptionPane.showMessageDialog(null, "Это сейчас один из популярных языков","Ответ на вопрос про \"Python\"",
                    JOptionPane.INFORMATION_MESSAGE,icon2);
        }
        else {
            JOptionPane.showMessageDialog(null, "Ну вам на выбор еще есть много языков","Ответ на вопрос про \"Python\"",
                    JOptionPane.INFORMATION_MESSAGE,icon2);
        }
    }
}