public class TestMethods {
    public static void main(String[] args){
        int i1 = 3;
        int i2 = 6;

        displayIt(i1); displayItTimesTwo(i1); displayItPlusOneHundred(i1);

        displayIt(i2); displayItTimesTwo(i2); displayItPlusOneHundred(i2);

    }

    public static void displayIt(int value){
        System.out.println("Your number is " + value);
    }

    public static void displayItTimesTwo(int value){
        System.out.println("Your number doubled is " + (value * 2));
    }

    public static void displayItPlusOneHundred(int value){
        System.out.println("Your other number plus a hundred is " + (value + 100));
    }
}
