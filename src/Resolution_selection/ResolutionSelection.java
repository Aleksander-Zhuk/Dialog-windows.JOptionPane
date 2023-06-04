package Resolution_selection;

import javax.swing.*;

public class ResolutionSelection {
    public static void main(String[] args) {
        ScreenResolutionDialog scren = new ScreenResolutionDialog();
        JFrame frame = new JFrame();
        frame.setSize(ScreenResolutionDialog.width,ScreenResolutionDialog.height);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
class ScreenResolutionDialog {
    String[] options = {"640x480", "800x600", "1024x768", "1280x1024"};
    public static int width;
    public static int height;
    ScreenResolutionDialog () {
        JComboBox<String> comboBox = new JComboBox<>(options);
        int result = JOptionPane.showConfirmDialog(null, comboBox, "Select screen resolution",
                JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE);
        if (result == JOptionPane.OK_OPTION) {
            String selectedResolution = (String) comboBox.getSelectedItem();
            String[] parts = selectedResolution.split("x");
            width = Integer.parseInt(parts[0]);
            height = Integer.parseInt(parts[1]);
        }
    }
}