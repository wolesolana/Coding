public class Commission {

    public static void computeCommission(double sales, double commissionRate){

        double commission = sales * commissionRate;

        System.out.println("Commission with rate given as a percentage is R " + commission);

    }

    public static void computeCommission(double sales, int commissionRate){

        double commission = sales * commissionRate / 100;

        System.out.println("Commission with rate given as a whole number is R" + commission);

    }

    public static void computeCommission(double sales){

        double commission = sales * 0.075;

        System.out.println("Commission with rate taken as 7.5% is R" + commission);
    }

    public static void main(String[] args){

        computeCommission(100.5, 0.075);
        computeCommission(100.5, 7.5);
        computeCommission(100.5);

    }


}
