/**
 * Created with IntelliJ IDEA.
 * User: wole
 * Date: 2013/05/22
 * Time: 4:01 PM
 * To change this template use File | Settings | File Templates.
 */
class Variable {
    public static void main(String[] args){
        String firstLine;
        int hour, minute, percentage;

        hour = 11; minute = 59;
        percentage = (minute * 100) / 60;
        firstLine = "Hello, again!";

        System.out.print("The value of firstLine is ");
        System.out.println(firstLine);
        System.out.print("The current time is ");
        System.out.print(hour);
        System.out.print(":");
        System.out.print(minute);
        System.out.println(".");
    }
}
