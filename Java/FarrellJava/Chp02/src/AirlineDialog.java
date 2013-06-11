import javax.swing.*;

public class AirlineDialog {
    public static void main(String[] args){

        int selection = JOptionPane.showConfirmDialog(null,
                "Do you want to upgrade to first calss?");

        boolean isYes = (selection == JOptionPane.YES_OPTION);

        JOptionPane.showMessageDialog(null,
                "You responded " + isYes);
    }
}
