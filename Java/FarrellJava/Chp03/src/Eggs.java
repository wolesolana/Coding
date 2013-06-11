import java.util.Scanner;

public class Eggs {
    public static void main(String[] args){
        int numberOfEggs;

        Scanner eggNumber = new Scanner(System.in);

        System.out.print("Enter the number of eggs ");
        numberOfEggs = eggNumber.nextInt();

        eggsInDozens(numberOfEggs);

    }

    private static void eggsInDozens(int numberOfEggs) {
        System.out.println("You have " + (numberOfEggs / 12) +
                " dozen eggs with " + (numberOfEggs % 12) + " remaining.");
    }
}
