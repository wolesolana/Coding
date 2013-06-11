public class Pizza {
    private String pizzaToppings;
    private int pizzaDiameter;
    private double pizzaPrice;

    public String getPizzaToppings(){
        return pizzaToppings;
    }

    public void setPizzaToppings(String toppings){
        pizzaToppings = toppings;

    }

    public int getPizzaDiameter(){
        return pizzaDiameter;
    }

    public void setPizzaDiameter(int diameter){
        pizzaDiameter = diameter;
    }

    public double getPizzaPrice(){
        return pizzaPrice;
    }

    public void setPizzaPrice(double price){
        pizzaPrice = price;
    }
}
