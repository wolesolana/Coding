public class TestHousehold {

    public static void main(String[] args){

        Household smallHouse = new Household();

        System.out.println("Initial income and household size for first home:");
        System.out.println(smallHouse.getNumberOfOccupants());
        System.out.println(smallHouse.getIncome());

        smallHouse.setNumberOfOccupants(2);
        smallHouse.setIncome(55000);

        System.out.println("Final income and household size for first home:");
        System.out.println(smallHouse.getNumberOfOccupants());
        System.out.println(smallHouse.getIncome());

        Household midHouse = new Household(5);

        System.out.println("Initial income and household size for second home:");
        System.out.println(midHouse.getNumberOfOccupants());
        System.out.println(midHouse.getIncome());

        Household largeHouse = new Household(10, 400000);
        System.out.println("Initial income and household size for third home:");
        System.out.println(largeHouse.getNumberOfOccupants());
        System.out.println(largeHouse.getIncome());


    }
}
