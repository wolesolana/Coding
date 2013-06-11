import java.text.DecimalFormat;
import java.util.Scanner;

public class Interest {
    public static void main(String[] args){
        double initialInvestment;
        final double INTEREST_RATE = 0.05;

        Scanner userInput = new Scanner(System.in);

        System.out.print("How much do you want to invest? ");
        initialInvestment = userInput.nextDouble();

        System.out.println("Your interest after a year at 5% interest rate is "
                + calculateInterest(initialInvestment, INTEREST_RATE));

    }

    private static String calculateInterest(double initialInvestment, double INTEREST_RATE) {
        DecimalFormat twoDecimalAnswer = new DecimalFormat("#.00");
        return twoDecimalAnswer.format(initialInvestment * INTEREST_RATE);
    }
}
