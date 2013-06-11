public class Numbers {
    public static void main(String[] args){
        int numberOne = 23;
        int numberTwo = 46;

        sum(numberOne, numberTwo); difference(numberOne, numberTwo);
    }

    public static void difference(int numberOne, int numberTwo) {
        System.out.println("The difference between the numbers is " + (numberOne - numberTwo));
    }

    public static void sum(int numberOne, int numberTwo) {
        System.out.println("The sum of the numbers is " + (numberOne + numberTwo));
    }

    public static int product(int numberOne, int numberTwo){
        return numberOne * numberTwo;
    }
}
