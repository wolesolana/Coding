import javax.swing.*;

public class HelloNameDialog {
    public static void main(String[] args){
        String result = JOptionPane.showInputDialog(null, "What is your name?");
        JOptionPane.showMessageDialog(null, "Hello," + result + "!");
    }
}
