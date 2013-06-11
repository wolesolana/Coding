public class CarInsurancePolicy {

    private int policyNumber;
    private int numPayments;
    private String residentCity;

    public CarInsurancePolicy(int policyNumber, int numPayments, String residentCity){

        this.policyNumber = policyNumber;
        this.numPayments = numPayments;
        this.residentCity = residentCity;
    }

    public CarInsurancePolicy(int policyNumber, int numPayments){
        this(policyNumber, numPayments, "Mayfield");
    }

    public CarInsurancePolicy(int policyNumber){
        this(policyNumber, 2);
    }

    public void display()
    {
        System.out.println("Policy #" + policyNumber + ". " +
                numPayments + " payments annually. Driver resides in " +
                residentCity + ".");
    }
}
