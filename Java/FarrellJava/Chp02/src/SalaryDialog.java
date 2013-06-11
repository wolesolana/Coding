import javax.swing.*;

public class SalaryDialog {
    public static void main(String[] args){

        String wageString, dependentsString;
        final double HOURS_IN_WEEK = 37.5;

        wageString = JOptionPane.showInputDialog(null,
                "Enter employee's hourly wage", "Salary dialog 1",
                JOptionPane.INFORMATION_MESSAGE);

        double weeklyPay = Double.parseDouble(wageString) * HOURS_IN_WEEK;

        dependentsString = JOptionPane.showInputDialog(null,
                "How many dependents?", "Salary dialog 2",
                JOptionPane.QUESTION_MESSAGE);

        int dependents = Integer.parseInt(dependentsString);
        JOptionPane.showMessageDialog(null, "Weekly salary is $" +
                weeklyPay + "\nDeductions will be made for " +
                dependents + " dependents");
    }
}
