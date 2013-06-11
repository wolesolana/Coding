import javax.swing.*;

import static java.lang.Math.random;

public class RandomGuess {
    public static void main(String[] args){
        JOptionPane.showMessageDialog(null, "Think of a number between 1 and 10 and see if your guess matches mine!");
        JOptionPane.showMessageDialog(null, "The number is " + (1 + (int)(random() * 10)));
    }
}
