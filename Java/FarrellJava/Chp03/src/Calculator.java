import java.text.DecimalFormat;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args){
        double originalPrice, salesCommission, salesDiscount;

        Scanner userInput = new Scanner(System.in);

        System.out.print("Enter the original price ");
        originalPrice = userInput.nextDouble();

        System.out.print("Enter the sales commission as a decimal ");
        salesCommission = userInput.nextDouble();

        System.out.print("Enter the sales discount as a decimal ");
        salesDiscount = userInput.nextDouble();

        System.out.println("Your final price is " + finalPrice(originalPrice, salesCommission, salesDiscount));


    }

    public static String finalPrice(double originalPrice, double salesCommission, double salesDiscount) {
        DecimalFormat twoDecimalAnswer = new DecimalFormat("#.00");
        return twoDecimalAnswer.format(((1 + salesCommission) * originalPrice) * (1 - salesDiscount));
    }
}

