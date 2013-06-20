public class Household {

    int numberOfOccupants;
    double income;

    public Household(){

        numberOfOccupants = 1;
        income = 0.0;

    }

    public Household(int numberOfOccupants){

        this.numberOfOccupants = numberOfOccupants;
        income = 0.0;

    }

    public Household(int numberOfOccupants, double income){

        this.numberOfOccupants = numberOfOccupants;
        this.income = income;

    }

    public int getNumberOfOccupants() {
        return numberOfOccupants;
    }

    public void setNumberOfOccupants(int numberOfOccupants) {
        this.numberOfOccupants = numberOfOccupants;
    }

    public double getIncome() {
        return income;
    }

    public void setIncome(double income) {
        this.income = income;
    }
}
