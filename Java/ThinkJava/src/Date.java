/**
 * Created with IntelliJ IDEA.
 * User: wole
 * Date: 2013/05/22
 * Time: 5:08 PM
 * To change this template use File | Settings | File Templates.
 */
class Date {

    public static void main(String[] args){

        String day, month;
        int date, year;

        day = "Wednesday"; month = "May";
        date = 22; year = 2013;

        System.out.println("American format: ");
        System.out.println(day + ", " + month + " " + date + ", " + year + ".");


        System.out.println("European format: ");
        System.out.println(day + ", " + date + " " + month +  ", " + year + ".");

    }
}
