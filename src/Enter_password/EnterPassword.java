package Enter_password;

import javax.swing.*;
import java.awt.*;

import static Enter_password.EnterPassword.icon1;
import static Enter_password.EnterPassword.icon2;

public class EnterPassword {
    public static ImageIcon icon1 = new ImageIcon("src/Enter_password/reg.png");
    public static ImageIcon icon2 = new ImageIcon("src/Enter_password/smailg.png");
    public static void main(String[] args) {
        new FirstWindow();
        new SecondWindow();
        new ThirdWindow();
    }
}
class  FirstWindow extends JOptionPane {
    Object[] options = {"Ответ ДА","Ответ НЕТ"};
    FirstWindow () {
        int n = JOptionPane.showOptionDialog(null,
                new String[] {
                        "Привет.",
                        "Хочеш пройти регестрацию?"},
                "Регистрация нового пользователя.",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.INFORMATION_MESSAGE,
                icon1,
                options,
                options[0]);
        if (n == JOptionPane.YES_OPTION) {}
        else {
            JOptionPane.showMessageDialog(null,
                    "Нам очень жаль.",
                    "Рестрицая отменена.",
                    JOptionPane.INFORMATION_MESSAGE,
                    icon2);
            System.exit(0);
        }
    }
}
class SecondWindow extends JOptionPane {
    public static String login;
    private String[] messages = {
            "Введите ваш логин:",
            "(больше 5 символов и не содержать пробелов)"};
    private String[] messages2 = {
            "Вы ввели логин не верно:",
            "введите ваш логин:",
            "(больше 5 символов и не содержать пробелов)"};
    SecondWindow () {
        login = (String) JOptionPane.showInputDialog(
                null,
                messages,
                "Регистрация",
                JOptionPane.INFORMATION_MESSAGE,
                icon1,
                null,
                "");
        if (login == null){
            JOptionPane.showMessageDialog(null,
                    "Нам очень жаль.",
                    "Рестрицая отменена.",
                    JOptionPane.INFORMATION_MESSAGE,
                    icon2);
            System.exit(0);
        }
        else {
            if (login.length() > 5 & !login.contains(" ")) {}
            else {
                new SecondWindow(messages2);
            }
        }
    }
    SecondWindow (String[] messages2){
        this.messages2 = messages2;
        login = (String) JOptionPane.showInputDialog(
                null,
                messages2,
                "Регистрация",
                JOptionPane.INFORMATION_MESSAGE,
                icon1,
                null,
                "");
        if (login == null){
            JOptionPane.showMessageDialog(null,
                    "Нам очень жаль.",
                    "Рестрицая отменена.",
                    JOptionPane.INFORMATION_MESSAGE,
                    icon2);
            System.exit(0);
        }
        else {
            if (login.length() > 5 & !login.contains(" ")) {}
            else {
                new SecondWindow(messages2);
            }
        }
    }
}
class ThirdWindow extends JOptionPane {
    static int  check = 3;
    ImageIcon icon3 = new ImageIcon("src/Enter_password/key.png");
    ImageIcon iconError = new ImageIcon("src/Enter_password/error.png");
    ImageIcon iconOk = new ImageIcon("src/Enter_password/ok.png");
    String passwordString;
    String[] stringsMessang = new String[]{
            "Прароль должен содержать:",
            "хотябы одну букву латинского алфавита",
            "хотябы одну цифру",
            "без пробелов"};
    ThirdWindow () {
        JLabel[] labels = new JLabel[3];
        labels[0] = new JLabel("Введите пароль:");
        labels[1] = new JLabel("(больше 8 символов, не содержать пробелов,");
        labels[2] = new JLabel(" хотя бы одна цифра и одна буква)");
        JPasswordField passwordField = new JPasswordField();
        Object[] options = { "OK", "Cancel" };
        int option = JOptionPane.showOptionDialog(null,
                new Object[] { labels, passwordField },
                "Регистрация",
                JOptionPane.OK_CANCEL_OPTION,
                JOptionPane.QUESTION_MESSAGE,
                icon3,
                options,
                options[0]);
        passwordString = new String(passwordField.getPassword());
        if (option == JOptionPane.OK_OPTION) {
        if (passwordString.length() > 7){
            if (!passwordString.matches("^(?=.*[a-zA-Z])(?=.*\\d)(?!.*\\s).*$")) {
                JOptionPane.showMessageDialog(null,
                        stringsMessang,
                        "Ошибка",
                        JOptionPane.ERROR_MESSAGE,
                        iconError);
                new ThirdWindow();
            }
            else {
                new ThirdWindow(passwordString);
            }
        }
        else {
            JOptionPane.showMessageDialog(null,
                    "Пароль должен содержать 8 и более символов",
                    "Ошибка",
                    JOptionPane.ERROR_MESSAGE,
                    iconError);
            new ThirdWindow();
        }
        }
        else {
            JOptionPane.showMessageDialog(null,
                    "Нам очень жаль.",
                    "Рестрицая отменена.",
                    JOptionPane.INFORMATION_MESSAGE,
                    icon2);
            System.exit(0);
        }
    }
    ThirdWindow (String passwordS) {

        this.passwordString = passwordS;
        JLabel[] labels = new JLabel[2];
        labels[0] = new JLabel("Повторите пароль");
        labels[1] = new JLabel("(увас осталось "+check+" попытки)");
        JPasswordField passwordField = new JPasswordField();
        Object[] options = { "OK", "Cancel" };
        int option = JOptionPane.showOptionDialog(null,
                new Object[] { labels, passwordField },
                "Регистрация",
                JOptionPane.OK_CANCEL_OPTION,
                JOptionPane.QUESTION_MESSAGE,
                icon3,
                options,
                options[0]);
        if (option == JOptionPane.OK_OPTION){
          String stirngChek = new String(passwordField.getPassword());
          if (stirngChek.equals(passwordString)){
              JOptionPane.showMessageDialog(null,
                      "Регистрация успешно завершина!",
                      "Регистрация",
                      JOptionPane.ERROR_MESSAGE,
                      iconOk);
          }
          else {
              check--;
              if (check!=0) new ThirdWindow(passwordString);
              else {
                  JOptionPane.showMessageDialog(null,
                          "Нам очень жаль.",
                          "Рестрицая отменена.",
                          JOptionPane.INFORMATION_MESSAGE,
                          icon2);
                  System.exit(0);
              }
          }
        }
        else {
            JOptionPane.showMessageDialog(null,
                    "Нам очень жаль.",
                    "Рестрицая отменена.",
                    JOptionPane.INFORMATION_MESSAGE,
                    icon2);
            System.exit(0);
        }
    }
}
